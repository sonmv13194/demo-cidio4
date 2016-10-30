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
@Table(name="detail")
public class Detail implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="idproduct")
private int idproduct;
@Id
@Column(name="idcart")
private int idcart;
@Column(name="price")
private float price;
@Column(name="quantity")
private float quantity;
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
@JoinColumn(name="idproduct")
private Product product;
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
@JoinColumn(name="idcart")
private Order order;
public Detail() {
	super();
}

public Detail( int idproduct, int idcart, float price, float quantity) {
	super();
	this.idproduct = idproduct;
	this.idcart = idcart;
	this.price = price;
	this.quantity = quantity;
}

public int getIdproduct() {
	return idproduct;
}
public void setIdproduct(int idproduct) {
	this.idproduct = idproduct;
}
public int getIdcart() {
	return idcart;
}
public void setIdcart(int idcart) {
	this.idcart = idcart;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getQuantity() {
	return quantity;
}
public void setQuantity(float quantity) {
	this.quantity = quantity;
}

public Product getProduct() {
	return product;
}
public void setProdut(Product product) {
	this.product = product;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

}
