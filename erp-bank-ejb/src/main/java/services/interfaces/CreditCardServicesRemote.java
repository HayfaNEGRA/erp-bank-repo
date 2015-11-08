package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.CreditCard;

@Remote
public interface CreditCardServicesRemote {
Boolean addcreditCard(CreditCard creditCard);
	
	Boolean deletecreditCardById(Integer id);

	CreditCard findcreditCardById(Integer id);

	Boolean updatecreditCard(CreditCard creditCard);

	Boolean deletecreditCard(CreditCard creditCard);

	List<CreditCard> findAllCreditCard();

}
