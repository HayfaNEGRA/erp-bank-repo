package entities;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BankAccount
 *
 */
@Entity

public class BankAccount implements Serializable {

	
	private Integer bankAccountID;
	private Integer bankAccountNumber;
	private Double Balance;
	private Date creationDate;
	private Boolean isDeleted;
	private static final long serialVersionUID = 1L;

	public BankAccount() {
		super();
	}   
	@Id    
	public Integer getBankAccountID() {
		return this.bankAccountID;
	}

	public void setBankAccountID(Integer bankAccountID) {
		this.bankAccountID = bankAccountID;
	}   
	public Integer getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}   
	public Double getBalance() {
		return this.Balance;
	}

	public void setBalance(Double Balance) {
		this.Balance = Balance;
	}   
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}   
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
   
}
