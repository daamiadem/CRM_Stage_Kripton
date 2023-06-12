package kripton.kriptonbackcrm.services;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kripton.kriptonbackcrm.models.Account;
import kripton.kriptonbackcrm.models.Contact;
import kripton.kriptonbackcrm.models.Opportunity;
import kripton.kriptonbackcrm.models.Profile;
import kripton.kriptonbackcrm.repos.ContactRepo;
import kripton.kriptonbackcrm.repos.OpportunityRepo;
import kripton.kriptonbackcrm.repos.ProfilRepo;


@Service
public class OpportunityServiceImpl implements OpportunityService{

	
	@Autowired 
	private OpportunityRepo opprepo;
	@Autowired 
	private ContactRepo contactrepo;
	@Autowired 
	private ProfilRepo profilrepo;
	
	

	
	@Override
	public void Assigncontacttopportunity(Opportunity opp, String contactid) {
		
		Contact c = contactrepo.findById(contactid).get();
		System.out.print(c.toString());
		
		
		opp.setContact(c);
		opprepo.save(opp);
		
	}




	@Override
	public Contact getcontactofopportunity(String idopportuni) {
		return opprepo.findById(idopportuni).get().getContact();

	}




	@Override
	public void Assignprofiltoopportunity(Profile profil, String opportunityid) {
		profilrepo.save(profil);
		List<Profile>  profils= new ArrayList<Profile>();
		profils =opprepo.findById(opportunityid).get().getProfils();
		profils.add(profil);
		Opportunity opportunity = opprepo.findById(opportunityid).get();
		opportunity.setProfils(profils);
		opprepo.save(opportunity)	;
		
	}

}
