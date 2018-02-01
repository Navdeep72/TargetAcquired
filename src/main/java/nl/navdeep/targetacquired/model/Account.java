package nl.navdeep.targetacquired.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int age;
	
	@Column
	private String eMail;
	
	@OneToOne(mappedBy = "account")
	private AccountCredential accountCredentials;


	public AccountCredential getAccountCredentials() {
		return accountCredentials;
	}

	public void setAccountCredentials(AccountCredential accountCredentials) {
		this.accountCredentials = accountCredentials;
	}

	public Account() {}
	
	public Account(Long id, String firstName, String lastName, int age) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);

		
		getId();
		getFirstName();
		getLastName();
		getAge();

		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	

}
