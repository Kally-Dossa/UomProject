import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MatchesGUI extends JFrame {

	private JPanel contentPane;
	private User user;
	private Registry registry;
	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchesGUI frame = new MatchesGUI(user,registry);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MatchesGUI(User aUser, Registry theRegistry) {
		setResizable(false);
		user = aUser;
		registry = theRegistry;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 481);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matching with");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(39, 47, 90, 29);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 72, 222, 249);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		JButton btnNewButton = new JButton("Show Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// einai kopi o kodikas apo to searching roomate gui . thelei llagi profanos
				String userName = "";
				if(user.hasHome()) {
					for(int i=0; i<theRegistry.getListWithoutHome().size(); i++) {
						userName = theRegistry.getListWithoutHome().get(i).getName() + " " + theRegistry.getListWithoutHome().get(i).getLastName();
						
						if(userName.equals(list.getSelectedValue())) {
							new NoHomeProfileGUI(false, theRegistry.getListWithoutHome().get(i),theRegistry);
						}
						
						else continue;
					}
				}
				
				else {
					for(int i=0; i<theRegistry.getListWithHome().size(); i++) {
						userName = theRegistry.getListWithHome().get(i).getName() + " " + theRegistry.getListWithHome().get(i).getLastName();
						
						if(userName.equals(list.getSelectedValue())) {
							new HaveHomeProfileGUI(false, theRegistry.getListWithHome().get(i),theRegistry);
						}
						
						else continue;
					}
				}
			}
		});
		btnNewButton.setBounds(91, 342, 123, 23);
		contentPane.add(btnNewButton);
	}
}
