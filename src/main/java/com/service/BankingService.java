package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.repository.AccountRepository;
import com.repository.TransactionRepository;
@Component
public class BankingService {
private AccountRepository accoutnrepository;
private TransactionRepository transactionrepository;
private NotificationService notificationservice;
@Autowired
public BankingService(AccountRepository accountrepository,TransactionRepository transactionrepository,NotificationService notificationservice) {
	super();
	this.accoutnrepository=accountrepository;
	this.notificationservice=notificationservice;
	this.transactionrepository=transactionrepository;
}
public void createAccount(String accholdername) {
	accoutnrepository.createAccount(accholdername);
}
public void deposit (String accholderame,double amnt) {
	accoutnrepository.updateBalance(accholderame, amnt);
	transactionrepository.recordTransaction(accholderame, amnt);
	notificationservice.sendNotification(accholderame);
}
}
