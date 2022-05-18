import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.JButton;

public class SearchingRoomateGUI extends JFrame {
	
	private User user;
	private Registry registry;
	
	public SearchingRoomateGUI(User aUser, Registry theRegistry) {
		user = aUser;
		registry = theRegistry;
		
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		setTitle("Room8");
		getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(42, 72, 351, 370);
		getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Matches");
		btnNewButton.setBounds(171, 27, 89, 23);
		getContentPane().add(btnNewButton);
		
		this.setVisible(true);
		this.setSize(445, 740);
		this.setTitle("Room8");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
