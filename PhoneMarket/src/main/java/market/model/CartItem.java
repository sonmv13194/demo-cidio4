package market.model;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="cartitem")
public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idcartitem;
@Column(name="quantity")
private int quantity;
@Column(name="totalprice")
private int totalprice;

@ManyToOne
@JoinColumn(name="idproduct")
private Product product;
public CartItem(Product product,int quantity) {
	super();
	this.product=product;
	this.quantity=quantity;
}



public CartItem() {
	super();
}



public int getIdcartitem() {
	return idcartitem;
}

public void setIdcartitem(int idcartitem) {
	this.idcartitem = idcartitem;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getTotalprice() {
	return totalprice;
}

public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}



public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

}
