import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class StartingGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private Registry theRegistry;
	

	
	public StartingGUI(Registry aRegistry) {
		theRegistry = aRegistry;
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		getContentPane().setLayout(null);
		
		JTextPane txtpnWelcomeToRoom = new JTextPane();
		txtpnWelcomeToRoom.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWelcomeToRoom.setEditable(false);
		txtpnWelcomeToRoom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtpnWelcomeToRoom.setText("Welcome to Room8!");
		txtpnWelcomeToRoom.setBounds(112, 11, 200, 33);
		getContentPane().add(txtpnWelcomeToRoom);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnUsername.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnUsername.setEditable(false);
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(162, 87, 80, 20);
		getContentPane().add(txtpnUsername);
		
		textField = new JTextField();
		textField.setBounds(162, 118, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password:");
		txtpnPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnPassword.setEditable(false);
		txtpnPassword.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPassword.setBounds(162, 145, 80, 20);
		getContentPane().add(txtpnPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 176, 86, 20);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBounds(162, 222, 89, 23);
		getContentPane().add(btnNewButton);
		
		JTextPane txtpnIfYouDont = new JTextPane();
		txtpnIfYouDont.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnIfYouDont.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnIfYouDont.setEditable(false);
		txtpnIfYouDont.setText("If you don't have an account, please sign up.");
		txtpnIfYouDont.setBounds(126, 280, 198, 47);
		getContentPane().add(txtpnIfYouDont);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WhatAreYouLookingForGUI(theRegistry);
			}
		});
		btnNewButton_1.setBounds(162, 338, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		this.setVisible(true);
		this.setSize(450, 447);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
