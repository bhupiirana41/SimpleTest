package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarServiceController {

@RequestMapping("/")	
public String getName(){
	System.out.println("Heelooo");
	return "test";
}
	
}
