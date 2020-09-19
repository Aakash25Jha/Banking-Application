package com.aakash.bankingapplication.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aakash.bankingapplication.model.OpenAccount;
@RestController
public class MainController {

	@GetMapping(value="/")
	public String home() {
		return "welcome";
	}
	@GetMapping(value="/openAcc")
	public String openAcc() {
		return "openAcc";
	}
	@PostMapping(value="/openAcc")
	public ModelAndView submitOpenAcc(@ModelAttribute OpenAccount openAccount) {
		ModelAndView mav= new ModelAndView();
		mav.addObject("acc", openAccount);
		return mav;
		
	}
}
