import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldMail;
	private JTextField textFieldPass;
	private JTextField textFieldPhone;
	private JTextField textFieldLang;
	private JTextField textFieldCity;
	private JTextField textFieldAddress;
	private JTextField textFieldSize;
	private JTextField textFieldFloor;
	private JTextField textFieldHeating;
	private JTextField textFieldBedrooms;
	private JTextField textFieldRent;
	
	public HaveHomeSignUpGUI(Registry aRegistry) {
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setResizable(false);
		setTitle("Create Profile");
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 400);
		getContentPane().add(scrollPane);
		
		JTextPane txtpnPleaseFillThe = new JTextPane();						//afta einai ta gramata "plese fill the following info"
		txtpnPleaseFillThe.setFont(new Font("Tahoma", Font.PLAIN, 13));				//gramatosira kai megethos gramaton
		txtpnPleaseFillThe.setBackground(UIManager.getColor("List.selectionBackground"));	//xroma background
		txtpnPleaseFillThe.setEditable(false);							//na min exis tin dinatotita gia edit
		txtpnPleaseFillThe.setText("Please fill the following information about you:");		//ti grafi to pane
		txtpnPleaseFillThe.setBounds(12, 11, 318, 20);						//size
		getContentPane().add(txtpnPleaseFillThe);						//to prostheti sto geniko pane
		
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
		
		textFieldName = new JTextField();
		textFieldName.setBounds(129, 42, 126, 20);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();				//ta textField einai ta koutakia opou o xristis mpori na pliktrologisi dipla apo ta stoixia pou tou zita
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(129, 73, 126, 20);
		getContentPane().add(textFieldSurname);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(129, 135, 126, 20);
		getContentPane().add(textFieldAge);
		
		textFieldMail = new JTextField();
		textFieldMail.setColumns(10);
		textFieldMail.setBounds(129, 166, 126, 20);
		getContentPane().add(textFieldMail);
		//JRadioButton einai ta koutakia epilogis stin simplirosi stoixion
		JRadioButton rdbtnMale = new JRadioButton("Male");				
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(122, 104, 72, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(221, 104, 72, 23);
		getContentPane().add(rdbtnFemale);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(10, 197, 80, 23);
		getContentPane().add(txtpnPassword);
		
		textFieldPass = new JTextField();
		textFieldPass.setBounds(129, 197, 126, 20);
		getContentPane().add(textFieldPass);
		textFieldPass.setColumns(10);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setText("Phone:");
		txtpnPhone.setEditable(false);
		txtpnPhone.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPhone.setBounds(12, 231, 72, 20);
		getContentPane().add(txtpnPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(131, 231, 126, 20);
		getContentPane().add(textFieldPhone);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setText("Language:");
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnLanguage.setBounds(12, 262, 80, 20);
		getContentPane().add(txtpnLanguage);
		
		textFieldLang = new JTextField();
		textFieldLang.setColumns(10);
		textFieldLang.setBounds(131, 262, 126, 20);
		getContentPane().add(textFieldLang);
		
		JTextPane txtpnPet = new JTextPane();
		txtpnPet.setText("Pet:");
		txtpnPet.setEditable(false);
		txtpnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet.setBounds(12, 293, 72, 20);
		getContentPane().add(txtpnPet);
		
		JRadioButton rdbtnPetYes = new JRadioButton("Yes");
		rdbtnPetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetYes.setBounds(124, 293, 72, 23);
		getContentPane().add(rdbtnPetYes);
		
		JRadioButton rdbtnPetNo = new JRadioButton("No");
		rdbtnPetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetNo.setBounds(223, 293, 72, 23);
		getContentPane().add(rdbtnPetNo);
		
		JRadioButton rdbtnSmokingNo = new JRadioButton("No");
		rdbtnSmokingNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingNo.setBounds(223, 324, 72, 23);
		getContentPane().add(rdbtnSmokingNo);
		
		JRadioButton rdbtnSmokingYes = new JRadioButton("Yes");
		rdbtnSmokingYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingYes.setBounds(124, 324, 72, 23);
		getContentPane().add(rdbtnSmokingYes);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setText("Smoker:");
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setBounds(12, 324, 101, 20);
		getContentPane().add(txtpnSmoker);
		
		JTextPane txtpnWorking = new JTextPane();
		txtpnWorking.setText("Working");
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWorking.setBounds(14, 355, 90, 20);
		getContentPane().add(txtpnWorking);
		
		JRadioButton rdbtnEmployed = new JRadioButton("Employed");
		rdbtnEmployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmployed.setBounds(124, 352, 72, 23);
		getContentPane().add(rdbtnEmployed);
		
		JRadioButton rdbtnUnemployed = new JRadioButton("Unemployed");
		rdbtnUnemployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnUnemployed.setBounds(223, 350, 90, 23);
		getContentPane().add(rdbtnUnemployed);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(14, 380, 395, 2);
		getContentPane().add(separator);
		
		JTextPane txtpnCity_1 = new JTextPane();
		txtpnCity_1.setText("House information:");
		txtpnCity_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity_1.setBounds(14, 386, 144, 20);
		getContentPane().add(txtpnCity_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 414, 395, 2);
		getContentPane().add(separator_1);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setText("City:");
		txtpnAddress.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAddress.setBounds(14, 424, 80, 20);
		getContentPane().add(txtpnAddress);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(131, 424, 126, 20);
		getContentPane().add(textFieldCity);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(131, 455, 126, 20);
		getContentPane().add(textFieldAddress);
		
		JTextPane txtpnCity = new JTextPane();
		txtpnCity.setText("Address:");
		txtpnCity.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity.setBounds(14, 455, 90, 20);
		getContentPane().add(txtpnCity);
		
		JTextPane txtpnPet_1 = new JTextPane();
		txtpnPet_1.setText("Size(s.m):");
		txtpnPet_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_1.setBounds(14, 486, 90, 20);
		getContentPane().add(txtpnPet_1);
		
		textFieldSize = new JTextField();
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(131, 486, 126, 20);
		getContentPane().add(textFieldSize);
		
		textFieldFloor = new JTextField();
		textFieldFloor.setColumns(10);
		textFieldFloor.setBounds(131, 517, 126, 20);
		getContentPane().add(textFieldFloor);
		
		JTextPane txtpnHeating = new JTextPane();
		txtpnHeating.setText("Floor:");
		txtpnHeating.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnHeating.setBounds(14, 517, 90, 20);
		getContentPane().add(txtpnHeating);
		
		JTextPane txtpnPet_2 = new JTextPane();
		txtpnPet_2.setText("Heating:");
		txtpnPet_2.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_2.setBounds(14, 548, 80, 20);
		getContentPane().add(txtpnPet_2);
		
		textFieldHeating = new JTextField();
		textFieldHeating.setColumns(10);
		textFieldHeating.setBounds(131, 548, 126, 20);
		getContentPane().add(textFieldHeating);
		
		JRadioButton rdbtnHousePetNo = new JRadioButton("No");
		rdbtnHousePetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetNo.setBounds(223, 579, 72, 23);
		getContentPane().add(rdbtnHousePetNo);
		
		JRadioButton rdbtnHousePetYes = new JRadioButton("Yes");
		rdbtnHousePetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetYes.setBounds(124, 579, 72, 23);
		getContentPane().add(rdbtnHousePetYes);
		
		JTextPane txtpnPet_3 = new JTextPane();
		txtpnPet_3.setText("Pet:");
		txtpnPet_3.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_3.setBounds(14, 579, 72, 20);
		getContentPane().add(txtpnPet_3);
		
		JTextPane txtpnBedrooms = new JTextPane();
		txtpnBedrooms.setText("Bedrooms:");
		txtpnBedrooms.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnBedrooms.setBounds(14, 610, 80, 20);
		getContentPane().add(txtpnBedrooms);
		
		textFieldBedrooms = new JTextField();
		textFieldBedrooms.setColumns(10);
		textFieldBedrooms.setBounds(131, 608, 126, 20);
		getContentPane().add(textFieldBedrooms);
		
		textFieldRent = new JTextField();
		textFieldRent.setColumns(10);
		textFieldRent.setBounds(131, 639, 126, 20);
		getContentPane().add(textFieldRent);
		
		JTextPane txtpnRent = new JTextPane();
		txtpnRent.setText("Rent:");
		txtpnRent.setBackground(new Color(0, 120, 215));
		txtpnRent.setBounds(14, 639, 95, 20);
		getContentPane().add(txtpnRent);
		
		JButton btnNewButton = new JButton("Create Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<HaveHome> users = new ArrayList<HaveHome>();
				int bedrooms = Integer.parseInt(textFieldBedrooms.getText());
				int floor = Integer.parseInt(textFieldFloor.getText());
				int size = Integer.parseInt(textFieldSize.getText());
				int rent = Integer.parseInt(textFieldRent.getText());
				Home aHome = new Home(rent, textFieldAddress.getText(), textFieldCity.getText(), rdbtnHousePetYes.isSelected(),	
										textFieldHeating.getText(), bedrooms, floor, size);
				
				String gender = "";
				int age = Integer.parseInt(textFieldAge.getText());
				if(rdbtnMale.isSelected()) {																	//Create HaveHome Profile button listener																															
					gender = rdbtnMale.getText();																//diavazei apo to arxeio tin yparxoysa lista me tous xristes
				}																								//pou exoun spiti kai prosthetei ton kainourio, kanei update
																												//ti HaveHome lista tis Registry kai gyrnaei sto staringGUI 	
				else {																							//gia na kanei log in o xristis
					gender = rdbtnFemale.getText();
				}
				
				try {
					FileInputStream fileIn = new FileInputStream("Users_With_Home.ser");												
					ObjectInputStream in = new ObjectInputStream(fileIn);
					users = (ArrayList<HaveHome>) in.readObject();
					in.close();
					fileIn.close();		
				}
				catch(IOException i) {
					i.printStackTrace();
				}
				catch(ClassNotFoundException c) {
					c.printStackTrace();
				}
				
				File f = new File("Users_With_Home.ser");
				try {
					HaveHome aUser = new HaveHome(textFieldName.getText(),textFieldSurname.getText(),gender,age
						,textFieldMail.getText(),textFieldPass.getText(), textFieldPhone.getText(),textFieldLang.getText(),
						rdbtnPetYes.isSelected(),rdbtnSmokingYes.isSelected(),rdbtnEmployed.isSelected(), aHome);
					
					users.add(aUser);
					
;					FileOutputStream fouts = new FileOutputStream(f);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(users);
					douts.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				theRegistry.changeHaveHomeList(users);
				HaveHomeSignUpGUI.this.setVisible(false);
				new StartingGUI(theRegistry);
			}
		});
		btnNewButton.setBounds(141, 670, 106, 23);
		getContentPane().add(btnNewButton);
		
		//Personal Info Radio Buttons Listeners
		rdbtnMale.addActionListener(new ActionListener() {  	 //se dini tin dinatotita na epileksis metaksi 2 epilogon (male or female) oxi kai ta 2!
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
		theRegistry = aRegistry;
		
		this.setVisible(true);
		this.setSize(445, 755);
		this.setTitle("Create Profile");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
