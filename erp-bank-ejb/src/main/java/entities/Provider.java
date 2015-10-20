package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity
@Table(name="t_provider")

public class Provider implements Serializable {

	
	private Integer Id;
	private String Name;
	private String LastName;
	private String Content;
	private static final long serialVersionUID = 1L;

	public Provider() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}   
	public String getContent() {
		return this.Content;
	}

	public void setContent(String Content) {
		this.Content = Content;
	}
   
}
