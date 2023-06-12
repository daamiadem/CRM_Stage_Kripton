package kripton.kriptonbackcrm.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Document(collection = "contact")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class Contact implements Serializable{
	
	@Id
	private String id ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private Number phone ;
    private String linkProfile ;
    private String position ;
//    private Account Account ; 


//	public Account getAccount() {
//		return Account;
//	}
//	public void setAccount(Account account) {
//		Account = account;
//	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Number getPhone() {
		return phone;
	}
	public void setPhone(Number phone) {
		this.phone = phone;
	}
	public String getLinkProfile() {
		return linkProfile;
	}
	public void setLinkProfile(String linkProfile) {
		this.linkProfile = linkProfile;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
    
    
    
}
