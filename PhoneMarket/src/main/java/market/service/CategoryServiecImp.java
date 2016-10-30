package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Category;
import market.repository.CategoryRepository;
@Service
public class CategoryServiecImp implements CategoryService {
	@Autowired
	CategoryRepository categoryrepository;
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryrepository.findAll();
	}
	public Category create(Category category) {
		// TODO Auto-generated method stub
		return categoryrepository.save(category);
	}
	
	public List<Category> findByName(String name) {
		// TODO Auto-generated method stub
		return categoryrepository.findByName(name);
	}
	public List<Category> findByParent(int id) {
		// TODO Auto-generated method stub
		return categoryrepository.findByParent( id);
	}
	@Override
	public Category findId(int idcategory) {
		// TODO Auto-generated method stub
		return categoryrepository.findOne(idcategory);
	}
	

}
