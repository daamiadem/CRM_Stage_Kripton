package kripton.kriptonbackcrm.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "profile")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Profile {

	
    private String firstName ;
    private String lastName ;
    private String formation ;
    private int experience ;
    private String skills ;
    private String cv ;
    @DBRef
    private Opportunity opportunity ;

}
