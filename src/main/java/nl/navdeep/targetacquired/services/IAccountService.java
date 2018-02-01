package nl.navdeep.targetacquired.services;

import java.util.List;

import nl.navdeep.targetacquired.model.Account;

public interface IAccountService {
	
	public List<Account> findAll();
	
	void create(Account account);
	

}
