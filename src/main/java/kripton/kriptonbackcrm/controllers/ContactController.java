package kripton.kriptonbackcrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kripton.kriptonbackcrm.services.*;
import kripton.kriptonbackcrm.models.*;
//import lombok.RequiredArgsConstructor;
@CrossOrigin(origins="**")
@RestController
//@RequiredArgsConstructor
@RequestMapping("/api")
public class ContactController {
	 @Autowired
	 private ContactService ContactService ; 
	 
	 
	 @GetMapping("FindAll")
	   public List<Contact> getContact(){
	   return ContactService.FindAllContact(); 
	   
	   }
	 
	 @PutMapping("/AddContact/{AccountId}")
	   @ResponseBody
	   public void assigncontacttocompte(@RequestBody Contact newContact, @PathVariable("AccountId") String AccountId){
		   
		   ContactService.assigncontacttocompte(newContact, AccountId); 
		   
	   }
	 
	 
	 @DeleteMapping("/RemoveContact/{ContactId}")
	   public void RemoveContact(@PathVariable("ContactId") String ContactId){
		    ContactService.DeleteContact(ContactId);
	   }
	 
	 @PutMapping("/updateContact/{ContactId}")
	   @ResponseBody
	   public Contact modifyClient(@RequestBody Contact newContact, @PathVariable("ContactId") String ContactId ){
		   return  ContactService.UpdateContact(newContact, ContactId); 
		   
		   
	   }
	 
	 
	 	@GetMapping("GetContact/{idContact}")
	 	public void getContact(@PathVariable("idContact") String idContact) {
	 		ContactService.getcontact(idContact); 
	 	}
}
