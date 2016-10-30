package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Order;

public interface CartRepository extends JpaRepository<Order, Integer>{

}
