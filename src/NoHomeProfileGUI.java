import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

public class NoHomeProfileGUI extends JFrame {

	
	public NoHomeProfileGUI(User searchingUser,boolean MatchOrNot, User aUser, Registry aRegistry) {
		User possibleRoomate = aUser;
		User searcher =searchingUser;
		Registry theRegistry = aRegistry;
		setResizable(false);
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setBackground(new Color(0, 204, 255));
		
		
			
		this.setVisible(true);
		this.setSize(314, 462);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTextPane txtpnGender = new JTextPane();
		txtpnGender.setBounds(20, 122, 133, 20);
		txtpnGender.setEditable(false);
		txtpnGender.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnGender.setText("Gender: " +aUser.getSex());
		getContentPane().add(txtpnGender);
		
		JTextPane txtpnLanguage = new JTextPane();
		txtpnLanguage.setBounds(20, 88, 161, 20);
		txtpnLanguage.setEditable(false);
		txtpnLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnLanguage.setText("Language: "+aUser.getLanguage());
		getContentPane().add(txtpnLanguage);
		
		JTextPane txtpnPet = new JTextPane();
		txtpnPet.setBounds(20, 221, 133, 20);
		txtpnPet.setEditable(false);
		txtpnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		if(aUser.hasPet()) {
			txtpnPet.setText("Pet: Yes");
		}
		else {
			txtpnPet.setText("Pet: No");
		}
		
		getContentPane().add(txtpnPet);
		
		JTextPane txtpnSmoker = new JTextPane();
		txtpnSmoker.setBounds(20, 153, 133, 20);
		txtpnSmoker.setEditable(false);
		txtpnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		if(aUser.isSmoker()) {
			txtpnSmoker.setText("Smoker: Yes");
		}
		else {
			txtpnSmoker.setText("Smoker: No");
		}
		getContentPane().add(txtpnSmoker);
		
		JTextPane txtpnWorking = new JTextPane();
		txtpnWorking.setBounds(20, 190, 133, 20);
		if(aUser.getProfessionalStatus()) {
			txtpnWorking.setText("Working: Yes");
		}
		else { 
			txtpnWorking.setText("Working: No");
		}
		txtpnWorking.setEditable(false);
		txtpnWorking.setBackground(UIManager.getColor("List.selectionBackground"));
		getContentPane().add(txtpnWorking);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setBounds(20, 57, 133, 20);
		txtpnAge.setText("Age: "+ String.valueOf(aUser.getAge()));
		txtpnAge.setEditable(false);
		txtpnAge.setBackground(UIManager.getColor("List.selectionBackground"));
		getContentPane().add(txtpnAge);
		
		JLabel lblMoreAbout = new JLabel("More about " +aUser.getName() + " " + aUser.getLastName() + ":" );
		lblMoreAbout.setBackground(UIManager.getColor("List.selectionBackground"));
		lblMoreAbout.setBounds(21, 11, 267, 20);
		getContentPane().add(lblMoreAbout);
		
		
		JPanel ContactInfoPanel = new JPanel();
		ContactInfoPanel.setBackground(UIManager.getColor("List.selectionBackground"));
		ContactInfoPanel.setBounds(0, 252, 298, 112);
		getContentPane().add(ContactInfoPanel);
		ContactInfoPanel.setLayout(null);
		if(MatchOrNot) {ContactInfoPanel.setVisible(true);}
		else {ContactInfoPanel.setVisible(false);}
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 278, 2);
		ContactInfoPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 41, 278, 2);
		ContactInfoPanel.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Contact Information:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(74, 11, 133, 27);
		ContactInfoPanel.add(lblNewLabel);
		
		JTextPane txtpnPhone = new JTextPane();
		txtpnPhone.setBounds(10, 54, 278, 20);
		ContactInfoPanel.add(txtpnPhone);
		txtpnPhone.setEditable(false);
		txtpnPhone.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnPhone.setText("Phone: " + aUser.getPhoneNum());
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setBounds(10, 85, 278, 20);
		ContactInfoPanel.add(txtpnEmail);
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnEmail.setText("Email: " + aUser.getEmail());
		
		JButton btnNewButton = new JButton("<Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(138, 389, 79, 23);
		getContentPane().add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		for(int i=0; i<searcher.myLikes.size(); i++) {
			if(searcher.myLikes.get(i).getEmail().equals(possibleRoomate.getEmail())) {
				tglbtnNewToggleButton.setSelected(true);
			}
				
		}
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					for(int i=0; i<theRegistry.getListWithHome().size(); i++) {
						if(theRegistry.getListWithHome().get(i).getEmail().equals(searcher.getEmail())) {
							 theRegistry.getListWithHome().get(i).myLikes.add(possibleRoomate);
						}
					}
					 File f = new File("HaveHomeList.ser");
						try {
							FileOutputStream fouts = new FileOutputStream(f, false);
							ObjectOutputStream douts = new ObjectOutputStream(fouts);
							douts.writeObject(theRegistry.getListWithHome());
							douts.close();
						} catch (IOException e1) {
								
							e1.printStackTrace();
						}
						System.out.println(searcher.myLikes.size());
				 }
				 
			}
		});
		tglbtnNewToggleButton.setBounds(228, 364, 48, 48);
		getContentPane().add(tglbtnNewToggleButton);
		if(MatchOrNot) {tglbtnNewToggleButton.setVisible(false);}
		
		Image img = new ImageIcon(this.getClass().getResource("/like_icon.png")).getImage();
		tglbtnNewToggleButton.setIcon(new ImageIcon(img));
		
		
		
	}
}
