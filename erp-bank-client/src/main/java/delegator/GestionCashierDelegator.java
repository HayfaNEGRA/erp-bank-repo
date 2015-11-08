package delegator;

import java.util.List;

import entities.Cashier;
import locator.ServiceLocator;
import services.interfaces.CashierServicesRemote;

public class GestionCashierDelegator {
	private static String jndiName="/erp-bank-ejb/CashierServices!services.interfaces.CashierServicesRemote";
	public static CashierServicesRemote getInstance() {

		return (CashierServicesRemote) ServiceLocator.getInstance().getRemoteProxy(jndiName);
	}
	public static void ajouterEmploye(Cashier cashier)
	{
		getInstance().addCashier(cashier);
	}
	public static void supprimerEmploye(Cashier cashier) {
		getInstance().deleteCashier(cashier);
	}
	public static List<Cashier> findAllCashier()
	{
		return getInstance().findAllCashier();
		
	}
	public static List<Cashier> findAllCashier(String CIN)
	{
		return getInstance().findAllCashier(CIN);
		
	}
}
