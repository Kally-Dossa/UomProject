import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * NoHomeSignUpGUI is the graphic interface where the
 * user fills his profile info when he signs up and then 
 * he is added in the serial file the contains all the 
 * users that own a house and are just looking for a roomate.
 */

public class NoHomeSignUpGUI extends JFrame {
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldMail;
	private JTextField textFieldPhone;
	private JTextField textFieldLang;
	private Registry theRegistry;
	private JTextField textFieldAge;
	private JPasswordField passwordField;
	
	
	public NoHomeSignUpGUI(Registry aRegistry) {
		setResizable(false);
		theRegistry = aRegistry;
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setBackground(new Color(0, 204, 255));
		
		this.setVisible(true);
		this.setSize(314, 500);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTextPane txtpnPleaseFillThe = new JTextPane();
		txtpnPleaseFillThe.setEditable(false);
		txtpnPleaseFillThe.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPleaseFillThe.setText("Please fill the following information:");
		txtpnPleaseFillThe.setBounds(10, 11, 241, 20);
		getContentPane().add(txtpnPleaseFillThe);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setEditable(false);
		txtpnName.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnName.setText("Name:");
		txtpnName.setBounds(10, 43, 38, 20);
		getContentPane().add(txtpnName);
		
		JTextPane txtpnSurname = new JTextPane();
		txtpnSurname.setEditable(false);
		txtpnSurname.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSurname.setText("Surname: ");
		txtpnSurname.setBounds(10, 74, 70, 20);
		getContentPane().add(txtpnSurname);
		
		JTextPane txtpnGender = new JTextPane();
		txtpnGender.setEditable(false);
		txtpnGender.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnGender.setText("Gender:");
		txtpnGender.setBounds(10, 254, 49, 20);
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(10, 100, 38, 20);
		getContentPane().add(txtpnEmail);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setEditable(false);
		txtpnPhone.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPhone.setText("Phone:");
		txtpnPhone.setBounds(10, 193, 49, 20);
		getContentPane().add(txtpnPhone);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnLanguage.setText("Language:");
		txtpnLanguage.setBounds(10, 224, 70, 20);
		getContentPane().add(txtpnLanguage);
		
		JTextPane txtpnPet = new JTextPane();
		txtpnPet.setEditable(false);
		txtpnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet.setText("Pet:");
		txtpnPet.setBounds(10, 340, 49, 20);
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setText("Smoker:");
		txtpnSmoker.setBounds(10, 284, 49, 20);
		getContentPane().add(txtpnSmoker);
		

		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password:");
		txtpnPassword.setEditable(false);
		txtpnPassword.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPassword.setBounds(10, 131, 70, 20);
		getContentPane().add(txtpnPassword);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age:");
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAge.setBounds(10, 162, 30, 20);
		getContentPane().add(txtpnAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(109, 162, 106, 20);
		getContentPane().add(textFieldAge);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 131, 108, 20);
		getContentPane().add(passwordField);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(109, 43, 106, 20);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(109, 74, 106, 20);
		getContentPane().add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(109, 251, 64, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(196, 251, 70, 23);
		getContentPane().add(rdbtnFemale);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(109, 100, 108, 20);
		getContentPane().add(textFieldMail);
		textFieldMail.setColumns(10);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(109, 193, 106, 20);
		getContentPane().add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		textFieldLang = new JTextField();
		textFieldLang.setBounds(109, 224, 109, 20);
		getContentPane().add(textFieldLang);
		textFieldLang.setColumns(10);
		
		JRadioButton rdbtnPetYes = new JRadioButton("Yes");
		rdbtnPetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetYes.setBounds(109, 340, 49, 23);
		getContentPane().add(rdbtnPetYes);
		
		JRadioButton rdbtnPetNo = new JRadioButton("No");
		rdbtnPetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetNo.setBounds(196, 337, 49, 23);
		getContentPane().add(rdbtnPetNo);
		
		JRadioButton rdbtnSmokingYes = new JRadioButton("Yes");
		rdbtnSmokingYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingYes.setBounds(109, 284, 49, 23);
		getContentPane().add(rdbtnSmokingYes);
		
		JRadioButton rdbtnSmokingNo = new JRadioButton("No");
		rdbtnSmokingNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingNo.setBounds(196, 284, 45, 23);
		getContentPane().add(rdbtnSmokingNo);
		
		JTextPane txtpnWorking = new JTextPane();
		txtpnWorking.setText("Working:");
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWorking.setBounds(10, 310, 58, 20);
		getContentPane().add(txtpnWorking);
		
		JRadioButton rdbtnEmployed = new JRadioButton("Employed");
		rdbtnEmployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmployed.setBounds(109, 310, 80, 23);
		getContentPane().add(rdbtnEmployed);
		
		JRadioButton rdbtnUnemployed = new JRadioButton("Unemployed");
		rdbtnUnemployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnUnemployed.setBounds(196, 310, 113, 23);
		getContentPane().add(rdbtnUnemployed);
		
		
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnFemale.setEnabled(false);
				if(!rdbtnMale.isSelected()) {
					rdbtnFemale.setEnabled(true);
				}
			}
		});
		
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMale.setEnabled(false);
				if(!rdbtnFemale.isSelected()) {
					rdbtnMale.setEnabled(true);
				}
			}
		});
		
		rdbtnPetYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPetNo.setEnabled(false);
				if(!rdbtnPetYes.isSelected()) {
					rdbtnPetNo.setEnabled(true);
				}
			}
		});
		
		rdbtnPetNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPetYes.setEnabled(false);
				if(!rdbtnPetNo.isSelected()) {
					rdbtnPetYes.setEnabled(true);
				}
			}
		});
		
		rdbtnSmokingYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSmokingNo.setEnabled(false);
				if(!rdbtnSmokingYes.isSelected()) {
					rdbtnSmokingNo.setEnabled(true);
				}
			}
		});
		
		rdbtnSmokingNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSmokingYes.setEnabled(false);
				if(!rdbtnSmokingNo.isSelected()) {
					rdbtnSmokingYes.setEnabled(true);
				}
			}
		});
		
		rdbtnEmployed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnUnemployed.setEnabled(false);
				if(!rdbtnEmployed.isSelected()) {
					rdbtnUnemployed.setEnabled(true);
				}
			}
		});
		
		rdbtnUnemployed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnEmployed.setEnabled(false);
				if(!rdbtnUnemployed.isSelected()) {
					rdbtnEmployed.setEnabled(true);
				}
			}
		});
		
		
		JButton btnNewButton = new JButton("Create Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				int age = Integer.parseInt(textFieldAge.getText());
				if(rdbtnMale.isSelected()) {
					gender = rdbtnMale.getText();
				}
				
				else {
					gender = rdbtnFemale.getText();
				}
				
				File f = new File("NoHomeList.ser");
				try {
					NoHome aUser = new NoHome(textFieldName.getText(),textFieldSurname.getText(),gender,age
						,textFieldMail.getText(),passwordField.getPassword().toString(), textFieldPhone.getText(),textFieldLang.getText(),
						rdbtnPetYes.isSelected(),rdbtnSmokingYes.isSelected(),rdbtnEmployed.isSelected());
					
					
					theRegistry.addNoHome(aUser);
					
					FileOutputStream fouts = new FileOutputStream(f, false);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(theRegistry.getListWithoutHome());
					douts.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				NoHomeSignUpGUI.this.dispose();
				new StartingGUI(theRegistry);
				
			}
		}); 
		btnNewButton.setBounds(92, 410, 124, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
	}
}
