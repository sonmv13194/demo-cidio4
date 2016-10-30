package market.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idcustomer;
@Column(name="name")
private String 	name;
@Column(name="email")
private String email;
@Column(name="age")
private String age;
@Column(name="phonenumber")
private String phonenumber;
@Column(name="username")
private String username;
@Column(name="password")
private String password;
@Column(name="streetname")
private String streetname;

@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="customer")
private Address address;
/*@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="customer")
private Order order;*/
public Customer() {
	super();
}

public Customer( String name, String email, String age, String phonenumber, String username,
		String password, String streetname) {
	super();
/*	this.idcustomer = idcustomer;*/
	this.name = name;
	this.email = email;
	this.age = age;
	this.phonenumber = phonenumber;
	this.username = username;
	this.password = password;
	this.streetname = streetname;
}

public int getIdcustomer() {
	return idcustomer;
}
public void setIdcustomer(int idcustomer) {
	this.idcustomer = idcustomer;
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

/*public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}*/

@Override
public String toString() {
	return "Customer [idcustomer=" + idcustomer + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phonenumber=" + phonenumber + ", username=" + username + ", password=" + password + ", streetname="
			+ streetname + ", address=" + address + "]";
}



}
