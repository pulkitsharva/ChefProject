package com.spring.tutorial;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	private final static String CONSUMER_KEY = "CPHP67I0NKJiUiPprDYt1fq6b";
    private final static String CONSUMER_KEY_SECRET = "56s9rXUcqzhs9aMoL2kkEtECEb0N9sTZnotJE2qIDwn9FyTXYi";

    @RequestMapping("/hello")
	public ModelAndView helloWorld1(HttpServletRequest request,  HttpServletResponse response) {

		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("hello", "message", message);
	}
	
}