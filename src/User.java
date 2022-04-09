import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JFrame {
	
	private JPanel panel;
	private JButton button1, button2;
	private JTextField userFieldName, userFieldLastName, userFieldAge, userFieldSex, userFieldPet, userFieldSmoke;
	
	public User() {
		
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
		
		//Age
		userFieldSex = new JTextField("Please enter your  sex ");
		panel.add(userFieldSex);	
		
		//Pet
		userFieldPet = new JTextField("Do you have pet? ");
		panel.add(userFieldPet);	
	
		
		//Smoker
		userFieldSmoke = new JTextField("Do you smoke? ");
		panel.add(userFieldSmoke);	
			
		
		//Δημιουργια πρωτου πληκτρου
		button1 = new JButton("Add me");
		panel.add(button1);
		
		this.setContentPane(panel);	
		
		//τι να κανει οταν παταω αδδ
		ButtonListener find= new ButtonListener();
		button1.addActionListener(find);
		
			
		this.setVisible(true);
		this.setSize(400, 600);
		//this.pack();
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	  //δημιουργία κλάσης ακροατή
		class ButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
			
			}
		}
		
		
	

}
