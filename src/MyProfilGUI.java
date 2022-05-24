import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MyProfilGUI extends JFrame{
	
	private User user;
	private Registry registry;
	
	public MyProfilGUI(User aUser, Registry theRegistry) {
		user = aUser;
		registry = theRegistry;
		
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setTitle("Room8 - My Profile");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name: "+aUser.getName()+"");
		lblName.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblName.setBackground(UIManager.getColor("List.selectionBackground"));
		lblName.setBounds(42, 10, 184, 23);
		getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last name: "+aUser.getLastName()+"");
		lblLastName.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblLastName.setBackground(UIManager.getColor("List.selectionBackground"));
		lblLastName.setBounds(42, 40, 184, 23);
		getContentPane().add(lblLastName);
		
		JLabel lblAge = new JLabel("Age: "+aUser.getAge()+"");
		lblAge.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblAge.setBackground(UIManager.getColor("List.selectionBackground"));
		lblAge.setBounds(42, 70, 184, 23);
		getContentPane().add(lblAge);
		
		boolean pet = aUser.hasPet();
		String havePet;
		if(pet) {
			 havePet = "yes";
		}else {
			havePet = "no";
		}
		JLabel lblPet = new JLabel("Pet: "+havePet+"");
		lblPet.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblPet.setBackground(UIManager.getColor("List.selectionBackground"));
		lblPet.setBounds(42, 100, 184, 23);
		getContentPane().add(lblPet);
		
		JLabel lblSex = new JLabel("Gender: "+aUser.getSex()+"");
		lblSex.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblSex.setBackground(UIManager.getColor("List.selectionBackground"));
		lblSex.setBounds(42, 130, 184, 23);
		getContentPane().add(lblSex);
		
		JLabel lblEmail = new JLabel("Email: "+aUser.getEmail()+"");
		lblEmail.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblEmail.setBackground(UIManager.getColor("List.selectionBackground"));
		lblEmail.setBounds(42, 160, 249, 23);
		getContentPane().add(lblEmail);
		
		JLabel lblPhoneNum = new JLabel("Phone Number: "+aUser.getPhoneNum()+"");
		lblPhoneNum.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblPhoneNum.setBackground(UIManager.getColor("List.selectionBackground"));
		lblPhoneNum.setBounds(42, 190, 184, 23);
		getContentPane().add(lblPhoneNum);
		
		JLabel lblLanguage = new JLabel("Speaking Language: "+aUser.getLanguage()+"");
		lblLanguage.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblLanguage.setBackground(UIManager.getColor("List.selectionBackground"));
		lblLanguage.setBounds(42, 220, 184, 23);
		getContentPane().add(lblLanguage);
		
		String employed ;
		boolean status = aUser.isSmoker();
		if(status) {
			employed  = "yes";
		}else {
			employed  = "no";
		}
		JLabel lblProfessionalStatus = new JLabel("Professional Status: "+employed+"");
		lblProfessionalStatus.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblProfessionalStatus.setBackground(UIManager.getColor("List.selectionBackground"));
		lblProfessionalStatus.setBounds(42, 250, 184, 23);
		getContentPane().add(lblProfessionalStatus);
		
		String smoker;
		boolean smoke = aUser.isSmoker();
		if(smoke) {
			 smoker = "yes";
		}else {
			 smoker = "no";
		}
		JLabel lblSmoker = new JLabel("Smoker: "+smoker+"");
		lblSmoker.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		lblSmoker.setBounds(42, 280, 184, 23);
		getContentPane().add(lblSmoker);
		
		JButton backToSearch = new JButton("Back To Roomates List");
		backToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SearchingRoomateGUI(aUser, registry);
			}
		});
		backToSearch.setBounds(173, 339, 192, 32);
		getContentPane().add(backToSearch);
		
		
		this.setVisible(true);
		this.setSize(500, 450);
		this.setTitle("Room8 - My Profile");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
