package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
