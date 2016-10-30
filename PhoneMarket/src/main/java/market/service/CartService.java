package market.service;

import market.model.Order;
import market.model.Customer;

public interface CartService {
Order create(Order cart);
public Customer login(String name,String password);
}
