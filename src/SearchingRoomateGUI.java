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
		
		JButton btnMatches = new JButton("Matches");
		btnMatches.setBounds(175, 12, 89, 23);
		getContentPane().add(btnMatches);
		
		JLabel lblHello = new JLabel("Hello "+user.getName()+"!");
		lblHello.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblHello.setBackground(UIManager.getColor("List.selectionBackground"));
		lblHello.setBounds(42, 11, 184, 23);
		getContentPane().add(lblHello);
		
		JLabel lblList = new JLabel("Suggested roomates list:");
		lblList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblList.setBackground(UIManager.getColor("List.selectionBackground"));
		lblList.setBounds(39, 47, 164, 14);
		getContentPane().add(lblList);

		JList SuggestedList = new JList();
		SuggestedList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
		SuggestedList.setModel(listModel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 82, 222, 249);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(SuggestedList);
		
		JButton btnNewButton = new JButton("Show Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registry.IhaveHome(user.getName())) {
					dispose();
					HaveHome homeUser = (HaveHome) user.getUser();
					new HaveHomeProfileGUI(false, homeUser, registry);
				}
				if (!registry.IhaveHome(user.getName())) {
					dispose();
					new NoHomeProfileGUI(false, user, registry);
				}
			}
		});
		btnNewButton.setBounds(91, 342, 123, 23);
		getContentPane().add(btnNewButton);
		
		this.setVisible(true);
		this.setSize(330, 459);
		this.setTitle("Room8");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
