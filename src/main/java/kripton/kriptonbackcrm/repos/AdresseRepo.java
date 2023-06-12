package kripton.kriptonbackcrm.repos;

import org.springframework.data.mongodb.repository.MongoRepository;


import kripton.kriptonbackcrm.models.AddressType;

public interface AdresseRepo extends MongoRepository<AddressType,String> {


}


