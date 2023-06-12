package kripton.kriptonbackcrm.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "addressType")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AddressType {
	
	private String street ;
	private String city ;
	private String postalCode ;
	private String country ;

}
