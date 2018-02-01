package nl.navdeep.targetacquired.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class AccountCredential {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String userName;

	@Column
	private String password;
	
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "account_id")
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountCredential() {}
	
	public AccountCredential(Long id, String userName, String password) {
		setId(id);
		setUserName(userName);
		setPassword(password);
		
		getId();
		getUserName();
		getPassword();
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
