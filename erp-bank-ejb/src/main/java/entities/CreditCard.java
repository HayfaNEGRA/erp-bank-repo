package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CreditCard
 *
 */
@Entity
@Table(name="T_CreditCard")

public class CreditCard implements Serializable {

	
	private String idCard;
	private String type;
	private Date date;
	private Integer password;
	@ManyToOne
	@JoinColumn(name="id_customer")
	private Customer customer;
	private static final long serialVersionUID = 1L;

	public CreditCard() {
		super();
	}   
	@Id    
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Integer getPassword() {
		return this.password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}
   
}
