package kripton.kriptonbackcrm.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import kripton.kriptonbackcrm.models.Account;

public interface AccountRepo extends MongoRepository<Account,String> {


}

