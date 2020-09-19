package com.aakash.bankingapplication.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aakash.bankingapplication.model.OpenAccount;

public interface AccountRepository extends JpaRepository<OpenAccount, Integer> {

}
