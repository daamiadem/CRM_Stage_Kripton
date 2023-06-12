package kripton.kriptonbackcrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kripton.kriptonbackcrm.models.Account;
import kripton.kriptonbackcrm.models.Profile;
import kripton.kriptonbackcrm.repos.ProfilRepo;
import kripton.kriptonbackcrm.services.OpportunityService;


@RestController
@RequestMapping(value = "/template")
public class ProfilController {
 
	@Autowired
	private ProfilRepo profilrepo;
	@Autowired
	private OpportunityService opportunityservice;
	  @PostMapping("addprofil")
	  public void addNewprofil(@RequestBody Profile profil) {
		  profilrepo.save(profil);
	  }
	  @PostMapping("assignprofiltoopportunity/{opportunityid}")
	  public void Assignprofiltoopportunity(@RequestBody Profile profil, @PathVariable("opportunityid") String opportunityid){
		  opportunityservice.Assignprofiltoopportunity(profil, opportunityid);
	  }
}
