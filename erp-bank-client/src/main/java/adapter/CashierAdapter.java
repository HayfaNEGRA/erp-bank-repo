package adapter;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import delegator.GestionCashierDelegator;
import entities.Cashier;

public class CashierAdapter extends AbstractTableModel {

	String[] header = { "CIN","Firstname", "Lastname", "Adress", "Email","PhoneNumber","Sexe","BirthDate","CivilState" };
	public List<Cashier> Cashiers = new ArrayList<Cashier>();

	public CashierAdapter() {
		Cashiers = GestionCashierDelegator.findAllCashier();
	}

	@Override
	public String getColumnName(int i) {
		return header[i];
	}

	
	@Override
	public int getRowCount() {
		return Cashiers.size();
	}

	@Override
	public int getColumnCount() {
		return header.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Cashiers.get(rowIndex).getCIN();
		case 1:
			return Cashiers.get(rowIndex).getFirstName();
		case 2:
			return Cashiers.get(rowIndex).getLastName();
			 case 3:
			 return Cashiers.get(rowIndex).getAdress();
			 case 4:
			 return Cashiers.get(rowIndex).getEmail();
			 case 5:
			 return Cashiers.get(rowIndex).getPhoneNumber();
			 case 6:
			 return Cashiers.get(rowIndex).getSexe();
			 case 7:
			 return Cashiers.get(rowIndex).getBirthDate();
			 case 8:
			 return Cashiers.get(rowIndex).getCivilState();
		default:
			return null;

		}

	}
}
