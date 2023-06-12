package kripton.kriptonbackcrm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kripton.kriptonbackcrm.models.Account;
import kripton.kriptonbackcrm.models.Contact;
import kripton.kriptonbackcrm.repos.AccountRepo;
import kripton.kriptonbackcrm.repos.ContactRepo;

@Service
//@RequiredArgsConstructor
@Transactional
//@Slf4j
public class ContactServiceImpl implements ContactService {

	 @Autowired
	 private ContactRepo ContactRepo ; 
	 @Autowired
		private AccountRepo accountrepo ;
	
//	@Override
//	public Contact addContact(Contact newContact) {
//		// TODO Auto-generated method stub
//		ContactRepo.save(newContact); 
//		return newContact;
//	}

	@Override
	public List<Contact> FindAllContact() {
		// TODO Auto-generated method stub
		return ContactRepo.findAll();
	}

	@Override
	public Contact UpdateContact(Contact newContact, String IdContact) {
		// TODO Auto-generated method stub
		Contact updatedContact = ContactRepo.findById(IdContact).get();
//		updatedContact.setAccount(newContact.getAccount());
		updatedContact.setEmail(newContact.getEmail());
		updatedContact.setFirstName(newContact.getFirstName());
		updatedContact.setLastName(newContact.getLastName());
		updatedContact.setLinkProfile(newContact.getLinkProfile());
		updatedContact.setPhone(newContact.getPhone());
		updatedContact.setPosition(newContact.getPosition());
		ContactRepo.save(updatedContact); 
		return updatedContact ;
	}

	@Override
	public void DeleteContact(String IdContact) {
		// TODO Auto-generated method stub

		ContactRepo.deleteById(IdContact);
		
	}
	
	
	@Override
	public void assigncontacttocompte(Contact newContact, String accountid) {
		// List<Chauffeur> chauffeurs = new ArrayList<Chauffeur>();
		/// List <Contact>contacts =  new ArrayList<Contact>();
		Account account = accountrepo.findById(accountid).get();
//		newContact.setAccount(account);
		ContactRepo.save(newContact); 
		List<Contact>  contacts= new ArrayList<Contact>();
		contacts =accountrepo.findById(accountid).get().getContacts();
		contacts.add(newContact);
		account.setContacts(contacts);
		accountrepo.save(account)	;
	}
	
	
	// get all information of Contact
	@Override
	public Contact getcontact(String contactid) {
		return ContactRepo.findById(contactid).get(); 
	}
		


}
