package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class MyCOntroler {
	@GetMapping("/info")
    public String getProductInfo() {
        return "Product Service: Laptop";
    }
}
