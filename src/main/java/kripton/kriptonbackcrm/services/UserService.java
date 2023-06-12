package kripton.kriptonbackcrm.services;

import kripton.kriptonbackcrm.models.User;
import kripton.kriptonbackcrm.models.Role;

import java.util.List;

public interface UserService {

    User saveUser (User user );
    Role saveRole (Role role);
    void assignRoleToUser (String userName,String roleName);
    User getUser (String username);
    List<User> getAllUsers();
 }
