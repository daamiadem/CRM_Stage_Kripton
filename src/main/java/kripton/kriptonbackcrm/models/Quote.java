package kripton.kriptonbackcrm.models;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "quote")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Quote {


    private float amount ;
    @DBRef
    private Opportunity opportunity ;
    
}
