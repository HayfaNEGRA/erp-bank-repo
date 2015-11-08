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
	private Integer duréeRemboursementMois;
	private Float principalValue;
	private Float Interêts;
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
	public Integer getDuréeRemboursementMois() {
		return this.duréeRemboursementMois;
	}

	public void setDuréeRemboursementMois(Integer duréeRemboursementMois) {
		this.duréeRemboursementMois = duréeRemboursementMois;
	}   
	public Float getPrincipalValue() {
		return this.principalValue;
	}

	public void setPrincipalValue(Float principalValue) {
		this.principalValue = principalValue;
	}   
	public Float getInterêts() {
		return this.Interêts;
	}

	public void setInterêts(Float Interêts) {
		this.Interêts = Interêts;
	}
   
}
