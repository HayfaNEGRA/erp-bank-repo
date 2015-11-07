package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import delegator.GestionEmployeeDelegator;


import entities.Employee;






import java.awt.Shape;
import java.io.FileOutputStream;
 



import javax.swing.JOptionPane;
 



import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ObjectProperty;


public class ManageEmployees extends JFrame {

	private JPanel contentPane;
	List<Employee> employees;
	Employee emp;
	private JButton btnUpdate;
	private JTextField adress;
	private JTextField cin;
	private JTextField phone;
	private JTextField name;
	private JTextField lastname;
	private JTextField pseudo;
	private JTextField password;
	private JTextField kids;
	private JTextField civil;
	private JTextField birth;
	private JTextField mail;
	private JLabel lblMail;
	private JButton btnUp;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageEmployees frame = new ManageEmployees();
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
	public ManageEmployees() {
		employees= new ArrayList<Employee>();
		employees=GestionEmployeeDelegator.findAllEmployee();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				emp=employees.get(table.getSelectedRow());
				//emp=	GestionEmployeeDelegator.findEmployeeById(emp.getId());
				GestionEmployeeDelegator.supprimerEmploye(emp);
				employees.remove(emp);
				
				initDataBindings();
			}
		});
		
		btnUp = new JButton("update");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				emp=employees.get(table.getSelectedRow());
				emp.setAdress(adress.getText().toString());
				emp.setBirthDate(birth.getText().toString());
				emp.setCIN(cin.getText());
				emp.setCivilState(civil.getText().toString());
				emp.setEmail(mail.getText().toString());
				emp.setKidsNumber(Integer.parseInt(kids.getText()));
				emp.setLastName(lastname.getText().toString());
				emp.setFirstName(name.getText().toString());
				emp.setPassword(password.getText().toString());
				emp.setPhoneNumber(Integer.parseInt(phone.getText()));
				emp.setEmail(pseudo.getText().toString());
				GestionEmployeeDelegator.editemployee(emp);
				employees=GestionEmployeeDelegator.findAllEmployee();
				initDataBindings();
			}
		});
		btnUp.setBounds(426, 81, 105, 23);
		contentPane.add(btnUp);
		btnDelete.setBounds(426, 47, 105, 23);
		contentPane.add(btnDelete);
		
		adress = new JTextField();
		adress.setBounds(41, 277, 86, 20);
		contentPane.add(adress);
		adress.setColumns(10);
		
		cin = new JTextField();
		cin.setBounds(41, 327, 86, 20);
		contentPane.add(cin);
		cin.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(41, 380, 86, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		name = new JTextField();
		name.setBounds(41, 440, 86, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(254, 277, 86, 20);
		contentPane.add(lastname);
		lastname.setColumns(10);
		
		pseudo = new JTextField();
		pseudo.setBounds(254, 327, 86, 20);
		contentPane.add(pseudo);
		pseudo.setColumns(10);
		
		password = new JTextField();
		password.setBounds(254, 380, 86, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		kids = new JTextField();
		kids.setBounds(445, 327, 86, 20);
		contentPane.add(kids);
		kids.setColumns(10);
		
		civil = new JTextField();
		civil.setBounds(445, 277, 86, 20);
		contentPane.add(civil);
		civil.setColumns(10);
		
		birth = new JTextField();
		birth.setBounds(254, 440, 86, 20);
		contentPane.add(birth);
		birth.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("adress");
		lblNewLabel.setBounds(41, 261, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("cin");
		lblNewLabel_1.setBounds(41, 302, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(41, 355, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(41, 415, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("last name");
		lblLastName.setBounds(256, 261, 71, 14);
		contentPane.add(lblLastName);
		
		JLabel lblNewLabel_2 = new JLabel("pseudo");
		lblNewLabel_2.setBounds(254, 308, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(254, 358, 112, 14);
		contentPane.add(lblPassword);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(254, 415, 73, 14);
		contentPane.add(lblBirthday);
		
		JLabel lblCivilState = new JLabel("civil state");
		lblCivilState.setBounds(447, 261, 59, 14);
		contentPane.add(lblCivilState);
		
		JLabel lblKidsNumber = new JLabel("Kids number");
		lblKidsNumber.setBounds(445, 308, 86, 14);
		contentPane.add(lblKidsNumber);
		mail = new JTextField();
		mail.setBounds(445, 380, 86, 20);
		contentPane.add(mail);
		mail.setColumns(10);
		
		lblMail = new JLabel("Mail");
		lblMail.setBounds(445, 355, 46, 14);
		contentPane.add(lblMail);
		civil.setVisible(false);
		birth.setVisible(false);
		adress.setVisible(false);
		kids.setVisible(false);
		phone.setVisible(false);
		name.setVisible(false);
		lastname.setVisible(false);
		pseudo.setVisible(false);
		password.setVisible(false);
		cin.setVisible(false);
		mail.setVisible(false);
		lblBirthday.setVisible(false);
		lblCivilState.setVisible(false);
		lblKidsNumber.setVisible(false);
		lblLastName.setVisible(false);
		lblName.setVisible(false);
		lblPassword.setVisible(false);
		lblPhone.setVisible(false);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblMail.setVisible(false);
		lblNewLabel.setVisible(false);
		
		btnUpdate = new JButton("");
		btnUpdate.setEnabled(false);
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				emp=employees.get(table.getSelectedRow());
				civil.setText(emp.getCivilState());
				birth.setText(emp.getBirthDate());
				adress.setText(emp.getAdress());
				kids.setText(""+emp.getKidsNumber());
				phone.setText(""+emp.getPhoneNumber());
				name.setText(emp.getFirstName());
				lastname.setText(emp.getLastName());
				pseudo.setText(emp.getEmail());
				password.setText(emp.getPassword());
				cin.setText(""+emp.getCIN());
				mail.setText(emp.getEmail());
				
				civil.setVisible(true);
				birth.setVisible(true);
				adress.setVisible(true);
				kids.setVisible(true);
				phone.setVisible(true);
				name.setVisible(true);
				lastname.setVisible(true);
				pseudo.setVisible(true);
				password.setVisible(true);
				cin.setVisible(true);
				mail.setVisible(true);
				lblBirthday.setVisible(true);
				lblCivilState.setVisible(true);
				lblKidsNumber.setVisible(true);
				lblLastName.setVisible(true);
				lblName.setVisible(true);
				lblPassword.setVisible(true);
				lblPhone.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				lblMail.setVisible(true);
				lblNewLabel.setVisible(true);
			}
		});

		btnUpdate.setBounds(412, 67, 105, 23);
		contentPane.add(btnUpdate);
		btnUpdate.setOpaque(false);
		btnUpdate.setContentAreaFilled(false);
		btnUpdate.setBorderPainted(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 383, 219);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
							}
		});
		initDataBindings();
		
	}
	protected void initDataBindings() {
		JTableBinding<Employee, List<Employee>, JTable> jTableBinding = SwingBindings.createJTableBinding(UpdateStrategy.READ, employees, table);
		//
		BeanProperty<Employee, String> employeeBeanProperty = BeanProperty.create("firstName");
		jTableBinding.addColumnBinding(employeeBeanProperty).setColumnName("firstname");
		//
		BeanProperty<Employee, String> employeeBeanProperty_1 = BeanProperty.create("lastName");
		jTableBinding.addColumnBinding(employeeBeanProperty_1).setColumnName("LastName");
		//
		BeanProperty<Employee, Integer> employeeBeanProperty_2 = BeanProperty.create("phoneNumber");
		jTableBinding.addColumnBinding(employeeBeanProperty_2).setColumnName("Phone");
		//
		BeanProperty<Employee, String> employeeBeanProperty_3 = BeanProperty.create("email");
		jTableBinding.addColumnBinding(employeeBeanProperty_3).setColumnName("Email");
		//
		BeanProperty<Employee, String> employeeBeanProperty_4 = BeanProperty.create("adress");
		jTableBinding.addColumnBinding(employeeBeanProperty_4).setColumnName("Adresse");
		//
		jTableBinding.bind();
	}
}
