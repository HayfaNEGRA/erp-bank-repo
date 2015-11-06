package tests.AServices;
import java.sql.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Materials;
import entities.Reward;
import services.interfaces.MaterialsServicesRemote;
import services.interfaces.RewardServicesRemote;
public class TestServiceOne {
	

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
				String jndiName = "/erp-bank-ejb/RewardServices!services.interfaces.RewardServicesRemote";
				RewardServicesRemote proxy =  (RewardServicesRemote) context.lookup(jndiName);
	Reward reward = new Reward();
	
		
reward.setLibelle("test");
	

	
	proxy.addreward(reward);

}
}