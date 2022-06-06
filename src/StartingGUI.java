import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JPasswordField;


public class StartingGUI extends JFrame {
	private JTextField textFieldEmail;
	private Registry theRegistry;
	private JPasswordField passwordField;
	

	
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
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setEditable(false);
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(162, 87, 59, 20);
		getContentPane().add(txtpnEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(162, 118, 86, 20);
		getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password:");
		txtpnPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnPassword.setEditable(false);
		txtpnPassword.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPassword.setBounds(162, 145, 80, 20);
		getContentPane().add(txtpnPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail = textFieldEmail.getText();
				String pass = passwordField.getPassword().toString();
				boolean flag = false;
				boolean found = false;
				
				found = theRegistry.verification(mail, pass);
				
				if(found) {
					for(int i=0; i<theRegistry.getListWithoutHome().size(); i++) {
						if(mail.equals(theRegistry.getListWithoutHome().get(i).getEmail())) {
							flag = true;
							User aUser = theRegistry.getListWithoutHome().get(i);
							new SearchingRoomateGUI(aUser,theRegistry);
							StartingGUI.this.dispose();
						}
						else continue;
					}
					
					if(!flag) 
						for(int i=0; i<theRegistry.getListWithHome().size(); i++) {
							if(mail.equals(theRegistry.getListWithHome().get(i).getEmail())) {
								User aUser = theRegistry.getListWithHome().get(i);
								new SearchingRoomateGUI(aUser,theRegistry);
								StartingGUI.this.dispose();
							}	
						}	
				}
					
				else 
					 JOptionPane.showMessageDialog(null, "Wrong Password or Email!");
				
				
			}
		});
		btnSignIn.setBounds(162, 222, 89, 23);
		getContentPane().add(btnSignIn);
		
		JTextPane txtpnIfYouDont = new JTextPane();
		txtpnIfYouDont.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnIfYouDont.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnIfYouDont.setEditable(false);
		txtpnIfYouDont.setText("If you don't have an account, please sign up.");
		txtpnIfYouDont.setBounds(126, 280, 198, 47);
		getContentPane().add(txtpnIfYouDont);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WhatAreYouLookingForGUI(theRegistry);
				StartingGUI.this.dispose();
			}
		});

		btnSignUp.setBounds(162, 338, 89, 23);
		getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 176, 86, 20);
		getContentPane().add(passwordField);
		
		setResizable(false);
		this.setVisible(true);
		this.setSize(450, 447);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
