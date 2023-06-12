package kripton.kriptonbackcrm.repos;

import kripton.kriptonbackcrm.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends MongoRepository<Role,String> {

    Role findByName(String name);
}
