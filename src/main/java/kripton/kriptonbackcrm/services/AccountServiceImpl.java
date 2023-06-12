package kripton.kriptonbackcrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kripton.kriptonbackcrm.models.Account;
import kripton.kriptonbackcrm.models.AddressType;
import kripton.kriptonbackcrm.repos.AccountRepo;
import kripton.kriptonbackcrm.repos.AdresseRepo;
import kripton.kriptonbackcrm.repos.ContactRepo;

@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	private AccountRepo accountrepo ;
	@Autowired 
	private AdresseRepo adressrepo ;
	@Autowired 
	private  ContactRepo contactrepo ;
	@Override
	public void assignadressetoaccount(Account acc, String adresse) {
		
		acc.setAddress(adressrepo.findById(adresse).get());
		accountrepo.save(acc);
		
	}


}
