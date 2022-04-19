import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;

public class HaveHomeSignUpGUI extends JFrame {
	private Registry theRegistry;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
	public HaveHomeSignUpGUI(Registry aRegistry) {
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setResizable(false);
		setTitle("Create Profile");
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 400);
		getContentPane().add(scrollPane);
		
		JTextPane txtpnPleaseFillThe = new JTextPane();
		txtpnPleaseFillThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnPleaseFillThe.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPleaseFillThe.setEditable(false);
		txtpnPleaseFillThe.setText("Please fill the following information about you:");
		txtpnPleaseFillThe.setBounds(12, 11, 318, 20);
		getContentPane().add(txtpnPleaseFillThe);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name:");
		txtpnName.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnName.setEditable(false);
		txtpnName.setBounds(10, 42, 80, 20);
		getContentPane().add(txtpnName);
		
		JTextPane txtpnSurname = new JTextPane();
		txtpnSurname.setText("Surname:");
		txtpnSurname.setEditable(false);
		txtpnSurname.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSurname.setBounds(12, 73, 80, 20);
		getContentPane().add(txtpnSurname);
		
		JTextPane txtpnGender = new JTextPane();
		txtpnGender.setText("Gender:");
		txtpnGender.setEditable(false);
		txtpnGender.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnGender.setBounds(10, 104, 90, 20);
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age");
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAge.setBounds(10, 135, 90, 20);
		getContentPane().add(txtpnAge);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setText("Email:");
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setBounds(10, 166, 90, 20);
		getContentPane().add(txtpnEmail);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setText("Phone:");
		txtpnPhone.setEditable(false);
		txtpnPhone.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPhone.setBounds(10, 197, 72, 20);
		getContentPane().add(txtpnPhone);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setText("Language:");
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnLanguage.setBounds(10, 228, 80, 20);
		getContentPane().add(txtpnLanguage);
		
		JTextPane txtpnPet = new JTextPane();
		txtpnPet.setText("Pet:");
		txtpnPet.setEditable(false);
		txtpnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet.setBounds(10, 259, 72, 20);
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setText("Smoker:");
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setBounds(10, 290, 101, 20);
		getContentPane().add(txtpnSmoker);
		
		JTextPane txtpnWorking = new JTextPane();
		txtpnWorking.setText("Working");
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWorking.setBounds(12, 321, 90, 20);
		getContentPane().add(txtpnWorking);
		
		textField = new JTextField();
		textField.setBounds(129, 42, 126, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 73, 126, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 135, 126, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 166, 126, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 197, 126, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(129, 228, 126, 20);
		getContentPane().add(textField_5);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(122, 104, 72, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(221, 104, 72, 23);
		getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnPetYes = new JRadioButton("Yes");
		rdbtnPetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetYes.setBounds(122, 259, 72, 23);
		getContentPane().add(rdbtnPetYes);
		
		JRadioButton rdbtnPetNo = new JRadioButton("No");
		rdbtnPetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetNo.setBounds(221, 259, 72, 23);
		getContentPane().add(rdbtnPetNo);
		
		JRadioButton rdbtnSmokingYes = new JRadioButton("Yes");
		rdbtnSmokingYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingYes.setBounds(122, 290, 72, 23);
		getContentPane().add(rdbtnSmokingYes);
		
		JRadioButton rdbtnSmokingNo = new JRadioButton("No");
		rdbtnSmokingNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingNo.setBounds(221, 290, 72, 23);
		getContentPane().add(rdbtnSmokingNo);
		
		JRadioButton rdbtnEmployed = new JRadioButton("Employed");
		rdbtnEmployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmployed.setBounds(122, 318, 72, 23);
		getContentPane().add(rdbtnEmployed);
		
		JRadioButton rdbtnUnemployed = new JRadioButton("Unemployed");
		rdbtnUnemployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnUnemployed.setBounds(221, 316, 90, 23);
		getContentPane().add(rdbtnUnemployed);
		
		//Personal Info Radio Buttons Listeners
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 346, 395, 2);
		getContentPane().add(separator);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setText("City:");
		txtpnAddress.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAddress.setBounds(12, 390, 80, 20);
		getContentPane().add(txtpnAddress);
		
		JTextPane txtpnCity = new JTextPane();
		txtpnCity.setText("Address:");
		txtpnCity.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity.setBounds(12, 421, 90, 20);
		getContentPane().add(txtpnCity);
		
		JTextPane txtpnPet_1 = new JTextPane();
		txtpnPet_1.setText("Size(s.m):");
		txtpnPet_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_1.setBounds(12, 452, 90, 20);
		getContentPane().add(txtpnPet_1);
		
		JTextPane txtpnHeating = new JTextPane();
		txtpnHeating.setText("Floor:");
		txtpnHeating.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnHeating.setBounds(12, 483, 90, 20);
		getContentPane().add(txtpnHeating);
		
		JTextPane txtpnPet_2 = new JTextPane();
		txtpnPet_2.setText("Heating:");
		txtpnPet_2.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_2.setBounds(12, 514, 80, 20);
		getContentPane().add(txtpnPet_2);
		
		JTextPane txtpnPet_3 = new JTextPane();
		txtpnPet_3.setText("Pet:");
		txtpnPet_3.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_3.setBounds(12, 545, 72, 20);
		getContentPane().add(txtpnPet_3);
		
		JTextPane txtpnRent = new JTextPane();
		txtpnRent.setText("Rent:");
		txtpnRent.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnRent.setBounds(12, 605, 95, 20);
		getContentPane().add(txtpnRent);
		
		JTextPane txtpnCity_1 = new JTextPane();
		txtpnCity_1.setText("House information:");
		txtpnCity_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity_1.setBounds(12, 352, 144, 20);
		getContentPane().add(txtpnCity_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 380, 395, 2);
		getContentPane().add(separator_1);
		
		JTextPane txtpnBedrooms = new JTextPane();
		txtpnBedrooms.setText("Bedrooms:");
		txtpnBedrooms.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnBedrooms.setBounds(12, 576, 80, 20);
		getContentPane().add(txtpnBedrooms);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(129, 390, 126, 20);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(129, 421, 126, 20);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(129, 452, 126, 20);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(129, 483, 126, 20);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(129, 514, 126, 20);
		getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(129, 574, 126, 20);
		getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(129, 605, 126, 20);
		getContentPane().add(textField_12);
		
		JRadioButton rdbtnHousePetYes = new JRadioButton("Yes");
		rdbtnHousePetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetYes.setBounds(122, 545, 72, 23);
		getContentPane().add(rdbtnHousePetYes);
		
		JRadioButton rdbtnHousePetNo = new JRadioButton("No");
		rdbtnHousePetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetNo.setBounds(221, 545, 72, 23);
		getContentPane().add(rdbtnHousePetNo);
		
		rdbtnHousePetYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHousePetNo.setEnabled(false);
				if(!rdbtnHousePetYes.isSelected()) {
					rdbtnHousePetNo.setEnabled(true);
				}
			}
		});
		
		rdbtnHousePetNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHousePetYes.setEnabled(false);
				if(!rdbtnHousePetNo.isSelected()) {
					rdbtnHousePetYes.setEnabled(true);
				}
			}
		});
		
		JButton btnNewButton = new JButton("Create Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(139, 636, 106, 23);
		getContentPane().add(btnNewButton);
		theRegistry = aRegistry;
		
		this.setVisible(true);
		this.setSize(445, 714);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
