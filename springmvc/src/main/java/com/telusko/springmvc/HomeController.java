package com.telusko.springmvc;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.model.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
 	public void modelData(Model m)  {
 	m.addAttribute("name","Akash Khandelia");
 	}

 	@RequestMapping("/")
 	public String home(){
 		return "index";
 	}

 	// Post Mapping
 	@PostMapping(value="addAlien")
 	public String addAlien(@ModelAttribute Alien a){
 		return "result";
 	}
 	
 	// Get Mapping
 	@GetMapping("getAlien")
 	public String getAlien(Model m) {
 		List<Alien> aliens= Arrays.asList(new Alien(101,"Akash"), new Alien(102,"Khandelia"));
 		m.addAttribute("result",aliens);
 		return "showAlien";
 	}
 	
}
