import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class MatchesGUI extends JFrame {

	private JPanel contentPane;
	private User user;
	private Registry registry;
	

	public MatchesGUI(User aUser, Registry theRegistry) {
		setResizable(false);
		user = aUser;
		registry = theRegistry;
		
		user.matching();
		
		if(user.hasHome()) {
			 File f = new File("HaveHomeList.ser");
				try {
					FileOutputStream fouts = new FileOutputStream(f, false);
					ObjectOutputStream douts = new ObjectOutputStream(fouts);
					douts.writeObject(registry.getListWithHome());
					douts.close();
				} catch (IOException e1) {
						
					e1.printStackTrace();
				}
		}
		
		else {
			File f = new File("NoHomeList.ser");
			try {
				FileOutputStream fouts = new FileOutputStream(f, false);
				ObjectOutputStream douts = new ObjectOutputStream(fouts);
				douts.writeObject(registry.getListWithoutHome());
				douts.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 481);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("List.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matching with:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(39, 47, 90, 23);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 72, 222, 249);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel listModel = new DefaultListModel();
		for(int i=0; i<user.myMatches.size(); i++) {
			listModel.addElement(user.myMatches.get(i).getName() + " " + user.myMatches.get(i).getLastName());	
		}
		
		list.setModel(listModel);
		scrollPane.setViewportView(list);
		
		
		JButton btnNewButton = new JButton("Show Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "";
				if(user.hasHome()) {
					for(int i=0; i<registry.getListWithoutHome().size(); i++) {
						userName = registry.getListWithoutHome().get(i).getName() + " " + registry.getListWithoutHome().get(i).getLastName();
						if(list.getSelectedValue().equals(userName)) {
							new NoHomeProfileGUI(user, true, registry.getListWithoutHome().get(i), registry);
						} else continue;
					}
				}
				else {
					for(int i=0; i<registry.getListWithHome().size(); i++) {
						userName = registry.getListWithHome().get(i).getName() + " " + registry.getListWithHome().get(i).getLastName();
						if(list.getSelectedValue().equals(userName)) {
							new HaveHomeProfileGUI(user, true, registry.getListWithHome().get(i), registry);
						} else continue;
					}
				}
			}
		});
		btnNewButton.setBounds(97, 332, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchingRoomateGUI a = new SearchingRoomateGUI(user,registry);
				dispose();
			}
		});
		
		btnNewButton_1.setBounds(201, 408, 71, 23);
		contentPane.add(btnNewButton_1);
	}
}
