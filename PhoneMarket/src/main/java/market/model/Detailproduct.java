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
@Table(name="detailproduct")
public class Detailproduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int iddetailproduct;
@Column(name="cpu")
private String cpu;
@Column(name="chipset")
private String chipset;
@Column(name="ram")
private String ram;
@Column(name="hdd")
private String hdd;
@Column(name="graphic")
private String graphic;
@Column(name="weight")
private String weight;
@Column(name="os")
private String os;

@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
@PrimaryKeyJoinColumn
private Product product;
public Detailproduct() {
	super();
}

public Detailproduct(int iddetailproduct, String cpu, String chipset, String ram, String hdd, String graphic,
		String weight, String os) {
	super();
	this.iddetailproduct = iddetailproduct;
	this.cpu = cpu;
	this.chipset = chipset;
	this.ram = ram;
	this.hdd = hdd;
	this.graphic = graphic;
	this.weight = weight;
	this.os = os;
}

public int getIddetailproduct() {
	return iddetailproduct;
}

public void setIddetailproduct(int iddetailproduct) {
	this.iddetailproduct = iddetailproduct;
}

public String getCpu() {
	return cpu;
}

public void setCpu(String cpu) {
	this.cpu = cpu;
}

public String getChipset() {
	return chipset;
}

public void setChipset(String chipset) {
	this.chipset = chipset;
}

public String getRam() {
	return ram;
}

public void setRam(String ram) {
	this.ram = ram;
}

public String getHdd() {
	return hdd;
}

public void setHdd(String hdd) {
	this.hdd = hdd;
}

public String getGraphic() {
	return graphic;
}

public void setGraphic(String graphic) {
	this.graphic = graphic;
}

public String getWeight() {
	return weight;
}

public void setWeight(String weight) {
	this.weight = weight;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	return "Detailproduct [iddetailproduct=" + iddetailproduct + ", cpu=" + cpu + ", chipset=" + chipset + ", ram="
			+ ram + ", hdd=" + hdd + ", graphic=" + graphic + ", weight=" + weight + ", os=" + os + "]";
}



}
