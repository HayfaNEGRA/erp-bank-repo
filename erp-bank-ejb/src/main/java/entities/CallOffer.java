package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CallOffer
 *
 */
@Entity
@Table(name="T_call_offer")

public class CallOffer implements Serializable {

	
	private Integer Id;
	private String Description;
	private static final long serialVersionUID = 1L;

	public CallOffer() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
   
}
