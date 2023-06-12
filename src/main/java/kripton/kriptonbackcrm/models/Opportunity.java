package kripton.kriptonbackcrm.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "opportunity")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Opportunity implements Serializable{
	
	@Id
	private String id ;
    private String opportunityName ;
    private String description ;
    private float amount ;
    private OpportunityStatus status ;
    private OpportunityType opportunityType ;
    private Country country ;
    @DBRef
    private Contact contact ;
    @DBRef
    private List<Profile> profils = new ArrayList<Profile>();
}
