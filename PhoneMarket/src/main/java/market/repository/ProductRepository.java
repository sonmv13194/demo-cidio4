package market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
public List<Product> findByName(String name);
public List<Product> findByNameLike(String name);
}
