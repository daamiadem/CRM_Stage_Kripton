package kripton.kriptonbackcrm.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kripton.kriptonbackcrm.models.Contact;
import kripton.kriptonbackcrm.models.Opportunity;
import kripton.kriptonbackcrm.models.Profile;
import kripton.kriptonbackcrm.repos.OpportunityRepo;
import kripton.kriptonbackcrm.repos.ProfilRepo;
import kripton.kriptonbackcrm.services.OpportunityService;

@RestController
@RequestMapping(value = "/template")
public class OpportunityController {

	
	@Autowired
	private OpportunityRepo oppr;
	@Autowired
	private OpportunityService oppserv;
	  @PostMapping("addopportunity")
	  public void addNewOpportunity(@RequestBody Opportunity opportunity) {
		  oppr.save(opportunity);
	  }
	  @PostMapping("assignopportunity/{idcontact}")
	  public void assignopportunity(@RequestBody Opportunity opportunity, @PathVariable("idcontact") String contactid)  {
		  oppserv.Assigncontacttopportunity(opportunity, contactid);
	  }
	  @GetMapping("getcontatcfromopp/{idoppo}")
	  public Contact getcontatcfromopp(@PathVariable("idoppo") String idOppo)  {
		  return oppserv.getcontactofopportunity(idOppo);
	  }
}
