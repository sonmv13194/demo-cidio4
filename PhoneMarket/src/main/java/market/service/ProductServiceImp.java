package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import market.model.Product;
import market.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	ProductRepository productrepo;
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}
	@Override
	public Product findId(int idproduct) {
		// TODO Auto-generated method stub
		return productrepo.findOne(idproduct);
	}
	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productrepo.findByName(name);
	}
	@Override
	public List<Product> findByNameLike(String name) {
		// TODO Auto-generated method stub
		return productrepo.findByNameLike("%"+name+"%");
	}
	@Override
	public Product addToCart(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}
	@Override
	public Product addnew(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}
	@Override
	public void delete(int idproduct) {
		// TODO Auto-generated method stub
			productrepo.delete(idproduct);;
		
	}
	@Override
	public List<Product> getAllASC() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new Sort(Direction.ASC, "price"));
	}
	@Override
	public List<Product> getAllDESC() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new Sort(Direction.DESC,"price"));
	}
	@Override
	public List<Product> getAllNewest() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new PageRequest(0, 4,Direction.DESC,"idproduct")).getContent();
	}
	@Override
	public Page<Product> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return productrepo.findAll(pageable);
	}

}
