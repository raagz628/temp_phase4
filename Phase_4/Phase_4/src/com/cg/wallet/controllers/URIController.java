package com.cg.wallet.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.wallet.beans.Customer;



@Controller
public class URIController {


	@RequestMapping("/sh")
	String show()
	{
		return "show";
	}
	@RequestMapping("/wit")
	String withdraw()
	{
		return "withdraw";
	}
	@RequestMapping("/dep")
	String deposit()
	{
		return "deposit";
	}
	@RequestMapping("/trans")
	String transfer()
	{
		return "transfer";
	}
	
	@RequestMapping("/register")
	String registerPage()
	{
		return "registerPage";
	}
	
	@RequestMapping("/")
	String menuPage()
	{
		return "menuPage";
	}
	@RequestMapping("/menu")
	String menu()
	{
		return "menuPage";
	}
	
	@RequestMapping("/showbalance")
	public String getShowBalancePage() {
		return "showBalancePage";
	}
	
	@RequestMapping("/fundtransfer")
	public String getFundTransferPage() {
		return "fundTransferPage";
	}
	
	@RequestMapping("/deposit")
	public String getDepositAmountPage() {
		return "depositAmountPage";
	}
	
	@RequestMapping("/withdraw")
	public String getWithdrawAmountPage() {
		return "withdrawAmountPage";
	}

	@ModelAttribute("customer1")
	public Customer getCustomer()
	{
	
		return new Customer();
	}
}