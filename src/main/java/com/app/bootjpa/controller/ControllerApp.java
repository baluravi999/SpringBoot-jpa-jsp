package com.app.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.bootjpa.dao.CustomerDao;
import com.app.bootjpa.model.Customer;


@Controller
public class ControllerApp {
	@Autowired
	CustomerDao custdao;
	
	
	
@RequestMapping("/")
	public String home(){
		
		return "view";
	}
@RequestMapping("/addCust")
public String addCust( Customer cust){
	custdao.save(cust);
	
	return "view";
	
}

@RequestMapping("/getCust")
public String getCustDetailes(@RequestParam("custId") int id,Model model){
	Customer cu=custdao.findById(id).orElse(new Customer());
	model.addAttribute("key", cu);
	
	return "data";
}
	
}
