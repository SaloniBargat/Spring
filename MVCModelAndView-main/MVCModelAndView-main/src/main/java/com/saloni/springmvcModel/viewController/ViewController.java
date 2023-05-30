package com.saloni.springmvcModel.viewController;

//import javax.naming.Binding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ViewController {
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	@RequestMapping(path="/processform" ,method=RequestMethod.POST)
	public ModelAndView handleForm(@ModelAttribute("user") User user, BindingResult result)
	{
		ModelAndView model = new ModelAndView("success");
		System.out.print(user);
		return model;
	}
}


/*
@Controller
public class ViewController {
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("message","Contact us info");
	}
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	
	@RequestMapping(path="/processform" ,method=RequestMethod.POST)
	public String handleForm(@RequestParam("userEmail") String userEmail,@RequestParam("userName") String userName,
			@RequestParam("userPassword") String password, Model model)
	{
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(password);
		
		model.addAttribute("user",user);
		return "success";
	}
}
*/
