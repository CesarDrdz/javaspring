package com.cesar.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {
	@RequestMapping("/omikuji")
	public String index() {

		return "index.jsp";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
			HttpSession session,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
		@RequestParam(value="hoby") String hoby,
		@RequestParam(value="thing") String thing)
	{
	    
		// CODE TO PROCESS FORM ie. check email and password
		session.setAttribute("key1", city);
		session.setAttribute("key2", person);
		session.setAttribute("key3", hoby);
		session.setAttribute("key4", thing);
//		session.setAttribute("key5", password);
//		System.out.println("In 10 years, you will live in");
		System.out.println(city);
		System.out.println(person);
		System.out.println(hoby);
		System.out.println(thing);
	    return "redirect:/omikuji/results";
	}

	@RequestMapping("/omikuji/results")
	public String index2() {

		return "results.jsp";
	}
}
