package com.repository;

public interface AccountRepository {
	void createAccount(String accholdername);
	double getBalance(String accholdername );
	void updateBalance(String accholdername,double amnt);

}
