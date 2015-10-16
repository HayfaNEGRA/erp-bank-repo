package entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	
	private Integer id;
	private static final long serialVersionUID = 1L;

	public A() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
   
}
