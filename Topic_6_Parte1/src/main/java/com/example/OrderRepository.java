package com.example;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderRepository extends CrudRepository<Order, Long>{
	
	List<Product> findByPurchaseNumber(int purchaseNumber);

}