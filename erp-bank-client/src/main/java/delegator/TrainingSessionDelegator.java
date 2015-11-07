package delegator;

import java.util.List;

import entities.TrainingSession;
import locator.ServiceLocator;
import services.interfaces.TraningSessionServicesRemote;

public class TrainingSessionDelegator {

	
	
	
private static String jndiName="erp-bank-ejb/TraningSessionServices!services.interfaces.TraningSessionServicesRemote";
	

	public static TraningSessionServicesRemote getInstance() {

		return (TraningSessionServicesRemote) ServiceLocator.getInstance().getRemoteProxy(jndiName);
	}
	public static List<TrainingSession> findAllTrainingsession()
	{
		return getInstance().findAllTrainingSession();
		
	}
}
