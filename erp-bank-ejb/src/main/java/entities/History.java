package entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: History
 *
 */
@Entity

public class History implements Serializable {

	
	private Integer idHistory;
	private static final long serialVersionUID = 1L;

	public History() {
		super();
	}   
	@Id    
	public Integer getIdHistory() {
		return this.idHistory;
	}

	public void setIdHistory(Integer idHistory) {
		this.idHistory = idHistory;
	}
   
}
