package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Detail;
import market.repository.DetailRepository;
@Service
public class DetailServiceImp implements DetailService {
	@Autowired
	DetailRepository detailrepo;
	@Override
	public List<Detail> getAll() {
		// TODO Auto-generated method stub
		return detailrepo.findAll();
	}
	@Override
	public Detail findId(int iddetail) {
		// TODO Auto-generated method stub
		return detailrepo.findOne(iddetail);
	}
	@Override
	public Detail create(Detail detail) {
		// TODO Auto-generated method stub
		return detailrepo.save(detail);
	}
	

}
