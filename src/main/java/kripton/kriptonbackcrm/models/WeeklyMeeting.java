package kripton.kriptonbackcrm.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "weeklyMeeting")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyMeeting {
	
    private List<User> participents ;
    private Date MeetingDate ;
    private List<String> comments ;
    private String chapter ;
    private Country country;
    private String subject ;

}
