package market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import market.model.Customer;
import market.model.Product;
import market.service.CategoryService;
import market.service.CustomerService;
import market.service.ProductService;
import market.service.SupplierService;

@Controller
public class Admin {
	@Autowired
	CustomerService customerservice;
	@Autowired
	ProductService productservice;
	@Autowired 
	CategoryService categoryservice;
	@Autowired
	SupplierService supplierservice;
	@RequestMapping(value="/admin")
	public String admin(){
		return "admin";
	}
	@RequestMapping(value="/listcust")
	public String getCustomer(Model model){
		List<Customer> list= customerservice.getAll();
		model.addAttribute("listcust", list);
		return "listcustomer";
	}
	@RequestMapping(value="/deletecust")
	public String deletecust(@RequestParam int idcustomer,Model model){
		if(customerservice.findId(idcustomer)!=null){
			customerservice.delete(idcustomer);
		}else{
			model.addAttribute("message", "Không tìm thấy dữ liệu");
		}
		return "redirect:/listcust";
	}
	@RequestMapping(value="/addnewproduct")
	public String newProduct(Model model){
		model.addAttribute("newproduct", new Product());
		return "addproduct";
	}
	@RequestMapping(value="/addproduct")
	public String addProduct(@ModelAttribute Product product,Model model){
		productservice.addnew(product);
		return "redirect:/listproduct";
	}
	public String findCustomer(@RequestParam int idcustomer,Model model){
		if(customerservice.findId(idcustomer)!=null){
			Customer customer= new Customer();
			customer=customerservice.findId(idcustomer);
			model.addAttribute("custorder", customer);
			return "customerorder";
		}
		else{
			return "direct:/admin";
		}
	}
	@RequestMapping(value="/listproduct")
	public String getProduct(Model model){
		List<Product> list= productservice.getAll();
		model.addAttribute("listp", list);
		return "manageproduct";
	}
	@RequestMapping(value="/deleteproduct")
	public String deleteproduct(@RequestParam int idproduct,Model model){
		if(productservice.findId(idproduct)!=null){
			productservice.delete(idproduct);
			List<Product> list= productservice.getAll();
			model.addAttribute("listp", list);
			return "manageproduct";
		}
		else{
			model.addAttribute("message", "không tìm thấy dữ liệu");
		}
		return "manageproduct";
	}
	@RequestMapping(value="/{pagenumber}")
	public String page(@PathVariable int pagenumber,Model model){
		List<Product> list=productservice.getAll();
		Page<Product> pageProduct= productservice.findAll(new PageRequest(0, 3));
		List<Product> stackProduct=pageProduct.getContent();
		int totalPage=pageProduct.getTotalPages();
		model.addAttribute("totalPage",totalPage );
		model.addAttribute("Lproduct", list);
		model.addAttribute("stackProduct", stackProduct);
		return "index";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model){
		return "login";
	}
	@RequestMapping(value="/checklogin",method=RequestMethod.POST)
	public String checklogin(@RequestParam String username,@RequestParam String password,Model model){
		Customer customer= customerservice.login(username, password);
		if(customer!=null){
		model.addAttribute("cust", customer);
		return "thankcheckout";}
		else{
			model.addAttribute("message", "username or password invalid");
			return "login";
		}
	}
	
	
	
}
