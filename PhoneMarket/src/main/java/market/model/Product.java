package market.model;

import java.io.Serializable;
/*import java.util.List;*/
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;*/
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="product")
public class Product  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idproduct;
@Column(name="name")
private String name;
@Column(name="description")
private String description;
/*@Column(name="location")
private String location;*/
@Column(name="price")
private float price;
@Column(name="view")
private float view;
@Column(name="image")
private String image;

@ManyToOne()
@JoinColumn(name="idcategory")
private Category category;
@ManyToOne()
@JoinColumn(name="idsupplier")
private Supplier supplier;
@ManyToOne()
@JoinColumn(name="idlocation")
private Location locat;
@ManyToOne
@JoinColumn(name="idevent")
private Event event;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="product")
private Set<CartItem> listCartItem;
@OneToOne(fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="product")
private Detail detail;
@OneToOne(fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="product")
private Detailproduct detailproduct;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int idproduct, String name, String description, String location, float price, float view,
		byte[] imagedata, String image,Location locat) {
	super();
	this.idproduct = idproduct;
	this.name = name;
	this.description = description;
	this.price = price;
	this.view = view;
	this.image = image;
	this.locat=locat;
}
public int getIdproduct() {
	return idproduct;
}
public void setIdproduct(int idproduct) {
	this.idproduct = idproduct;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
/*public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}*/
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getView() {
	return view;
}
public void setView(float view) {
	this.view = view;
}

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public Location getLocat() {
	return locat;
}
public void setLocat(Location locat) {
	this.locat = locat;
}

public Set<CartItem> getListCartItem() {
	return listCartItem;
}
public void setListCartItem(Set<CartItem> listCartItem) {
	this.listCartItem = listCartItem;
}
public Detail getDetail() {
	return detail;
}
public void setDetail(Detail detail) {
	this.detail = detail;
}
public Event getEvent() {
	return event;
}
public void setEvent(Event event) {
	this.event = event;
}

public Detailproduct getDetailproduct() {
	return detailproduct;
}
public void setDetailproduct(Detailproduct detailproduct) {
	this.detailproduct = detailproduct;
}
@Override
public String toString() {
	return "Product [idproduct=" + idproduct + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", view=" + view + ", image=" + image + ", category=" + category + ", supplier=" + supplier + ", locat="
			+ locat + "]";
}


}
