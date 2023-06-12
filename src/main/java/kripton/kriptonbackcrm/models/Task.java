package kripton.kriptonbackcrm.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "task")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {


    private User owner ;
    private User assignedTo ;
    private String content ;
    private String subject ;
    private Date reminderDate ;
    private Priority priority;
    private String note ;
}
