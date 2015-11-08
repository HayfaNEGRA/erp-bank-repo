package entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Loan
 *
 */
@Entity
@Table(name="T_Loan")

public class Loan implements Serializable {

	
	private String idLoan;
	private String type;
	private Date date;
	private Integer dur�eRemboursementMois;
	private Float principalValue;
	private Float Inter�ts;
	@ManyToOne
	@JoinColumn(name="id_customer")
	private Customer customer;
	private static final long serialVersionUID = 1L;

	public Loan() {
		super();
	}   
	@Id    
	public String getIdLoan() {
		return this.idLoan;
	}

	public void setIdLoan(String idLoan) {
		this.idLoan = idLoan;
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
	public Integer getDur�eRemboursementMois() {
		return this.dur�eRemboursementMois;
	}

	public void setDur�eRemboursementMois(Integer dur�eRemboursementMois) {
		this.dur�eRemboursementMois = dur�eRemboursementMois;
	}   
	public Float getPrincipalValue() {
		return this.principalValue;
	}

	public void setPrincipalValue(Float principalValue) {
		this.principalValue = principalValue;
	}   
	public Float getInter�ts() {
		return this.Inter�ts;
	}

	public void setInter�ts(Float Inter�ts) {
		this.Inter�ts = Inter�ts;
	}
   
}
