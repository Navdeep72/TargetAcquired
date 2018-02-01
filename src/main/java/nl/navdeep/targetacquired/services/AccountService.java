package nl.navdeep.targetacquired.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.navdeep.targetacquired.dao.IAccountDAO;
import nl.navdeep.targetacquired.model.Account;

@Service
public class AccountService implements IAccountService{
	
	@Autowired
	private IAccountDAO iAccountDAO;

	@Override
	public void create(Account account) {
		this.iAccountDAO.save(account);
	}

	@Override
	public List<Account> findAll() {
		return this.iAccountDAO.findAll();
	}


}
