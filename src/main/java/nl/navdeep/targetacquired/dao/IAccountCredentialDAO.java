package nl.navdeep.targetacquired.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.navdeep.targetacquired.model.AccountCredential;

public interface IAccountCredentialDAO extends CrudRepository<AccountCredential, Long>{
	List<AccountCredential> findAll();
	
}
