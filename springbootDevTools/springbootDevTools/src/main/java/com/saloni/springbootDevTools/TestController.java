package com.saloni.springbootDevTools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
			int a=8;
			int b=6;
			return "this is just testing sum of a and b is " +(a+b);
	}

}
