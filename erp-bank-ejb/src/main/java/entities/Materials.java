package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Materials
 *
 */
@Entity

public class Materials implements Serializable {

	
	public Materials() {
		super();
	}


	public Materials(int id, float price, Date deliveyDate, String materialState) {
		super();
		Id = id;
		this.price = price;
		DeliveyDate = deliveyDate;
		MaterialState = materialState;
	}


	private int Id;
	private float price;
	private Date DeliveyDate;
	private String MaterialState;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDeliveyDate() {
		return DeliveyDate;
	}
	public void setDeliveyDate(Date deliveyDate) {
		DeliveyDate = deliveyDate;
	}
	public String getMaterialState() {
		return MaterialState;
	}
	public void setMaterialState(String materialState) {
		MaterialState = materialState;
	}


	private static final long serialVersionUID = 1L;

	
	@Id    
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}
	
   
}
