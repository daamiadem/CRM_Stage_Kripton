package kripton.kriptonbackcrm.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "country")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Country {
	
	
	private String countryName ;
	private String currency;

}
