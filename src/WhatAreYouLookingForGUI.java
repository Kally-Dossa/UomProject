import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WhatAreYouLookingForGUI extends JFrame{
	private Registry theRegistry;
	
	public WhatAreYouLookingForGUI(Registry aRegistry) {
		theRegistry = aRegistry;
		setResizable(false);
		getContentPane().setBackground(UIManager.getColor("List.selectionBackground"));
		getContentPane().setLayout(null);
		
		JTextPane txtpnWhatAreYou = new JTextPane();
		txtpnWhatAreYou.setEditable(false);
		txtpnWhatAreYou.setBackground(UIManager.getColor("List.selectionBackground"));
		txtpnWhatAreYou.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtpnWhatAreYou.setText("What are you looking for?");
		txtpnWhatAreYou.setBounds(82, 11, 259, 33);
		getContentPane().add(txtpnWhatAreYou);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("I have a house and I'm looking for a roomate.");
		rdbtnNewRadioButton.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnNewRadioButton.setBounds(24, 69, 356, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnIDontHave = new JRadioButton("I don't have a house and I'm looking for a roomate.");
		rdbtnIDontHave.setBackground(UIManager.getColor("List.selectionBackground"));
		rdbtnIDontHave.setBounds(24, 112, 356, 23);
		getContentPane().add(rdbtnIDontHave);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnIDontHave.setEnabled(false);
				if(!rdbtnNewRadioButton.isSelected())
					rdbtnIDontHave.setEnabled(true);
			}
		});
		rdbtnIDontHave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setEnabled(false);
				if(!rdbtnIDontHave.isSelected())
					rdbtnNewRadioButton.setEnabled(true);
			}
		});
		
		JButton btnNewButton = new JButton("Next>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					new HaveHomeSignUpGUI(theRegistry);
				}
				
				else {
					if(rdbtnIDontHave.isSelected()) {
						new NoHomeSignUpGUI(theRegistry);
					}
					else
						JOptionPane.showMessageDialog(null, "You must choose an option first!");
					
				}
					
				WhatAreYouLookingForGUI.this.dispose();
			}
		});
		btnNewButton.setBounds(321, 215, 89, 23);
		getContentPane().add(btnNewButton);
		this.setVisible(true);
		this.setSize(450, 303);
		this.setTitle("User details");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
