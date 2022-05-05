import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;


public class StartingGUI extends JFrame {
	private JTextField textFieldEmail;
	private JTextField textFieldPass;
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
		
		textFieldPass = new JTextField();
		textFieldPass.setColumns(10);
		textFieldPass.setBounds(162, 176, 86, 20);
		getContentPane().add(textFieldPass);
		
		JButton btnSignIn = new JButton("Sign In");
		/*btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail = textFieldEmail.getText();
				String pass = textFieldPass.getText();
				ArrayList<HaveHome> aList = theRegistry.getListWithHome();					edw prepei na elegxei mail kai pass an einai swsta 
				ArrayList<NoHome> anotherList = theRegistry.getListWithoutHome();			gia na ton pigainei sto epomeno gui me tous proteinomenous(den exei ginei akoma).
				boolean found = false;														
				boolean correct = false;
				
				for(int i=0;i<aList.size();i++) {
					if(aList.get(i).email==mail) {
						
					}
				}
				
				
			}
		});*/
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
			}
		});

		btnSignUp.setBounds(162, 338, 89, 23);
		getContentPane().add(btnSignUp);
		
		this.setVisible(true);
		this.setSize(450, 447);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
