package com.aakash.bankingapplication.controller;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aakash.bankingapplication.model.OpenAccount;
import com.aakash.bankingapplication.service.AccountService;
@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping(value="/")
	public ModelAndView home() {
		ModelAndView mav= new ModelAndView("welcome");
		return mav;
	}
	@GetMapping(value="/openAcc")
	public ModelAndView openAcc() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("openAccount", new OpenAccount());
		mav.setViewName("openAcc");
		return mav;
	}
	@PostMapping(value="/openAcc")
	public ModelAndView submitOpenAcc(@ModelAttribute OpenAccount openAccount,BindingResult binding) {
		ModelAndView mav= new ModelAndView("user-data");
		Random random=new Random();
		String prefix="AC";
		for(int accno=0;accno<14;accno++) {
			int digits=random.nextInt(10);
			prefix += Integer.toString(digits);
		}
		openAccount.setAccno(prefix);
		OpenAccount mavOpenAccount=accountService.openAccount(openAccount);
		mav.addObject("acc", mavOpenAccount);
		return mav;	
	}
}
