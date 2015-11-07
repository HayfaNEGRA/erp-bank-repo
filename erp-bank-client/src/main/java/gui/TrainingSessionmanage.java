package gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTable;

import delegator.GestionEmployeeDelegator;
import delegator.TrainingSessionDelegator;
import entities.TrainingSession;
import javax.swing.JScrollPane;

public class TrainingSessionmanage extends JFrame {

	private JPanel contentPane;
	List<TrainingSession> trainingsessions;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainingSessionmanage frame = new TrainingSessionmanage();
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
	public TrainingSessionmanage() {
		trainingsessions= new ArrayList<TrainingSession>();
		trainingsessions=TrainingSessionDelegator.findAllTrainingsession();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 198, 514, 247);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
