package com.cesar.hellospring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

		@RequestMapping("/")
		public String hello() {
			return "hello ninjas";
		}
		
		@RequestMapping("/cool")
		public String coolRoute() {
			return "This is cool";
		}
		
		@RequestMapping("/hello")
		public String heyNinja() {
			return "Yooooooo";
		}
		
//		query parameters 
		
		@RequestMapping("/soemthing/search")
		public String something(@RequestParam(value = "x")String someSearchVar) {
			System.out.println(someSearchVar);
			return String.format("you have searched for %s", someSearchVar);
		}
		@RequestMapping("/find/{var1}")
		public String find1(@PathVariable("var1") String var1) {
			System.out.println(var1);
			return "find whatever" + var1;
		}
		
		@RequestMapping("/kill/{var2}")
		public String find(@PathVariable("var2") String var2) {
			System.out.println(var2);
			return "find whatever" + var2;
		}
}      



