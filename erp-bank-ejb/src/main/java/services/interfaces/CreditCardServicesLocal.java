package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.CreditCard;

@Local
public interface CreditCardServicesLocal {
Boolean addcreditCard(CreditCard creditCard);
	
	Boolean deletecreditCardById(Integer id);

	CreditCard findcreditCardById(Integer id);

	Boolean updatecreditCard(CreditCard creditCard);

	Boolean deletecreditCard(CreditCard creditCard);

	List<CreditCard> findAllCreditCard();

}
