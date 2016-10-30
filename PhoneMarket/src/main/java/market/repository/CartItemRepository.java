package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
public CartItem findByProduct(int idproduct);
}
