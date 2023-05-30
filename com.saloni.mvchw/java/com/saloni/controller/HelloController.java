package com.saloni.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is a home url");
		model.addAttribute("name","Saloni Bargat");
		model.addAttribute("id",10);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Shruti");
		friends.add("Vaishanavi");
		friends.add("Dipika");
		
		model.addAttribute("f",friends);
		
		
		return "hello";
	}
	
}
