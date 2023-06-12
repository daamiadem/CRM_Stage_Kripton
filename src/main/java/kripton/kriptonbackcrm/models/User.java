package kripton.kriptonbackcrm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name ;
    private String userName ;
    private String password ;
    @DBRef
    private Collection<Role> roles =new ArrayList<>() ;


}
