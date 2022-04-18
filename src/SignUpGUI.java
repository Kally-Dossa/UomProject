import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ItemEvent;

public class SignUpGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	
	public SignUpGUI() {
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setBackground(new Color(0, 204, 255));
		
		
			
		this.setVisible(true);
		this.setSize(314, 468);
		//this.pack();
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
		txtpnGender.setBounds(10, 101, 49, 20);
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(10, 131, 30, 20);
		getContentPane().add(txtpnAge);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(10, 162, 38, 20);
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
		txtpnPet.setBounds(10, 253, 49, 20);
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setText("Smoker:");
		txtpnSmoker.setBounds(10, 284, 49, 20);
		getContentPane().add(txtpnSmoker);
		
		textField = new JTextField();
		textField.setBounds(109, 43, 106, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 74, 106, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton.setBounds(109, 98, 64, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton_1.setBounds(196, 98, 70, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 131, 106, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 162, 108, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(109, 193, 106, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(109, 224, 109, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Yes");
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		rdbtnNewRadioButton_2.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton_2.setBounds(109, 253, 49, 23);
		getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("No");
		rdbtnNewRadioButton_3.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton_3.setBounds(196, 250, 49, 23);
		getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_2_1.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton_2_1.setBounds(109, 284, 49, 23);
		getContentPane().add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("No");
		rdbtnNewRadioButton_3_1.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton_3_1.setBounds(196, 284, 45, 23);
		getContentPane().add(rdbtnNewRadioButton_3_1);
		
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
		
		JButton btnNewButton = new JButton("Create Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				int age = Integer.parseInt(textField_2.getText());
				if(rdbtnNewRadioButton.isSelected()) {
					gender = rdbtnNewRadioButton.getText();
				}
				
				else {
					gender = rdbtnNewRadioButton_1.getText();
				}
				User aUser = new NoHome(textField.getText(),textField_1.getText(),gender,age
						,textField_3.getText(),textField_4.getText(),textField_5.getText(),
						rdbtnNewRadioButton_2.isSelected(),rdbtnNewRadioButton_2_1.isSelected(),rdbtnEmployed.isSelected());
				File f = new File("ourDatabase.txt");
				try {
					FileOutputStream fouts = new FileOutputStream(f);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(aUser);
					douts.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}); 
		btnNewButton.setBounds(88, 395, 106, 23);
		getContentPane().add(btnNewButton);
		
		
		
	}
}
