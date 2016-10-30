package market.service;

import java.util.List;

import market.model.Category;

public interface CategoryService {
public List<Category> getAll();
public Category create(Category category);
public List<Category> findByName(String name);
public List<Category> findByParent(int id);
public Category findId(int idcategory);
}
