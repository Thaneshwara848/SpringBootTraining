package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MuControler {
	
	@GetMapping("/home")
	public String home() {
		
		return "<h1> Hi Wlecome to Home page </h1?>";
	}
	@GetMapping("/profile")
	public String profile() {
		
		return "<h1> Hi Wlecome to profile page </h1?>";
	}	
	
	@GetMapping("/setting")
	public String setting() {
		
		return "<h1> Hi Wlecome to setting page </h1?>";
	}
	@GetMapping("/imges")
	public String imges() {
		
		return "<h1> Hi Wlecome to imges page </h1?>";
	}
	
	
	
	
	

}
