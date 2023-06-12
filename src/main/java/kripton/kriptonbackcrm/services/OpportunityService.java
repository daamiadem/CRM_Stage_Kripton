package kripton.kriptonbackcrm.services;

import org.bson.types.ObjectId;

import kripton.kriptonbackcrm.models.Contact;
import kripton.kriptonbackcrm.models.Opportunity;
import kripton.kriptonbackcrm.models.Profile;

public interface OpportunityService {

	void Assignprofiltoopportunity(Profile profil , String opportunityid );
	void Assigncontacttopportunity(Opportunity opp , String contactid );
	Contact getcontactofopportunity(String idopportuni);

}
