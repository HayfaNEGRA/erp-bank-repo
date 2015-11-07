package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HumanRessource extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static HumanRessource frame = new HumanRessource();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public HumanRessource() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		
		JLabel lblHumanRessource = new JLabel("Human Ressource");
		lblHumanRessource.setBounds(235, 28, 299, 79);
		lblHumanRessource.setHorizontalAlignment(SwingConstants.CENTER);
		lblHumanRessource.setForeground(Color.BLUE);
		lblHumanRessource.setFont(new Font("Times New Roman", Font.BOLD, 21));
		getContentPane().add(lblHumanRessource);
		
		JButton button = new JButton("Training Session");
		button.setBounds(235, 288, 277, 68);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Employees");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ManageEmployees frame1 = new ManageEmployees();

				frame.setVisible(false);
				frame1.setVisible(true);
			}
		});
		
		button_1.setBounds(233, 168, 279, 68);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Rewards");
		button_2.setBounds(235, 414, 277, 68);
		getContentPane().add(button_2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 601);
	
	}
}
