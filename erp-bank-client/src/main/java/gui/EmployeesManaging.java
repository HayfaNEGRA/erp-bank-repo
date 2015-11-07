package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class EmployeesManaging extends JFrame {

	private JPanel contentPane;
	private JTable tableau_employee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeesManaging frame = new EmployeesManaging();
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
	public EmployeesManaging() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee");
		lblEmployee.setBounds(232, 11, 307, 75);
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setForeground(Color.BLUE);
		lblEmployee.setFont(new Font("Times New Roman", Font.BOLD, 21));
		contentPane.add(lblEmployee);
		
		JButton button = new JButton("Update Employee");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(546, 159, 135, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Employees");
		button_1.setBounds(546, 256, 122, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Employees");
		button_2.setBounds(546, 349, 135, 50);
		contentPane.add(button_2);
		
		tableau_employee = new JTable();
		tableau_employee.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"FirstName", "Type", "Email", "LastName"
			}
		));
		tableau_employee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 int row=tableau_employee.getSelectedRow();
		            String tbclic= (tableau_employee.getModel().getValueAt(row, 2)).toString();
			}
		});
		tableau_employee.setBounds(63, 154, 448, 315);
		contentPane.add(tableau_employee);
	}
}
