package entities;

import entities.Employee;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ItManager
 *
 */
@Entity
@Table(name="T_ItManager")

public class ItManager extends Employee implements Serializable {

	
	private String Role;
	private static final long serialVersionUID = 1L;

	public ItManager() {
		super();
	}   
	public String getRole() {
		return this.Role;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}
   
}
