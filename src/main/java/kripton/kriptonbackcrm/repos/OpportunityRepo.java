package kripton.kriptonbackcrm.repos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import kripton.kriptonbackcrm.models.Opportunity;



public interface OpportunityRepo extends MongoRepository<Opportunity,String> {

}
