import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUpGUI extends JFrame {
	
	private JPanel panel;
	private JButton button1;
	private JTextField usernameField, passField;
	
	public SignUpGUI() {
		
		panel = new JPanel();

		
		usernameField = new JTextField("Please enter your username  ");
		panel.add(usernameField);
		
		passField = new JTextField("Please enter your password ");
		panel.add(passField);
		
		button1 = new JButton("Sign Up");
		panel.add(button1);
		
		this.setContentPane(panel);		
		
		OtherButtonListener signup= new OtherButtonListener();
		button1.addActionListener(signup);
		
		this.setVisible(true);
		this.setSize(300, 200);
		//this.pack();
		this.setTitle("Sign Up");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//���������� ������ �������
		class OtherButtonListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				dispose();
				new User();
			}
		}	
	

}