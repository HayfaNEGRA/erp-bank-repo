package entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Materials
 *
 */
@Entity

public class Materials implements Serializable {

	
	private Integer Id;
	private static final long serialVersionUID = 1L;

	public Materials() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}
   
}
