package market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Order;
import market.model.Customer;
import market.repository.CartRepository;

@Service
public class CartServiceImp implements CartService {
	@Autowired
	CartRepository cartrepo;
	
	@Override
	public Order create(Order cart) {
		// TODO Auto-generated method stub
		return cartrepo.save(cart);
	}

	@Override
	public Customer login(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
