package services.imp;

import javax.ejb.Stateless;
import services.interfaces.AServicesLocal;
import services.interfaces.AServicesRemote;

/**
 * Session Bean implementation class AServices
 */
@Stateless
public class AServices implements AServicesRemote, AServicesLocal {

    /**
     * Default constructor. 
     */
    public AServices() {
        // TODO Auto-generated constructor stub
    }

}
