package market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
Customer findByUsernameAndPassword(String username,String password);
Customer findByUsername(String username);
}
