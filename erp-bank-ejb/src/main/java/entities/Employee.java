package entities;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

public class Employee implements Serializable {

	
	private Integer IdEmployee;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private Payslip payslip;
	private Boolean IsDeleted;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	@Id    
	public Integer getIdEmployee() {
		return this.IdEmployee;
	}

	public void setIdEmployee(Integer IdEmployee) {
		this.IdEmployee = IdEmployee;
	}   
	public String getFirstName() {
		return this.FirstName;
	}
	@ManyToOne
	public Payslip getPayslip() {
		return payslip;
	}
	public void setPayslip(Payslip payslip) {
		this.payslip = payslip;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}   
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}   
	public Boolean getIsDeleted() {
		return this.IsDeleted;
	}

	public void setIsDeleted(Boolean IsDeleted) {
		this.IsDeleted = IsDeleted;
	}
   
}
