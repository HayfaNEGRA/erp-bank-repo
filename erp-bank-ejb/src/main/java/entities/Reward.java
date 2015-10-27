package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reward
 *
 */
@Entity
@Table(name="T_Reward")

public class Reward implements Serializable {

	
	private Integer IdReward;
	private String Libelle;
	private static final long serialVersionUID = 1L;

	public Reward() {
		super();
	}   
	@Id    
	public Integer getIdReward() {
		return this.IdReward;
	}

	public void setIdReward(Integer IdReward) {
		this.IdReward = IdReward;
	}   
	public String getLibelle() {
		return this.Libelle;
	}

	public void setLibelle(String Libelle) {
		this.Libelle = Libelle;
	}
   
}
