package nl.navdeep.targetacquired.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.navdeep.targetacquired.dao.IAccountCredentialDAO;
import nl.navdeep.targetacquired.model.AccountCredential;

@Service
public class AccountCredentialService implements IAccountCredentialService{
	
	@Autowired
	private IAccountCredentialDAO iAccountCredentialDAO;

	@Override
	public void create(AccountCredential accountCredential) {
		this.iAccountCredentialDAO.save(accountCredential);
	}

	@Override
	public List<AccountCredential> findAll() {
		return this.iAccountCredentialDAO.findAll();
	}
}
