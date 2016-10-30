package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Address;
import market.repository.AddressRepository;
@Service
public class AddressServiceImp implements AddressService {
	@Autowired
	AddressRepository addressrepo;
	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return addressrepo.findAll();
	}

}
