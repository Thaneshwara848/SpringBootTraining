package com.example.demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {

	 @GetMapping("/public")
	  public String publicApi() {
	        return "This is a public API";
	    }

	  @GetMapping("/private")
	  public String privateApi() {
	        return "This is a private API - you are authenticated";
	  }
	  
	  @GetMapping("/home")
	  public String home() {
	        return "This is a Home is public  API";
	    }

	  @GetMapping("/profile")
	  public String profile() {
	        return "This is a private API - you are authenticated";
	  }
}
