package kripton.kriptonbackcrm.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import kripton.kriptonbackcrm.models.Contact;

@Repository

public interface ContactRepo extends MongoRepository<Contact,String> {

}
