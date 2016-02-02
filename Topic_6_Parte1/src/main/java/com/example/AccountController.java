package com.example;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
	
	  @RequestMapping("/login")
	  @ResponseBody
	  public String login(String username, String password) {
	    try {
	    	
	      if ( accountRepository.Login(username, password).size() == 1   )
	      {
	    	  return "entro con exito";
	      }
	      else
	      {
	    	  return "NO entro con exito";
	      }
	      
	    }
	    catch (Exception ex) {
	      return "Error login user: " + ex.toString();
	    }
	  }
	  
	  
	  @RequestMapping("/create")
	  @ResponseBody
	  public String create(String username, String password, String name) {
		  
	    try {
	    	accountRepository.save(new Account(username, password, name ));
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created";
	  }
	
	  @RequestMapping("/find-by-name")
	  @ResponseBody
	  public String findByName(String name) {
	    try {
	    	
	      List<Product> list = productRepository.findByName(name);
	      
	      String result = "";
	      
	      for ( int i = 0 ; i <= list.size(); i++)
	      {
	    	  result.concat(list.toString());
	    	  result.concat("/n");
	      }
	      
	      return result;
	    }
	    catch (Exception ex) {
	      return "Error find product";
	    }
	  }
	
	
	  @RequestMapping("/find-by-category")
	  @ResponseBody
	  public String findByCategory(String category) {
	    try {
	    	
	      List<Product> list = productRepository.findByCategory(category);
	      
	      String result = "";
	      
	      for ( int i = 0 ; i <= list.size(); i++)
	      {
	    	  result.concat(list.toString());
	    	  result.concat("/n");
	      }
	      
	      return result;
	    }
	    catch (Exception ex) {
	      return "Error find product";
	    }
	  }
	  
	  
	  
	  @RequestMapping("/add-product")
	  @ResponseBody
	  public String addProduct(Long account, Long product, int purchaseNumber) 
	  {
	    try {
	    
	      Order order = new Order( account, product, purchaseNumber );
	      orderRepository.save(order);
	      
	      return order.toString();
	      
	    }
	    catch (Exception ex) {
	      return "Error add-product";
	    }
	  }
	  
	  
	  @RequestMapping("/delete-product")
	  @ResponseBody
	  public String deleteProduct(Long account, Long product, int purchaseNumber) 
	  {
	    try {
	    
	      Order order = new Order( account, product, purchaseNumber );
	      orderRepository.delete(order);
	      
	      return "producto eliminado";
	      
	    }
	    catch (Exception ex) {
	      return "Error add-product";
	    }
	  }
	  
	  
	  @RequestMapping("/buy-products")
	  @ResponseBody
	  public String buyProducts(Long account, int purchaseNumber, int creditCard) 
	  {
	    try {
	    
	    	List<Order> list = orderRepository.findByPurchaseNumber(purchaseNumber);
	    	
	    	for ( int i = 0; i <= list.size() ; i ++ )
	    	{
	    		Order order = list.get(i);
	    		order.setCredit_Card(creditCard);
	    	}
	      
	      return "compra realizada";
	      
	    }
	    catch (Exception ex) {
	      return "Error al comprar producto";
	    }
	  }
	  
	  
	/**  
	@RequestMapping("/")
	@ResponseBody
	public String test() {

	    accountRepository.save(new Account("alber", "alber", "alberto ghibaudo" ));
	    
	    productRepository.save(new Product("TV", "20 pounds", 2000.00, "elec"));
	    productRepository.save(new Product("PC", "Pentium", 3000.00, "elec"));
		productRepository.save(new Product("Phone", "Red", 200.00, "elec"));
		
	    return "hello";
	}
	
	**/
	  
	  	@Autowired
		private AccountRepository accountRepository;
		
		@Autowired
		private ProductRepository productRepository;
		
		@Autowired
		private OrderRepository orderRepository;

}
