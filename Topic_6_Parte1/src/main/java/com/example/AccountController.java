package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@RequestMapping("/")
	@ResponseBody
	public String test() {

	    accountRepository.save(new Account("alber", "alber", "alberto ghibaudo" ));
	    
	    productRepository.save(new Product("TV", "20 pounds", 2000.00, "elec"));
	    productRepository.save(new Product("PC", "Pentium", 3000.00, "elec"));
		productRepository.save(new Product("Phone", "Red", 200.00, "elec"));
		
	    return "hello";
	}
}
