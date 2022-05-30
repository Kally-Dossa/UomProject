import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class SearchingRoomateGUI extends JFrame {
	
	private User user;
	private Registry registry;
	
	public SearchingRoomateGUI(User aUser, Registry theRegistry) {
		setResizable(false);
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
		separator.setBounds(170, 59, 1, 271);
		getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Filters:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 81, 55, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnMale.setBounds(6, 111, 55, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnFemale.setBounds(66, 111, 68, 23);
		getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnSmoker = new JRadioButton("Smoker");
		rdbtnSmoker.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnSmoker.setBounds(6, 137, 71, 23);
		getContentPane().add(rdbtnSmoker);
		
		JRadioButton rdbtnPet = new JRadioButton("Pet");
		rdbtnPet.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnPet.setBounds(6, 163, 55, 23);
		getContentPane().add(rdbtnPet);
		
		
		
		this.setVisible(true);
		this.setSize(477, 475);
		this.setTitle("Room8");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
									System.exit(0);
								}
							}
						}
						else {
							for(User current:registry.getListWithoutHome()) {
								if(current.equals(user)) {
									registry.getListWithoutHome().remove(user);
									System.exit(0);
								}
							}
						}
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
	}
}
