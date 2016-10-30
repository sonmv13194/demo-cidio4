package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.CartItem;
import market.repository.CartItemRepository;
@Service
public class CartItemServiceImp implements CartItemService {
	@Autowired
	CartItemRepository cartitemrepo;
	@Override
	public CartItem add(CartItem cartItem) {
		// TODO Auto-generated method stub
		return cartitemrepo.save(cartItem);
	}
	@Override
	public List<CartItem> getAll() {
		// TODO Auto-generated method stub
		return cartitemrepo.findAll();
	}
	@Override
	public CartItem findId(int idcartitem) {
		// TODO Auto-generated method stub
		return cartitemrepo.findOne(idcartitem);
	}
	@Override
	public void delete(int idcartitem) {
		// TODO Auto-generated method stub
		cartitemrepo.delete(idcartitem);
	}

}
