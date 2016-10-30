package market.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idaddress;
@Column(name="nametown")
private String nametown;
@Column(name="namedistrict")
private String namedistrict;
@Column(name="namecity")
private String namecity;

@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@PrimaryKeyJoinColumn
private Customer customer;
public Address() {
	super();
}

public Address(int idaddress, String nametown, String namedistrict, String namecity) {
	super();
	this.idaddress = idaddress;
	this.nametown = nametown;
	this.namedistrict = namedistrict;
	this.namecity = namecity;
}

public int getIdaddress() {
	return idaddress;
}

public void setIdaddress(int idaddress) {
	this.idaddress = idaddress;
}

public String getNametown() {
	return nametown;
}

public void setNametown(String nametown) {
	this.nametown = nametown;
}

public String getNamedistrict() {
	return namedistrict;
}

public void setNamedistrict(String namedistrict) {
	this.namedistrict = namedistrict;
}

public String getNamecity() {
	return namecity;
}

public void setNamecity(String namecity) {
	this.namecity = namecity;
}

@Override
public String toString() {
	return "Address [idaddress=" + idaddress + ", nametown=" + nametown + ", namedistrict=" + namedistrict
			+ ", namecity=" + namecity + "]";
}




}
