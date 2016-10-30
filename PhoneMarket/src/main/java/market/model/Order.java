package market.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idcart;
@Column
private String name;
@Column(name="createdate")
private Date createdate;
@Column(name="customername")
private String customername;
@Column(name="address")
private String address;
/*@OneToOne(fetch=FetchType.EAGER,orphanRemoval=true,cascade=CascadeType.ALL)
@PrimaryKeyJoinColumn
private Customer customer;*/
public Order() {
	super();
}

public Order(int idcart, String name, Date createdate) {
	super();
	this.idcart = idcart;
	this.name = name;
	this.createdate = createdate;
}

public int getIdcart() {
	return idcart;
}

public void setIdcart(int idcart) {
	this.idcart = idcart;
}

public Date getCreatedate() {
	return createdate;
}

public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

/*public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}*/

public String getCustomername() {
	return customername;
}

public void setCustomername(String customername) {
	this.customername = customername;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
