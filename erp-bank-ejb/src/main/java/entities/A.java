package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

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
