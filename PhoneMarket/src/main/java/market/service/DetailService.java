package market.service;

import java.util.List;

import market.model.Detail;

public interface DetailService {
public List<Detail> getAll();
Detail findId(int iddetail);
Detail create(Detail detail);

}
