import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.SystemColor;

/*
 * HaveHomeProfileGUI is the graphic  interface that shows
 * to a user that doesn't  own a house the information
 * of a another user that he picked from the suggested
 * roomates' list. If HaveHomeProfileGUI is called from 
 * MatchesGUI is also contains the contact information 
 * of the user. If it's called from SearchingRoomateGUI
 * the contact info is missing and there's a like button
 * that if it's clicked the user shown gets added in the 
 * searching user's myLikes list.
 */

public class HaveHomeProfileGUI extends JFrame{
	
	
	public HaveHomeProfileGUI(User searchingUser,boolean MatchOrNot, HaveHome aUser, Registry aRegistry) {
		Registry theRegistry = aRegistry;
		User searcher =searchingUser;
		User possibleRoomate = aUser;
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
		txtpnPleaseFillThe.setText("More about " + aUser.getName() +" " + aUser.getLastName() + ":" );		
		txtpnPleaseFillThe.setBounds(12, 11, 318, 20);					
		getContentPane().add(txtpnPleaseFillThe);
		
		JTextPane txtpnGender = new JTextPane();
		txtpnGender.setText("Gender: " + aUser.getSex());
		txtpnGender.setEditable(false);
		txtpnGender.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnGender.setBounds(14, 118, 252, 20);
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age: " + aUser.getAge() );
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAge.setBounds(14, 62, 217, 20);
		getContentPane().add(txtpnAge);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setText("Language: "  + aUser.getLanguage());
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnLanguage.setBounds(12, 87, 254, 20);
		getContentPane().add(txtpnLanguage);
		
		JTextPane txtpnPet = new JTextPane();
		if(aUser.hasPet()) {txtpnPet.setText("Pet: Yes");}
		else {txtpnPet.setText("Pet: No");}
		txtpnPet.setEditable(false);
		txtpnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet.setBounds(12, 145, 243, 20);
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		if(aUser.isSmoker()) {txtpnSmoker.setText("Smoker: Yes");}
		else {txtpnSmoker.setText("Smoker: No");}
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSmoker.setBounds(12, 176, 252, 20);
		getContentPane().add(txtpnSmoker);
		
		JTextPane txtpnWorking = new JTextPane();
		if(aUser.getProfessionalStatus()) {txtpnWorking.setText("Working: Yes");}
		else {txtpnWorking.setText("Working: No");}
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWorking.setBounds(14, 207, 241, 20);
		getContentPane().add(txtpnWorking);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(14, 232, 395, 2);
		getContentPane().add(separator);
		
		JTextPane txtpnArea = new JTextPane();
		txtpnArea.setEditable(false);
		txtpnArea.setText("Area: " + aUser.getHome().getArea());
		txtpnArea.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnArea.setBounds(14, 276, 252, 20);
		getContentPane().add(txtpnArea);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setEditable(false);
		txtpnAddress.setText("Address: " + aUser.getHome().getAddress());
		txtpnAddress.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnAddress.setBounds(14, 307, 279, 20);
		getContentPane().add(txtpnAddress);
		
		JTextPane txtpnSize = new JTextPane();
		txtpnSize.setEditable(false);
		txtpnSize.setText("Size(s.m): " + aUser.getHome().getM2());
		txtpnSize.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnSize.setBounds(14, 338, 90, 20);
		getContentPane().add(txtpnSize);
		
		JTextPane txtpnFloor = new JTextPane();
		txtpnFloor.setEditable(false);
		txtpnFloor.setText("Floor: " + aUser.getHome().getFloor());
		txtpnFloor.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnFloor.setBounds(14, 369, 73, 20);
		getContentPane().add(txtpnFloor);
		
		JTextPane txtpnHeating = new JTextPane();
		txtpnHeating.setEditable(false);
		txtpnHeating.setText("Heating:" + aUser.getHome().getHeating() );
		txtpnHeating.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnHeating.setBounds(14, 400, 138, 20);
		getContentPane().add(txtpnHeating);
		
		JTextPane txtpnPet_2 = new JTextPane();
		txtpnPet_2.setEditable(false);
		if(aUser.getHome().petAllowed()) {txtpnPet_2.setText("Pet Allowed: Yes");}
		else {txtpnPet_2.setText("Pet Allowed: No");}
		txtpnPet_2.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPet_2.setBounds(14, 431, 217, 20);
		getContentPane().add(txtpnPet_2);
		
		JTextPane txtpnRent = new JTextPane();
		txtpnRent.setEditable(false);
		txtpnRent.setText("Rent: " + aUser.getHome().getRent());
		txtpnRent.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnRent.setBounds(14, 491, 217, 20);
		getContentPane().add(txtpnRent);
		
		JTextPane txtpnBedrooms = new JTextPane();
		txtpnBedrooms.setEditable(false);
		txtpnBedrooms.setText("Bedrooms: " + aUser.getHome().getBedrooms());
		txtpnBedrooms.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnBedrooms.setBounds(14, 462, 217, 20);
		getContentPane().add(txtpnBedrooms);
		
		JTextPane txtpnCity_1 = new JTextPane();
		txtpnCity_1.setEditable(false);
		txtpnCity_1.setText("House information:");
		txtpnCity_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnCity_1.setBounds(14, 238, 144, 20);
		getContentPane().add(txtpnCity_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 266, 395, 2);
		getContentPane().add(separator_1);
		
		
		
		JButton CreateProfileBtn = new JButton("<Back");
		CreateProfileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		CreateProfileBtn.setBounds(245, 707, 106, 23);
		getContentPane().add(CreateProfileBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("List.selectionBackground"));
		panel.setBounds(0, 522, 429, 137);
		getContentPane().add(panel);
		panel.setLayout(null);
		if(MatchOrNot) {panel.setVisible(true);}
		else {panel.setVisible(false);}
		
		
	
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 11, 395, 8);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 35, 395, 2);
		panel.add(separator_3);
		
		JLabel lblNewLabel_1 = new JLabel("Contact Information:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBackground(UIManager.getColor("List.selectionBackground"));
		lblNewLabel_1.setBounds(145, 11, 125, 24);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setText("Phone number: " + possibleRoomate.getPhoneNum());
		txtpnPhone.setBounds(26, 59, 228, 20);
		panel.add(txtpnPhone);
		txtpnPhone.setEditable(false);
		txtpnPhone.setBackground(UIManager.getColor("List.selectionBackground"));
		
		JTextPane txtpnEmail_1 = new JTextPane();
		txtpnEmail_1.setText("Email: " + possibleRoomate.getEmail());
		txtpnEmail_1.setEditable(false);
		txtpnEmail_1.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail_1.setBounds(26, 89, 228, 20);
		panel.add(txtpnEmail_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton();
		for(int i=0; i<searcher.myLikes.size(); i++) {
			if(searcher.myLikes.get(i).getEmail().equals(possibleRoomate.getEmail())) {
				tglbtnNewToggleButton.setSelected(true);
				tglbtnNewToggleButton.setEnabled(false);
			}
				
		}
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(tglbtnNewToggleButton.isSelected()) {
					 for(int i=0; i<theRegistry.getListWithoutHome().size(); i++) {
						 if(theRegistry.getListWithoutHome().get(i).getEmail().equals(searcher.getEmail())) {
							 theRegistry.getListWithoutHome().get(i).myLikes.add(possibleRoomate);
						 }
							 
					 }
					 
					 File f = new File("NoHomeList.ser");
						try {
							FileOutputStream fouts = new FileOutputStream(f, false);
							ObjectOutputStream douts = new ObjectOutputStream(fouts);
							douts.writeObject(theRegistry.getListWithoutHome());
							douts.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
						
				 }
			 
				 
			}
		});
		tglbtnNewToggleButton.setBounds(361, 682, 48, 48);
		Image img = new ImageIcon(this.getClass().getResource("/like_icon.png")).getImage();
		tglbtnNewToggleButton.setIcon(new ImageIcon(img));
		getContentPane().add(tglbtnNewToggleButton);
		if(MatchOrNot) {tglbtnNewToggleButton.setVisible(false);}
		
		this.setVisible(true);
		this.setSize(445, 780);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}