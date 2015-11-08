package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import adapter.CashierAdapter;
import adapter.CashierAdapterByCIN;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import delegator.GestionCashierDelegator;
import entities.Cashier;

public class CashierList extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTable table;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	private JButton btnOk;
	private JTable table_1;
	private JTextField textField;
	private JTextField txtSearch;
	private JTable table_2;
	private JTextField txt_cin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierList frame = new CashierList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CashierList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 90, 752, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table_2 = new JTable(new CashierAdapter());
		panel.setLayout(new BorderLayout());
		panel.add(table_2, BorderLayout.CENTER);
		panel.add(table_2.getTableHeader(), BorderLayout.NORTH);

		table_2.setBackground(new Color(0, 0, 0, 0));
		table_2.setFont(new java.awt.Font("Avenir Next Condensed", 0, 14)); // NOI18N

		table_2.setForeground(new java.awt.Color(153, 0, 2));

		table_2.setOpaque(false);

		panel.add(table_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(142, 458, 615, 92);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (table_2.getSelectedRow() == -1) {
					if (table_2.getSelectedRow() == 0) {
						JOptionPane.showMessageDialog(null,
								" Choose a Cashier Please !!!!! ",
								"Update Alerte ", 1);
					} else {
						JOptionPane.showMessageDialog(null,
								" Choose a Cashier Please !!!!! ",
								"Update Alerte ", 1);
					}

				} else {
					
					Cashier cash=new Cashier();
					int i = table_2.getSelectedRow();
					int s = (int) table_2.getModel().getValueAt(i, 0);
//				//	cash.setIdEmployee(s);
					System.out.println(i);
					System.out.println("s            "+s);
//					//cash.setCIN(txt_cin.getText());
//					//GestionCashierDelegator.update(cash);
//					
//					
//					CashierList  frame =new CashierList();
//					frame.setVisible(true);
//					dispose();
					
				}
				
				
				
			}
		});
		btnUpdate.setBounds(233, 35, 89, 23);
		panel_2.add(btnUpdate);
		
		txt_cin = new JTextField();
		txt_cin.setBounds(125, 24, 86, 20);
		panel_2.add(txt_cin);
		txt_cin.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(404, 11, 370, 68);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(71, 11, 86, 20);
		panel_3.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				String s =txtSearch.getText() ;
				if(s==""){
					table_2.setModel(new CashierAdapter());

				}else{
				
				table_2.setModel(new CashierAdapterByCIN(s));

			}
				
			
				
				
				
				
			}
		});
		btnSearch.setBounds(216, 10, 89, 23);
		panel_3.add(btnSearch);
		
		
	}
}
