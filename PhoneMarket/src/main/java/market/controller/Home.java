package market.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import market.model.Address;
import market.model.Order;
//import market.model.Cart;
import market.model.CartItem;
import market.model.Category;
import market.model.Customer;
import market.model.Detail;
import market.model.Event;
import market.model.Location;
import market.model.Product;
import market.model.Supplier;
import market.repository.EventRepository;
import market.service.AddressService;
import market.service.CartItemService;
import market.service.CartService;
import market.service.CategoryService;
import market.service.CustomerService;
import market.service.DetailService;
import market.service.EventService;
import market.service.LocationService;
import market.service.ProductService;
import market.service.SupplierService;

@Controller
@RequestMapping("/")
public class Home {
	@Autowired
	CategoryService categoryservice;
	@Autowired
	ProductService productservice;
	@Autowired
	SupplierService suppliservice;
	@Autowired
	LocationService locationservice;
	@Autowired
	CartItemService cartitemservice;
	@Autowired
	AddressService addressservice;
	@Autowired
	CustomerService customerservice;
	@Autowired
	DetailService detailservice;
	@Autowired
	CartService cartservice;
	@Autowired
	EventService eventservice;
	@RequestMapping(value="/home")
	public String getAll(Model model){
		List<Product> listproduct= productservice.getAll();
		List<Category> listcategory=categoryservice.getAll();
		List<Supplier> supplier= suppliservice.getAll();	
		List<Location> location=locationservice.getAll();	
		/*List<Detail> detail= detailservice.getAll();*/
		List<Product> productnew=productservice.getAllNewest();
		List<Event> listevent= eventservice.getAllEvent();
		model.addAttribute("Lproduct", listproduct);
		model.addAttribute("newest", productnew);
		model.addAttribute("Lcate", listcategory);
		model.addAttribute("Lsup", supplier);
		model.addAttribute("location", location);
	/*	model.addAttribute("detail", detail);*/
		model.addAttribute("event", listevent);
		return "index";
	}
	@RequestMapping(value="/category")
	public String getAllCategory(Model model){
		List<Category> listcategory= categoryservice.getAll();	
		model.addAttribute("Lcate", listcategory);
		return "index";
	}
	@RequestMapping(value="/cate")
	public String findCate(@RequestParam int idcategory,Model model){
		Category cate= categoryservice.findId(idcategory);
		model.addAttribute("find", cate);
		List<Category> categ= categoryservice.getAll();
		model.addAttribute("Lcate", categ);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		return "product";
	}
	@RequestMapping(value="/search")
	public String find(@RequestParam String name,Model model){
		List<Product> product= productservice.findByNameLike(name);
		model.addAttribute("Lproduct", product);
		List<Category> listcategory= categoryservice.getAll();	
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		List<Location> location= locationservice.getAll();
		model.addAttribute("location", location);
		return "index";
	}
	@RequestMapping(value="/supplier")
	public String getSupply(Model model){
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		return "index";
	}
	@RequestMapping(value="/supply")
	public String findSup(@RequestParam int idsupplier,Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		Supplier sup= suppliservice.findId(idsupplier);
		model.addAttribute("findsup", sup);	
		return "productsup";
	}
	@RequestMapping(value="/detail")
	public String getProduct(@RequestParam int idproduct, Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		Product product= productservice.findId(idproduct);
		model.addAttribute("pdetail", product);
		return "product-detail";
	}
	@RequestMapping(value="/location")
	public String getLocation(@RequestParam int idlocation,Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		List<Location> loca=locationservice.getAll();
		model.addAttribute("loca", loca);
		Location location=locationservice.findId(idlocation);
		model.addAttribute("location", location);
		return "productlocation";
	}
/*	@RequestMapping(value="/addcart",method=RequestMethod.GET)
	public String addCart(@RequestParam int idproduct,Model model,HttpSession session){
		Product product= productservice.findId(idproduct);
		if(session.getAttribute("cart")==null){
			List<CartItem> list= new ArrayList<CartItem>();
			list.add(new CartItem(product, 1));
			
			session.setAttribute("cart", list);
		}else{
			List<CartItem> list= (List<CartItem>) session.getAttribute("cart");
			int index=existCart(idproduct, session);
			if(index==-1){
				list.add(new CartItem(product, 1));
			}
			else{
				int quantity=list.get(index).getQuantity()+1;
				list.get(index).setQuantity(quantity);
			}
			session.setAttribute("cart", list);
		}
		return "phonecart";
	}
	public int existCart(int idproduct,HttpSession session){
		List<CartItem> list= (List<CartItem>) session.getAttribute("cart");
		for(int i=0;i<list.size();i++)
			if(list.get(i).getProduct().getIdproduct()==idproduct)
				return i;
			return -1;
		
	}
	@RequestMapping(value="/deletecart")
	public String deleteCart(@RequestParam int idproduct,HttpSession session){
		List<CartItem> list= (List<CartItem>) session.getAttribute("cart");
		int index=existCart(idproduct, session);
		list.remove(index);
		return "phonecart";
	}*/
	/*@RequestMapping(value="/deletecart")
	public String deletecart(@RequestParam int idcartitem){
		cartitemservice.delete(idcartitem);
		return "phonecart";
	}*/
	@RequestMapping(value="/addcart")
	public String addCart(@RequestParam int idproduct,Model model){
		Product product=productservice.findId(idproduct);
		List<CartItem> listcart= new ArrayList<CartItem>();
		for(int i=0;i<listcart.size();i++){
			if(product.getIdproduct()==listcart.get(i).getProduct().getIdproduct()){
				CartItem cartitem= new CartItem();
				cartitem.setProduct(product);
				cartitem.setQuantity(listcart.get(i).getQuantity()+1);
				cartitem.setTotalprice((int) (product.getPrice()*cartitem.getQuantity()));
				cartitemservice.add(cartitem);
				List<CartItem> cart= cartitemservice.getAll();
				model.addAttribute("cart", cart);
			}
		}
				CartItem cartitem= new CartItem();
				cartitem.setProduct(product);
				cartitem.setQuantity(1);
				cartitem.setTotalprice((int) (product.getPrice()*cartitem.getQuantity()));
				cartitemservice.add(cartitem);
				List<CartItem> cart= cartitemservice.getAll();
				model.addAttribute("cart", cart);
			
		
		return "phonecart";
	}
	@RequestMapping(value="/checkout",method=RequestMethod.POST)
	public String checkout(){
		return "checkout";
	}
	/*@RequestMapping(value="/saveorder",method=RequestMethod.POST)
	public String order(HttpSession session,HttpServletRequest request){
		List<CartItem> list= (List<CartItem>) session.getAttribute("cart");
				Order order= new Order();
				order.setCustomername(request.getParameter("customername").toString());
				order.setAddress(request.getParameter("address").toString());
				order.setCreatedate(new Date());
				order.setName("new order");
				cartservice.create(order);
					CartItem item= new CartItem();
					Detail detail= new Detail();
					detail.setIdcart(order.getIdcart());
					detail.setProdut(item.getProduct());
					detail.setPrice(item.getProduct().getPrice());
					detail.setQuantity(item.getQuantity());
					detailservice.create(detail);
				
			
			session.removeAttribute("cart");
		
	
			return "thankcheckout";
		}
		
	
	*/
	@RequestMapping(value="/addorder",method=RequestMethod.GET)
	public String signupcust(Model model){
		model.addAttribute("newcus", new Customer());
		return "signup";
	}
	@RequestMapping(value="/order")
	public String signup(@ModelAttribute Customer customer){
		customerservice.create(customer);
		return "redirect:/listcust";
	}
	@RequestMapping(value="/productasc")
	public String getAllASC(@RequestParam int iddetail,Model model){
		Detail detail=detailservice.findId(iddetail);
		model.addAttribute("detailpr", detail);
		List<Category> listcategory= categoryservice.getAll();	
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		return "productasc";
	}
	@RequestMapping(value="/viewcart")
	public String viewCart(Model model){
		List<CartItem> list= cartitemservice.getAll();
		model.addAttribute("cart", list);
		return "phonecart";
	}
	
}
