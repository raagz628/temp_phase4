package com.cg.wallet.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class URIController {

	@RequestMapping("/")
	String index()
	{
		return "index";
	}
	@RequestMapping("/login")
	String loginPage()
	{
		return "loginPage";
	}
	@RequestMapping("/register")
	String registerPage()
	{
		return "registerPage";
	}
}