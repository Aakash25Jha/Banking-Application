package com.aakash.bankingapplication.controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aakash.bankingapplication.model.OpenAccount;
@RestController
public class MainController {

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
		mav.addObject("acc", openAccount);
		return mav;
		
	}
}
