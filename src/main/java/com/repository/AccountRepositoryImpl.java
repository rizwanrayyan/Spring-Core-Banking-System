package com.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class AccountRepositoryImpl implements AccountRepository  {
	private final Map<String, Double> account=new HashMap<>();

	@Override
	public void createAccount(String accholdername) {
		account.put(accholdername, 0.0);
		System.out.println("Account created for "+accholdername);
		
		
	}

	@Override
	public double getBalance(String accholdername) {
		// TODO Auto-generated met
		return account.getOrDefault(accholdername, 0.0);
	}

	@Override
	public void updateBalance(String accholdername, double amnt) {
		account.put(accholdername, amnt);
		System.out.println("AccountUpdated "+accholdername+" with "+amnt+" and the current balance is "+getBalance(accholdername));
		
	}
	

}
