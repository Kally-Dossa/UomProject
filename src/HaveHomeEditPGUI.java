import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
/*
 * HaveHomeEditPGUI is the graphic interface where a user 
 * that has a home can change his information as 
 * he likes. The new information are updated at 
 * the serial files used as "database".
 */
public class HaveHomeEditPGUI extends JFrame{
	private HaveHome user;
	private Registry registry;
	private JPasswordField passwordField;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField emailField;
	private JTextField ageField;
	private JTextField langField;
	private JTextField hAreaField;
	private JTextField hAddressField;
	private JTextField hSizeField;
	private JTextField hFloorField;
	private JTextField hHeatingField;
	private JTextField hBedroomsFIeld;
	private JTextField hRentField;
	private JTextField phoneField;
	
	public HaveHomeEditPGUI(HaveHome aUser, Registry aRegistry) {
		user = aUser;
		registry = aRegistry;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setTitle("My Profile");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBackground(UIManager.getColor("List.selectionBackground"));
		lblName.setBounds(38, 72, 74, 20);
		getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBackground(UIManager.getColor("List.selectionBackground"));
		lblSurname.setBounds(38, 103, 74, 20);
		getContentPane().add(lblSurname);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		lblEmail.setBounds(38, 134, 74, 20);
		getContentPane().add(lblEmail);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setBackground(UIManager.getColor("List.selectionBackground"));
		lblPass.setBounds(38, 165, 87, 20);
		getContentPane().add(lblPass);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBackground(UIManager.getColor("List.selectionBackground"));
		lblAge.setBounds(38, 196, 87, 20);
		getContentPane().add(lblAge);
		
		JLabel lblLang = new JLabel("Language:");
		lblLang.setBackground(UIManager.getColor("List.selectionBackground"));
		lblLang.setBounds(38, 267, 87, 20);
		getContentPane().add(lblLang);
		
		JLabel lblPhonenumber = new JLabel("PhoneNumber:");
		lblPhonenumber.setBackground(SystemColor.textHighlight);
		lblPhonenumber.setBounds(38, 227, 87, 20);
		getContentPane().add(lblPhonenumber);
		
		phoneField = new JTextField(user.getPhoneNum());
		phoneField.setColumns(10);
		phoneField.setBounds(136, 227, 140, 20);
		getContentPane().add(phoneField);
		
		passwordField = new JPasswordField(user.getPass());
		passwordField.setBounds(136, 165, 140, 20);
		getContentPane().add(passwordField);
		
		nameField = new JTextField(user.getName());
		nameField.setBounds(136, 72, 140, 20);
		getContentPane().add(nameField);
		nameField.setColumns(10);
		
		surnameField = new JTextField(user.getLastName());
		surnameField.setColumns(10);
		surnameField.setBounds(136, 103, 140, 20);
		getContentPane().add(surnameField);
		
		emailField = new JTextField(user.getEmail());
		emailField.setColumns(10);
		emailField.setBounds(136, 134, 140, 20);
		getContentPane().add(emailField);
		
		ageField = new JTextField(Integer.toString(user.getAge()));
		ageField.setColumns(10);
		ageField.setBounds(136, 196, 140, 20);
		getContentPane().add(ageField);
		
		langField = new JTextField(user.getLanguage());
		langField.setColumns(10);
		langField.setBounds(136, 267, 140, 20);
		getContentPane().add(langField);
		
		JLabel lblSmoker = new JLabel("Smoker:");
		lblSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		lblSmoker.setBounds(38, 326, 64, 20);
		getContentPane().add(lblSmoker);
		
		JLabel lblPet = new JLabel("Pet:");
		lblPet.setBackground(SystemColor.textHighlight);
		lblPet.setBounds(38, 357, 64, 20);
		getContentPane().add(lblPet);
		
		JLabel lblEmployed = new JLabel("Employed:");
		lblEmployed.setBackground(SystemColor.textHighlight);
		lblEmployed.setBounds(38, 387, 64, 20);
		getContentPane().add(lblEmployed);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(38, 303, 46, 14);
		getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");		
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(139, 299, 64, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");	
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(212, 299, 98, 23);
		getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnSmYes = new JRadioButton("Yes");	
		rdbtnSmYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmYes.setBounds(139, 325, 64, 23);
		getContentPane().add(rdbtnSmYes);
		
		JRadioButton rdbtnPetYes = new JRadioButton("Yes");
		rdbtnPetYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetYes.setBounds(139, 356, 64, 23);
		getContentPane().add(rdbtnPetYes);
		
		JRadioButton rdbtnEmpYes = new JRadioButton("Yes");
		rdbtnEmpYes.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmpYes.setBounds(139, 386, 64, 23);
		getContentPane().add(rdbtnEmpYes);
		
		JRadioButton rdbtnSmNo = new JRadioButton("No");
		rdbtnSmNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmNo.setBounds(212, 325, 64, 23);
		getContentPane().add(rdbtnSmNo);
		
		JRadioButton rdbtnPetNo = new JRadioButton("No");	
		rdbtnPetNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetNo.setBounds(212, 356, 64, 23);
		getContentPane().add(rdbtnPetNo);
		
		JRadioButton rdbtnEmpNo = new JRadioButton("No");	
		rdbtnEmpNo.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnEmpNo.setBounds(212, 386, 64, 23);
		getContentPane().add(rdbtnEmpNo);
		
		if(user.getSex().equals("Male")) {
			rdbtnMale.setSelected(true);
			rdbtnFemale.setEnabled(false);
		} else {
			rdbtnFemale.setSelected(true);
			rdbtnMale.setEnabled(false);
		}
		
		if(user.hasPet()) {
			rdbtnPetYes.setSelected(true);
			rdbtnPetNo.setEnabled(false);
		} else {
			rdbtnPetNo.setSelected(true);
			rdbtnPetYes.setEnabled(false);
		}
		
		if(user.isSmoker()) {
			rdbtnSmYes.setSelected(true);
			rdbtnSmNo.setEnabled(false);
		} else {
			rdbtnSmNo.setSelected(true);
			rdbtnSmYes.setEnabled(false);
		}
		
		if(user.getProfessionalStatus()) {
			rdbtnEmpYes.setSelected(true);
			rdbtnEmpNo.setEnabled(false);
		} else {
			rdbtnEmpNo.setSelected(true);
			rdbtnEmpYes.setEnabled(false);
		}
		
		
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnFemale.setEnabled(false);
				if(!rdbtnMale.isSelected())
					rdbtnFemale.setEnabled(true);
			}
		});
		
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMale.setEnabled(false);
				if(!rdbtnFemale.isSelected())
					rdbtnMale.setEnabled(true);
			}
		});
		
		rdbtnSmYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSmNo.setEnabled(false);
				if(!rdbtnSmYes.isBorderPainted())
					rdbtnSmNo.setEnabled(true);
			}
		});
		
		rdbtnPetYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPetNo.setEnabled(false);
				if(!rdbtnPetYes.isSelected())
					rdbtnPetNo.setEnabled(true);
			}
		});
		
		rdbtnSmNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSmYes.setEnabled(false);
				if(!rdbtnSmNo.isSelected())
					rdbtnSmYes.setEnabled(true);
			}
		});
		
		rdbtnPetNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPetYes.setEnabled(false);
				if(!rdbtnPetNo.isSelected())
					rdbtnPetYes.setEnabled(true);					
			}
		});
		
		rdbtnEmpYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnEmpNo.setEnabled(false);
				if(!rdbtnEmpYes.isSelected())
					rdbtnEmpNo.setEnabled(true);
			}
		});
		
		rdbtnEmpNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnEmpYes.setEnabled(false);
				if(!rdbtnEmpNo.isSelected())
					rdbtnEmpYes.setEnabled(true);
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 45, 272, 2);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("My Information:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(91, 24, 126, 23);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 24, 272, 2);
		getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(23, 416, 272, 2);
		getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(23, 442, 272, 2);
		getContentPane().add(separator_3);
		
		JLabel lblHouseInformation = new JLabel("House Information:");
		lblHouseInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblHouseInformation.setBounds(91, 421, 140, 23);
		getContentPane().add(lblHouseInformation);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBackground(SystemColor.textHighlight);
		lblArea.setBounds(23, 455, 48, 20);
		getContentPane().add(lblArea);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBackground(SystemColor.textHighlight);
		lblAddress.setBounds(23, 486, 64, 20);
		getContentPane().add(lblAddress);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBackground(SystemColor.textHighlight);
		lblSize.setBounds(23, 517, 58, 20);
		getContentPane().add(lblSize);
		
		JLabel lblFloor = new JLabel("Floor:");
		lblFloor.setBackground(SystemColor.textHighlight);
		lblFloor.setBounds(23, 548, 58, 20);
		getContentPane().add(lblFloor);
		
		JLabel lblHeating = new JLabel("Heating:");
		lblHeating.setBackground(SystemColor.textHighlight);
		lblHeating.setBounds(23, 578, 64, 20);
		getContentPane().add(lblHeating);
		
		JLabel lblHPet = new JLabel("Pets Allowed:");
		lblHPet.setBackground(SystemColor.textHighlight);
		lblHPet.setBounds(23, 609, 89, 20);
		getContentPane().add(lblHPet);
		
		JLabel lblBedrooms = new JLabel("Bedrooms:");
		lblBedrooms.setBackground(SystemColor.textHighlight);
		lblBedrooms.setBounds(23, 640, 74, 20);
		getContentPane().add(lblBedrooms);
		
		JLabel lblRent = new JLabel("Rent:");
		lblRent.setBackground(SystemColor.textHighlight);
		lblRent.setBounds(23, 671, 64, 20);
		getContentPane().add(lblRent);
		
		hAreaField = new JTextField(user.getHome().getArea());
		hAreaField.setColumns(10);
		hAreaField.setBounds(136, 455, 140, 20);
		getContentPane().add(hAreaField);
		
		hAddressField = new JTextField(user.getHome().getAddress());
		hAddressField.setColumns(10);
		hAddressField.setBounds(136, 486, 140, 20);
		getContentPane().add(hAddressField);
		
		hSizeField = new JTextField(Integer.toString(user.getHome().getM2()));
		hSizeField.setColumns(10);
		hSizeField.setBounds(136, 517, 140, 20);
		getContentPane().add(hSizeField);
		
		hFloorField = new JTextField(Integer.toString(user.getHome().getFloor()));
		hFloorField.setColumns(10);
		hFloorField.setBounds(136, 548, 140, 20);
		getContentPane().add(hFloorField);
		
		hHeatingField = new JTextField(user.getHome().getHeating());
		hHeatingField.setColumns(10);
		hHeatingField.setBounds(136, 578, 140, 20);
		getContentPane().add(hHeatingField);
		
		hBedroomsFIeld = new JTextField(Integer.toString(user.getHome().getBedrooms()));
		hBedroomsFIeld.setColumns(10);
		hBedroomsFIeld.setBounds(136, 640, 140, 20);
		getContentPane().add(hBedroomsFIeld);
		
		hRentField = new JTextField(Double.toString(user.getHome().getRent()));
		hRentField.setColumns(10);
		hRentField.setBounds(136, 671, 140, 20);
		getContentPane().add(hRentField);
		
		JRadioButton rdbtnPetAllowed = new JRadioButton("Allowed");
		rdbtnPetAllowed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPetAllowed.setBounds(136, 608, 64, 23);
		getContentPane().add(rdbtnPetAllowed);
		
		JRadioButton rdbtnNotAllowed = new JRadioButton("Not Allowed");
		rdbtnNotAllowed.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNotAllowed.setBounds(212, 608, 98, 23);
		getContentPane().add(rdbtnNotAllowed);
		if(user.getHome().petAllowed()) {
			rdbtnPetAllowed.setSelected(true);
			rdbtnNotAllowed.setEnabled(false);
		} else {
			rdbtnNotAllowed.setSelected(true);
			rdbtnPetAllowed.setEnabled(false);
		}
		
		rdbtnNotAllowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPetAllowed.setEnabled(false);
				if(!rdbtnNotAllowed.isSelected())
					rdbtnPetAllowed.setEnabled(true);
			}
		});
		
		rdbtnPetAllowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNotAllowed.setEnabled(false);
				if(!rdbtnPetAllowed.isSelected())
					rdbtnNotAllowed.setEnabled(true);
			}
		});
		
		JButton btnEdit = new JButton("Edit Profile");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double rent = Double.parseDouble(hRentField.getText());
				int age = Integer.parseInt(ageField.getText());
				int houseSize = Integer.parseInt(hSizeField.getText());
				int bedrooms = Integer.parseInt(hBedroomsFIeld.getText());
				int floor = Integer.parseInt(hFloorField.getText());
				String gender = "";
				
				
				
				if(rdbtnMale.isSelected()) {
					gender = rdbtnMale.getText();
				}
				
				else {
					gender = rdbtnFemale.getText();
				}
				
				Home aHome = new Home(rent, hAddressField.getText(), hAreaField.getText(), rdbtnPetAllowed.isSelected(), hHeatingField.getText(),
									 	bedrooms, floor, houseSize);
				
				File f = new File("HaveHomeList.ser");
				try {
					user.editUser(nameField.getText(),surnameField.getText(),gender,age
						,emailField.getText(),passwordField.getPassword().toString(), phoneField.getText(),langField.getText(),
						rdbtnPetYes.isSelected(),rdbtnSmYes.isSelected(),rdbtnEmpYes.isSelected(), aHome);
					
					
					FileOutputStream fouts = new FileOutputStream(f, false);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(registry.getListWithHome());
					douts.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Profile Editted Succesfully!");
			}
		});
		btnEdit.setBounds(104, 718, 110, 23);
		getContentPane().add(btnEdit);
		
		JButton btnNewButton_1 = new JButton("<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchingRoomateGUI(user,registry);
				dispose();
			}
		});
		btnNewButton_1.setBounds(225, 760, 70, 23);
		getContentPane().add(btnNewButton_1);
		
		this.setVisible(true);
		this.setSize(332, 830);
	}
}
