package market.service;

import java.util.List;

import market.model.Supplier;

public interface SupplierService {
public List<Supplier> getAll();
public Supplier findId(int idsupplier);
}
