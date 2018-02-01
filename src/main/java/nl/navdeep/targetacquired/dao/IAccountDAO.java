package nl.navdeep.targetacquired.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.navdeep.targetacquired.model.Account;

public interface IAccountDAO extends CrudRepository<Account, Long>{
	
	List<Account> findAll();
	

}
