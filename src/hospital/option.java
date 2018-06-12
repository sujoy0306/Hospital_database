package hospital;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class option extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public option() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are logged in as Doctor");
		lblNewLabel.setBounds(102, 12, 236, 28);
		contentPane.add(lblNewLabel);
		
		JButton INSERT = new JButton("INSERT");
		INSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dr_insert();
			}
		});
		INSERT.setBounds(53, 76, 141, 28);
		contentPane.add(INSERT);
		
		JButton DELETE = new JButton("DELETE");
		DELETE.setBounds(53, 162, 141, 28);
		contentPane.add(DELETE);
		
		JButton MODIFY = new JButton("MODIFY");
		MODIFY.setBounds(248, 76, 141, 27);
		contentPane.add(MODIFY);
		
		JButton SHOW = new JButton("SHOW");
		SHOW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new show();
			}
		});
		SHOW.setBounds(248, 162, 141, 28);
		contentPane.add(SHOW);
		setVisible(true);
	}

}

