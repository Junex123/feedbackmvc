package feedback.springbootmvc123.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class feedback {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
@Column(name="no")
private int phoneNo;
@Column(name="message")
private String message;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}



}
