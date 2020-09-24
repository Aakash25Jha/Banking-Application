package com.aakash.bankingapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aakash.bankingapplication.model.OpenAccount;
import com.aakash.bankingapplication.repository.AccountRepository;

@Service("accountService")
public class AccountService {

	AccountRepository accRepo;
	
	@Autowired
	public AccountService(AccountRepository accountRepository) {
	this.accRepo = accountRepository;
	}
	
	public OpenAccount openAccount(OpenAccount openAcc) {
		return accRepo.save(openAcc);
	}
	
}
