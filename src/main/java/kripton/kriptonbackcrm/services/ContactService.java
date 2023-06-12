package kripton.kriptonbackcrm.services;

import java.util.List;

import kripton.kriptonbackcrm.models.Contact;

public interface ContactService {
//	public Contact addContact(Contact newContact ); 
	public List<Contact> FindAllContact(); 
	public Contact UpdateContact(Contact newContact , String IdContact); 
	public void DeleteContact(String IdContact);
	public void assigncontacttocompte(Contact newContact, String accountid) ;
	public Contact getcontact(String contactid); 
	
	
}
