package kripton.kriptonbackcrm.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import kripton.kriptonbackcrm.models.Profile;
import kripton.kriptonbackcrm.models.Role;

public interface ProfilRepo extends MongoRepository<Profile,String> {

}