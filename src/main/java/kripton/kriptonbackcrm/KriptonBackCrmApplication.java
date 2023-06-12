package kripton.kriptonbackcrm;

import kripton.kriptonbackcrm.models.Role;
import kripton.kriptonbackcrm.models.User;
import kripton.kriptonbackcrm.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

@SpringBootApplication
public class KriptonBackCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(KriptonBackCrmApplication.class, args);
    }
   
   @Bean
    CommandLineRunner runner(UserService userService){
        return args -> {
//          userService.saveRole(new Role(null,"ROLE_USER"));          
//          userService.saveRole(new Role(null,"ROLE_MANAGER"));
          //userService.saveRole(new Role("1","ROLE_ADMIN"));
//          userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
        	//userService.saveUser(new User("achref","achref","1234"));
//          userService.saveUser(new User(null,"wissem","ahmed","1234",new ArrayList<>()));
//          userService.saveUser(new User(null,"aymen","hassen","1234",new ArrayList<>()));
//
//          userService.assignRoleToUser("alaa","ROLE_MANAGER");
//          userService.assignRoleToUser("alaa","ROLE_ADMIN");
//          userService.assignRoleToUser("ahmed","ROLE_MANAGER");
          //userService.assignRoleToUser("achref","ROLE_ADMIN");
//
        };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder() ;
    }

}

