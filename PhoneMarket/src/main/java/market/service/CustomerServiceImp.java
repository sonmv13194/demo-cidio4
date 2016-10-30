package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Customer;
import market.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	CustomerRepository customerrepo;
	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepo.save(customer);
	}
	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}
	@Override
	public void delete(int idcustomer) {
		// TODO Auto-generated method stub
		customerrepo.delete(idcustomer);;
	}
	@Override
	public Customer findId(int idcustomer) {
		// TODO Auto-generated method stub
		return customerrepo.findOne(idcustomer);
	}
	@Override
	public Customer login(String username, String password) {
		// TODO Auto-generated method stub
		return customerrepo.findByUsernameAndPassword(username, password);
	}
	@Override
	public Customer findByUsername(String username) {
		// TODO Auto-generated method stub
		return customerrepo.findByUsername(username);
	}

}
