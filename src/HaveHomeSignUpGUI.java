
import java.awt.Font;
import java.awt.SystemColor;
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JPasswordField;

public class HaveHomeSignUpGUI extends JFrame {
	private Registry theRegistry;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldMail;
	private JTextField textFieldPhone;
	private JTextField textFieldLang;
	private JTextField textFieldCity;
	private JTextField textFieldAddress;
	private JTextField textFieldSize;
	private JTextField textFieldFloor;
	private JTextField textFieldHeat;
	private JTextField textFieldBRooms;
	private JTextField textFieldRent;
	private JPasswordField passwordField;
	
	public HaveHomeSignUpGUI(Registry aRegistry) {
		theRegistry = aRegistry;
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
		txtpnGender.setBounds(12, 259, 90, 20);
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age");
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAge.setBounds(12, 166, 90, 20);
		getContentPane().add(txtpnAge);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setText("Email:");
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setBounds(12, 104, 90, 20);
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
		txtpnPet.setBounds(10, 286, 72, 20);
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setText("Smoker:");
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setBounds(10, 317, 101, 20);
		getContentPane().add(txtpnSmoker);
		
		JTextPane txtpnWorking = new JTextPane();
		txtpnWorking.setText("Working:");
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWorking.setBounds(12, 348, 90, 20);
		getContentPane().add(txtpnWorking);
		
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
		textFieldAge.setBounds(129, 166, 126, 20);
		getContentPane().add(textFieldAge);
		
		textFieldMail = new JTextField();
		textFieldMail.setColumns(10);
		textFieldMail.setBounds(129, 104, 126, 20);
		getContentPane().add(textFieldMail);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(129, 197, 126, 20);
		getContentPane().add(textFieldPhone);
		
		textFieldLang = new JTextField();
		textFieldLang.setColumns(10);
		textFieldLang.setBounds(129, 228, 126, 20);
		getContentPane().add(textFieldLang);
		//JRadioButton einai ta koutakia epilogis stin simplirosi stoixion
		JRadioButton rdbtnMale = new JRadioButton("Male");				
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(122, 256, 72, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(221, 256, 72, 23);
		getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnPetYes = new JRadioButton("Yes");
		rdbtnPetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetYes.setBounds(122, 286, 72, 23);
		getContentPane().add(rdbtnPetYes);
		
		JRadioButton rdbtnPetNo = new JRadioButton("No");
		rdbtnPetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetNo.setBounds(221, 286, 72, 23);
		getContentPane().add(rdbtnPetNo);
		
		JRadioButton rdbtnSmokingYes = new JRadioButton("Yes");
		rdbtnSmokingYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingYes.setBounds(122, 317, 72, 23);
		getContentPane().add(rdbtnSmokingYes);
		
		JRadioButton rdbtnSmokingNo = new JRadioButton("No");
		rdbtnSmokingNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmokingNo.setBounds(221, 317, 72, 23);
		getContentPane().add(rdbtnSmokingNo);
		
		JRadioButton rdbtnEmployed = new JRadioButton("Employed");
		rdbtnEmployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmployed.setBounds(122, 345, 72, 23);
		getContentPane().add(rdbtnEmployed);
		
		JRadioButton rdbtnUnemployed = new JRadioButton("Unemployed");
		rdbtnUnemployed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnUnemployed.setBounds(221, 343, 90, 23);
		getContentPane().add(rdbtnUnemployed);
		
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 373, 395, 2);
		getContentPane().add(separator);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setEditable(false);
		txtpnAddress.setText("Area:");
		txtpnAddress.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAddress.setBounds(12, 417, 80, 20);
		getContentPane().add(txtpnAddress);
		
		JTextPane txtpnCity = new JTextPane();
		txtpnCity.setEditable(false);
		txtpnCity.setText("Address:");
		txtpnCity.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity.setBounds(12, 448, 90, 20);
		getContentPane().add(txtpnCity);
		
		JTextPane txtpnPet_1 = new JTextPane();
		txtpnPet_1.setEditable(false);
		txtpnPet_1.setText("Size(s.m):");
		txtpnPet_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_1.setBounds(12, 479, 90, 20);
		getContentPane().add(txtpnPet_1);
		
		JTextPane txtpnHeating = new JTextPane();
		txtpnHeating.setEditable(false);
		txtpnHeating.setText("Floor:");
		txtpnHeating.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnHeating.setBounds(12, 510, 90, 20);
		getContentPane().add(txtpnHeating);
		
		JTextPane txtpnPet_2 = new JTextPane();
		txtpnPet_2.setEditable(false);
		txtpnPet_2.setText("Heating:");
		txtpnPet_2.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_2.setBounds(12, 541, 80, 20);
		getContentPane().add(txtpnPet_2);
		
		JTextPane txtpnPet_3 = new JTextPane();
		txtpnPet_3.setEditable(false);
		txtpnPet_3.setText("Pet:");
		txtpnPet_3.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_3.setBounds(12, 572, 72, 20);
		getContentPane().add(txtpnPet_3);
		
		JTextPane txtpnRent = new JTextPane();
		txtpnRent.setEditable(false);
		txtpnRent.setText("Rent:");
		txtpnRent.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnRent.setBounds(12, 632, 95, 20);
		getContentPane().add(txtpnRent);
		
		JTextPane txtpnCity_1 = new JTextPane();
		txtpnCity_1.setText("House information:");
		txtpnCity_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity_1.setBounds(12, 379, 144, 20);
		getContentPane().add(txtpnCity_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 407, 395, 2);
		getContentPane().add(separator_1);
		
		JTextPane txtpnBedrooms = new JTextPane();
		txtpnBedrooms.setEditable(false);
		txtpnBedrooms.setText("Bedrooms:");
		txtpnBedrooms.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnBedrooms.setBounds(12, 603, 80, 20);
		getContentPane().add(txtpnBedrooms);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(129, 417, 126, 20);
		getContentPane().add(textFieldCity);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(129, 448, 126, 20);
		getContentPane().add(textFieldAddress);
		
		textFieldSize = new JTextField();
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(129, 479, 126, 20);
		getContentPane().add(textFieldSize);
		
		textFieldFloor = new JTextField();
		textFieldFloor.setColumns(10);
		textFieldFloor.setBounds(129, 510, 126, 20);
		getContentPane().add(textFieldFloor);
		
		textFieldHeat = new JTextField();
		textFieldHeat.setColumns(10);
		textFieldHeat.setBounds(129, 541, 126, 20);
		getContentPane().add(textFieldHeat);
		
		textFieldBRooms = new JTextField();
		textFieldBRooms.setColumns(10);
		textFieldBRooms.setBounds(129, 601, 126, 20);
		getContentPane().add(textFieldBRooms);
		
		textFieldRent = new JTextField();
		textFieldRent.setColumns(10);
		textFieldRent.setBounds(129, 632, 126, 20);
		getContentPane().add(textFieldRent);
		
		JRadioButton rdbtnHousePetYes = new JRadioButton("Yes");
		rdbtnHousePetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetYes.setBounds(122, 572, 72, 23);
		getContentPane().add(rdbtnHousePetYes);
		
		JRadioButton rdbtnHousePetNo = new JRadioButton("No");
		rdbtnHousePetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnHousePetNo.setBounds(221, 572, 72, 23);
		getContentPane().add(rdbtnHousePetNo);
		
		//House Info Radio Button Listeners
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
		
		JButton CreateProfileBtn = new JButton("Create Profile");
		CreateProfileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double rent = Double.parseDouble(textFieldRent.getText());
				int age = Integer.parseInt(textFieldAge.getText());
				int houseSize = Integer.parseInt(textFieldSize.getText());
				int bedrooms = Integer.parseInt(textFieldBRooms.getText());
				int floor = Integer.parseInt(textFieldFloor.getText());
				String gender = "";
				
				if(rdbtnMale.isSelected()) {
					gender = rdbtnMale.getText();
				}
				
				else {
					gender = rdbtnFemale.getText();
				}
				
				Home aHome = new Home(rent, textFieldAddress.getText(), textFieldCity.getText(), rdbtnHousePetYes.isSelected(), textFieldHeat.getText(),
									 	bedrooms, floor, houseSize);
				
				File f = new File("HaveHomeList.ser");
				try {
					HaveHome aUser = new HaveHome(textFieldName.getText(),textFieldSurname.getText(),gender,age
						,textFieldMail.getText(),passwordField.getPassword().toString(), textFieldPhone.getText(),textFieldLang.getText(),
						rdbtnPetYes.isSelected(),rdbtnSmokingYes.isSelected(),rdbtnEmployed.isSelected(), aHome);
					
					
					theRegistry.addHaveHome(aUser);
					
					FileOutputStream fouts = new FileOutputStream(f, false);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(theRegistry.getListWithHome());
					douts.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				HaveHomeSignUpGUI.this.dispose();
				new StartingGUI(theRegistry);
			}
		});
		CreateProfileBtn.setBounds(139, 689, 106, 23);
		getContentPane().add(CreateProfileBtn);
		
		JTextPane txtpnPass = new JTextPane();
		txtpnPass.setText("Password:");
		txtpnPass.setEditable(false);
		txtpnPass.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPass.setBounds(12, 136, 90, 20);
		getContentPane().add(txtpnPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(129, 135, 126, 20);
		getContentPane().add(passwordField);
		
		this.setVisible(true);
		this.setSize(429, 771);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
