package nl.navdeep.targetacquired.services;

import java.util.List;

import nl.navdeep.targetacquired.model.AccountCredential;

public interface IAccountCredentialService {
	
	public List<AccountCredential> findAll();
	
	void create(AccountCredential accountCredential);

}
