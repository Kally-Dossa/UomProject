import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserGUI extends JFrame {
	
	private JPanel panel;
	private JButton button1, button2;
	private JTextField userFieldName, userFieldLastName, userFieldAge, userFieldSex, 
						userFieldPet, userFieldSmoke, userFieldEmail, userFieldPhoneNum,
						userFieldLanguage, userFieldProfessionalStatus;
	
	public UserGUI() {
		
		panel = new JPanel();
		
		//Name
		userFieldName = new JTextField("Please enter your name ");
		panel.add(userFieldName);
		
		//LastName
		userFieldLastName = new JTextField("Please enter your  last name ");
		panel.add(userFieldLastName);
		
		//Age
		userFieldAge = new JTextField("Please enter your  age ");
		panel.add(userFieldAge);
		
		//Sex
		userFieldSex = new JTextField("Please enter your  sex ");
		panel.add(userFieldSex);	
		
		//Pet
		userFieldPet = new JTextField("Do you have pet? ");
		panel.add(userFieldPet);	
	
		
		//Smoker
		userFieldSmoke = new JTextField("Do you smoke? ");
		panel.add(userFieldSmoke);	
		
		//email
		userFieldEmail = new JTextField("Please enter your email ");
		panel.add(userFieldEmail);	
		
		//PhomeNumber
		userFieldPhoneNum = new JTextField("Please enter your phone number ");
		panel.add(userFieldPhoneNum);	
		
		//Language
		userFieldLanguage = new JTextField("Please enter your language ");
		panel.add(userFieldLanguage);	

		//ProfStatus
		userFieldProfessionalStatus = new JTextField("Please enter your professional status ");
		panel.add(userFieldProfessionalStatus);
			
		
		
		//Δημιουργια πρωτου πληκτρου
		button1 = new JButton(" Add me ");
		panel.add(button1);
		
		button2 = new JButton(" I have home ");
		panel.add(button2);

		
		this.setContentPane(panel);	
		
		//τι να κανει οταν παταω αδδ
		ButtonListener add= new ButtonListener();
		button1.addActionListener(add);
		
		OtherButtonListener haveHome= new OtherButtonListener();
		button1.addActionListener(haveHome);
		
			
		this.setVisible(true);
		this.setSize(400, 600);
		//this.pack();
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	  //δημιουργία κλάσης ακροατή
		class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				
				//θα τον βαζει στο αρχειο μας
			
			}
		}
		
		class OtherButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
			
				dispose();
				//θα πηγαινει στο παραθυρο για τα στοιχεια του σπιτιου
			}
		}	
	

}
