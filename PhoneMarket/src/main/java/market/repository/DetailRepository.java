package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Detail;

public interface DetailRepository extends JpaRepository<Detail, Integer> {

}
