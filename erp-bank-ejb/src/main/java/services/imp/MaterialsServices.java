package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import services.interfaces.MaterialsServicesLocal;
import services.interfaces.MaterialsServicesRemote;
import entities.Materials;

/**
 * Session Bean implementation class MaterialsServices
 */

@Stateless
@LocalBean
public class MaterialsServices implements MaterialsServicesRemote, MaterialsServicesLocal {
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public MaterialsServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addMateriel(Materials materiel) {
		Boolean b = false;
				try {
					entityManager.persist(materiel);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteMaterielById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(findMaterielById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Materials findMaterielById(Integer id) {
		return entityManager.find(Materials.class, id);
		
	}

	@Override
	public Boolean updateMateriel(Materials materiel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMateriel(Materials materiel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materials> findAllMaterials() {
		// TODO Auto-generated method stub
		return null;
	}

}
