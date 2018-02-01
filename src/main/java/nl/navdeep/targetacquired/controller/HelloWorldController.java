package nl.navdeep.targetacquired.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.navdeep.targetacquired.model.Account;
import nl.navdeep.targetacquired.model.AccountCredential;
import nl.navdeep.targetacquired.services.IAccountCredentialService;
import nl.navdeep.targetacquired.services.IAccountService;

@Controller
public class HelloWorldController {
	
	@Autowired
	private IAccountService iAccountService;
	
	@Autowired
	private IAccountCredentialService iAccountCredentialService;
	
	@RequestMapping("/home")
	public String homePage(Model home) {
		
	home.addAttribute("name", "HomePage");

	
	return "home";
	}
	
	@RequestMapping("/login")
	public String logIn(Model login) {
		
	login.addAttribute("name", "Log In");

	
	return "login";
	}
	
	@RequestMapping("/form")
	public String formMaker(Model model) {
		
	model.addAttribute("name", "Form");
	model.addAttribute("account", this.iAccountService.findAll());
	model.addAttribute("accountCredential", this.iAccountCredentialService.findAll());
	
	return "web";
		
	}
	@PostMapping
	public String createNewPerson(HttpServletRequest request) {
		
		// lees formulier uit
		Account account = new Account();
		AccountCredential accountCredential = new AccountCredential();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String ageAsString = request.getParameter("age");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String eMail = request.getParameter("eMail");
		
		// maakt een persoon
		
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setAge(Integer.parseInt(ageAsString));
		account.seteMail(eMail);		
		
		accountCredential.setUserName(userName);
		accountCredential.setPassword(password);
		accountCredential.setAccount(account);
		
		// slaat gebruiker op
		this.iAccountService.create(account);
		this.iAccountCredentialService.create(accountCredential);
		
		return "redirect:/form";
	}	
		

}
