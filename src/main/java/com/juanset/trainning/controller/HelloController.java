package com.juanset.trainning.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	private static final Logger LOGGER = Logger.getLogger(HelloController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		LOGGER.debug("Starting hello world");
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "hello";
	}

}
