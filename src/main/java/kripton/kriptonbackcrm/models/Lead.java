package kripton.kriptonbackcrm.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "lead")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Lead {
	

    private String firstName ;
    private String lastName ;
    private String email ;
    private Number phone ;
    private LeadSource leadSource;


}
