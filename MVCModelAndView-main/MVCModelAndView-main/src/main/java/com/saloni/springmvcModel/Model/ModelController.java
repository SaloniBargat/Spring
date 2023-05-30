package com.saloni.springmvcModel.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("name","Rohit Sonwane");
		return "home";
	}
	
	//ModelAndView Demo
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public ModelAndView help() {
		
		//Creatinig ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		
//		Adding values to ModelAndView
		modelAndView.addObject("name", "Rohit Sonwane");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(34);
		list.add(85);
		modelAndView.addObject("marks", list);
		
		//Setting up the pag ename on which you have to show
		modelAndView.setViewName("about");
		System.out.print(modelAndView);
		return modelAndView;
	}
}
