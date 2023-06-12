package kripton.kriptonbackcrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kripton.kriptonbackcrm.models.Account;
import kripton.kriptonbackcrm.models.Contact;
import kripton.kriptonbackcrm.repos.AccountRepo;
import kripton.kriptonbackcrm.repos.ContactRepo;
import kripton.kriptonbackcrm.services.AccountService;
import kripton.kriptonbackcrm.services.ContactService;

@RestController
@RequestMapping(value = "/template")
public class AccountController {
	
	@Autowired
	private AccountService accountservice;
	@Autowired
	private ContactService contactservice;
	@Autowired
	private AccountRepo accountrepo;
	  @PostMapping("addaccount")
	  public void addAccountandassignadress(@RequestBody Account account) {
		  accountrepo.save(account);
	  }
	
	  @GetMapping("getaccount/{accountid}")
	  public Account getaccount(@PathVariable("accountid") String accountid) {
		  return  accountrepo.findById(accountid).get();
	  }
	  @PostMapping("assigncontacttocompte/{accountid}")
	  public void assigncontacttocompte(@RequestBody Contact contact,@PathVariable("accountid") String accountid){
		  contactservice.assigncontacttocompte(contact, accountid);
	  }
//	  @GetMapping("getcontactofcompte/{accountid}/{contactid}")
//	  public Contact getcontactofcompte(@PathVariable("contactid") String contactid,@PathVariable("accountid") String accountid){
//		  return contactservice.getcontactofcompte(accountid, contactid);
//	  }
}
