package com.repository;

import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionRepository{

	@Override
	public void recordTransaction(String accholdername, double amnt) {
		System.out.println("Transaction Recorded for "+accholdername +" : "+amnt);
		
	}

}
