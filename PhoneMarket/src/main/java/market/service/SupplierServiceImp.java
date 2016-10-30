package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Supplier;
import market.repository.SupplierRepository;
@Service
public class SupplierServiceImp implements SupplierService {
	@Autowired
	SupplierRepository supplierrepository;
	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return supplierrepository.findAll();
	}
	@Override
	public Supplier findId(int idsupplier) {
		// TODO Auto-generated method stub
		return supplierrepository.findOne(idsupplier);
	}

}
