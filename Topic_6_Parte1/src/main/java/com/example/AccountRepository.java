package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AccountRepository extends CrudRepository<Account, Long>{

	List<Account> Login (String username, String password);
	
	List<Account> findByUsername(String username);
	
	List<Account> findByName(String name);
}
