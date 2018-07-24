package com.cg.wallet.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.wallet.beans.Customer;
import com.cg.wallet.service.WalletService;
@Controller
public class WalletController {
	@Autowired(required=true)
	WalletService serviceObject;
	@RequestMapping(value="/createAccount",method=RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("customer1") Customer cust)
	{
	try {
		Customer temp=serviceObject.createAccount(cust.getName(), cust.getMobileNo(), cust.getWallet().getBalance());
	
		ModelAndView mnv=new ModelAndView("registerSuccess","successObject",temp);
		return mnv;
	} catch(Exception e)
	{
		e.printStackTrace();
	}
	return new ModelAndView("error");
	}
	@RequestMapping(value="/showBalance")
	public ModelAndView showBalance(@ModelAttribute("customer1") Customer cust) {
		try {
			Customer customer=serviceObject.showBalance(cust.getMobileNo());
			ModelAndView modelAndView = new ModelAndView("showBalanceSuccess", "successObject", customer);
			return modelAndView;
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ModelAndView("error");
	}
	
	@RequestMapping(value="/fundTransfer")
	public ModelAndView fundTransfer(@ModelAttribute("customer1") Customer cust) {
	try {
			Customer customer=serviceObject.fundTransfer(cust.getMobileNo(), cust.getName(), cust.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("fundTransferSuccess", "successObject", customer);
			return modelAndView;
	} catch(Exception e)
	{
		e.printStackTrace();
	}
	return new ModelAndView("error");
	}
	
	@RequestMapping(value="/depositAmount")
	public ModelAndView depositAmount(@ModelAttribute("customer1") Customer customer1) {
			try {
			Customer customer=serviceObject.depositAmount(customer1.getMobileNo(), customer1.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("depositAmountSuccess", "successObject", customer);
			return modelAndView;
			} catch(Exception e)
			{
				e.printStackTrace();
			}
			return new ModelAndView("error");
	}
	
	@RequestMapping(value="/withdrawAmount")
	public ModelAndView withdrawAmount(@ModelAttribute("customer1") Customer customer1) {
		try {
			Customer customer=serviceObject.withdrawAmount(customer1.getMobileNo(), customer1.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("withdrawAmountSuccess", "successObject", customer);
			return modelAndView;
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ModelAndView("error");
		
	}
}
