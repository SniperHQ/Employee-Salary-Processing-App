package vut.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class About_Me extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Me frame = new About_Me();
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
	public About_Me() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\eclipse-workspace\\Sniper_University\\src\\sniper_University\\Icons & Pics\\Elite 128x128.png"));
		setTitle("About Me");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
		
		JLabel lblNewLabel = new JLabel("Information");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(218, 11, 138, 27);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrProgramNameEmployee = new JTextArea();
		txtrProgramNameEmployee.setEditable(false);
		txtrProgramNameEmployee.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrProgramNameEmployee.setForeground(new Color(0, 0, 0));
		txtrProgramNameEmployee.setBackground(new Color(50, 205, 50));
		txtrProgramNameEmployee.setText("Program Name: \tEmployee Processing Application\r\n\tDate:\t17 February 2024\r\n\tFrom:  \tVaal University of Technology\r\n    IDE used:\tEclipse IDE\r\n      Module:\tDevelopment Software 3.1\r\n     Lecture:\tSihle Moyo\r\n  Programmer:\tMH Ntshangase\r\n    Nickname:\tSniper\r\n");
		txtrProgramNameEmployee.setRows(10);
		txtrProgramNameEmployee.setBounds(10, 35, 544, 220);
		contentPane.add(txtrProgramNameEmployee);
		
		JLabel lblNewLabel_1 = new JLabel("Student Number: 222084308");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 266, 229, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cellphone Number: 063_682_5103");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(325, 266, 229, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("<<Home Page");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeForm frmEmployee =new EmployeeForm();
				frmEmployee.setVisible(true);
			}
		});
		btnNewButton.setBounds(218, 319, 124, 23);
		contentPane.add(btnNewButton);
	}
}
