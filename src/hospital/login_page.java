package hospital;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_page {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page window = new login_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("   USERNAME");
		lblUsername.setBounds(49, 67, 103, 36);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("   PASSWORD");
		lblNewLabel.setBounds(49, 118, 108, 45);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(202, 76, 114, 19);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(202, 131, 114, 19);
		frame.getContentPane().add(password);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usd=username.getText();
				String psd=password.getText();
				if(usd.equals("Sujoy") && psd.equals("12345")) {
					JOptionPane.showMessageDialog(frame, "You are successfull logged in");
					frame.dispose();
					new option();
				}
				else {
					
					String ans="Invallid username or Password";
					JTextArea output=new JTextArea(16,14);
					output.setText(ans);
					JOptionPane.showMessageDialog(null, ans," dialog box",JOptionPane.ERROR_MESSAGE );
					username.setText("");
					password.setText("");
				}
			}
		});
		btnLogin.setBounds(123, 197, 110, 25);
		frame.getContentPane().add(btnLogin);
	}
}
