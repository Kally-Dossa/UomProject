import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class SearchingRoomateGUI extends JFrame {
	
	private User user;
	private Registry registry;
	
	public SearchingRoomateGUI(User aUser, Registry theRegistry) {
		
		user = aUser;
		registry = theRegistry;
		
		
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setTitle("Room8");
		getContentPane().setLayout(null);
		
		JLabel lblHello = new JLabel("Hello "+user.getName()+"!");
		lblHello.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblHello.setBackground(UIManager.getColor("List.selectionBackground"));
		lblHello.setBounds(42, 11, 184, 23);
		getContentPane().add(lblHello);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(6, 111, 55, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(87, 111, 68, 23);
		getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnSmoker = new JRadioButton("Smoker");
		rdbtnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmoker.setBounds(6, 137, 61, 23);
		getContentPane().add(rdbtnSmoker);
		
		JRadioButton rdbtnNonSmoker = new JRadioButton("Non Smoker");
		rdbtnNonSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNonSmoker.setBounds(87, 137, 90, 23);
		getContentPane().add(rdbtnNonSmoker);
		
		JRadioButton rdbtnWithoutPet = new JRadioButton("Without pet");
		rdbtnWithoutPet.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnWithoutPet.setBounds(87, 163, 90, 23);
		getContentPane().add(rdbtnWithoutPet);
		
		JRadioButton rdbtnWithPet = new JRadioButton("With Pet");
		rdbtnWithPet.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnWithPet.setBounds(6, 163, 79, 23);
		getContentPane().add(rdbtnWithPet);
		
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
		
		rdbtnSmoker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNonSmoker.setEnabled(false);
				if(!rdbtnSmoker.isSelected())
					rdbtnNonSmoker.setEnabled(true);
			}
		});
		
		rdbtnNonSmoker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSmoker.setEnabled(false);
				if(!rdbtnNonSmoker.isSelected())
					rdbtnSmoker.setEnabled(true);
			}
		});
		
		rdbtnWithPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnWithoutPet.setEnabled(false);
				if(!rdbtnWithPet.isSelected())
					rdbtnWithoutPet.setEnabled(true);
			}
		});
		
		rdbtnWithoutPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnWithPet.setEnabled(false);
				if(!rdbtnWithoutPet.isSelected())
					rdbtnWithPet.setEnabled(true);
			}
		});
		
		
		JLabel lblList = new JLabel("Suggested roomates list:");
		lblList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblList.setBackground(UIManager.getColor("List.selectionBackground"));
		lblList.setBounds(193, 58, 164, 14);
		getContentPane().add(lblList);
		JList suggestedList = new JList();
		suggestedList.setBounds(202, 94, 207, 236);
		getContentPane().add(suggestedList);
		DefaultListModel listModel = new DefaultListModel();
		if(user.hasHome()) {
			for(int i=0; i<theRegistry.getListWithoutHome().size(); i++) {
				listModel.addElement(theRegistry.getListWithoutHome().get(i).getName() +" "+ theRegistry.getListWithoutHome().get(i).getLastName());
				
			}
		}
		
		else {
			for(int i=0; i<theRegistry.getListWithHome().size(); i++) {
				listModel.addElement(theRegistry.getListWithHome().get(i).getName() +" "+ theRegistry.getListWithHome().get(i).getLastName());
				
			}
		}
		suggestedList.setModel(listModel);
		
		JButton btnAddFilters = new JButton("Add filters");
		btnAddFilters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.hasHome()) {
					ArrayList<User> tempList =new ArrayList<User>();
					DefaultListModel tempListModel = new DefaultListModel();
					tempList = theRegistry.ListFiltering(true,rdbtnMale.isSelected(),rdbtnFemale.isSelected(),rdbtnSmoker.isSelected(), rdbtnNonSmoker.isSelected(),
							rdbtnWithPet.isSelected(), rdbtnWithoutPet.isSelected());
					if(tempList.size() == 0) {
						tempListModel.addElement("No user found!");
					} else {
						for(int i=0; i<tempList.size(); i++)
							tempListModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getLastName());
					}
					
					suggestedList.setModel(tempListModel);
				}
				
				else {
					ArrayList<User> tempList = new ArrayList<User>();
					DefaultListModel tempListModel = new DefaultListModel();
					tempList = theRegistry.ListFiltering(false,rdbtnMale.isSelected(),rdbtnFemale.isSelected(),rdbtnSmoker.isSelected(), rdbtnNonSmoker.isSelected(),
							rdbtnWithPet.isSelected(), rdbtnWithoutPet.isSelected());
					if(tempList.size() == 0) {
						tempListModel.addElement("No user found!");
					} else {
						for(int i=0; i<tempList.size(); i++)
							tempListModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getLastName());
					}
					
					suggestedList.setModel(tempListModel);
				}	
			}
		});
		btnAddFilters.setBounds(42, 220, 89, 23);
		getContentPane().add(btnAddFilters);
		
		JButton btnRemoveF = new JButton("Remove Filters");
		btnRemoveF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMale.setEnabled(true); rdbtnMale.setSelected(false); 
				rdbtnFemale.setEnabled(true); rdbtnFemale.setSelected(false);
				rdbtnSmoker.setEnabled(true); rdbtnSmoker.setSelected(false);
				rdbtnNonSmoker.setEnabled(true); rdbtnNonSmoker.setSelected(false);
				rdbtnWithPet.setEnabled(true); rdbtnWithPet.setSelected(false);
				rdbtnWithoutPet.setEnabled(true); rdbtnWithoutPet.setSelected(false);
				suggestedList.setModel(listModel);
			}
		});
		btnRemoveF.setBounds(33, 254, 109, 23);
		getContentPane().add(btnRemoveF);
		
		JButton btnNewButton = new JButton("Show Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "";
				if(user.hasHome()) {
					for(int i=0; i<theRegistry.getListWithoutHome().size(); i++) {
						userName = theRegistry.getListWithoutHome().get(i).getName() + " " + theRegistry.getListWithoutHome().get(i).getLastName();
						
						if(userName.equals(suggestedList.getSelectedValue())) {
							new NoHomeProfileGUI(user,false, theRegistry.getListWithoutHome().get(i),theRegistry);
						}
						
						else continue;
					}
				}
				
				else {
					for(int i=0; i<theRegistry.getListWithHome().size(); i++) {
						userName = theRegistry.getListWithHome().get(i).getName() + " " + theRegistry.getListWithHome().get(i).getLastName();
						
						if(userName.equals(suggestedList.getSelectedValue())) {
							new HaveHomeProfileGUI(user,false, theRegistry.getListWithHome().get(i),theRegistry);
						}
						
						else continue;
					}
				}
			}
		});
		btnNewButton.setBounds(247, 341, 113, 23);
		getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.WHITE);
		separator.setBounds(182, 59, 1, 271);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Filters:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 81, 55, 14);
		getContentPane().add(lblNewLabel);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("My Profile");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("My matches");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchesGUI m=new MatchesGUI(user,registry);
				m.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Delete Account");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"Are you sure you want to delete your account?","Warning!!!",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
						if(user.hasHome()) {
							for(User current:registry.getListWithHome()) {
								if(current.equals(user)) {
									registry.getListWithHome().remove(user);
								}
							}
						}
						else {
							for(User current:registry.getListWithoutHome()) {
								if(current.equals(user)) {
									registry.getListWithoutHome().remove(user);
								}
							}
						}
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		this.setVisible(true);
		this.setSize(477, 475);
		this.setTitle("Room8");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
}
