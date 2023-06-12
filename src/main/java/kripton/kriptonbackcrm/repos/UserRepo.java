package kripton.kriptonbackcrm.repos;

import kripton.kriptonbackcrm.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository <User,String> {

    User findAppUserByUserName(String userName);
}
