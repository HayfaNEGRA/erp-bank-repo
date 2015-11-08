package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.ItManager;

@Remote
public interface ItManagerServicesRemote {
Boolean additmanager(ItManager itmanager);
	
	Boolean deleteitmanagerById(Integer id);

	ItManager finditmanagerById(Integer id);

	Boolean updateitmanager(ItManager itmanager);

	Boolean deleteitmanager(ItManager itmanager);

	List<ItManager> findAllItManager();

}
