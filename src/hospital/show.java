package hospital;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class show extends JFrame {

	private JPanel contentPane;
	private JTextField value;

	

	/**
	 * Create the frame.
	 */
	public show() {
		SqlHandler sqlconnection=new SqlHandler();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String attr[]= {"Patient_id"};
		JComboBox<String> comboBox = new JComboBox(attr);
		comboBox.setBounds(70, 85, 125, 24);
		contentPane.add(comboBox);
		
		value = new JTextField();
		value.setBounds(246, 85, 114, 19);
		contentPane.add(value);
		value.setColumns(10);
		
		JButton Show = new JButton("Show");
		Show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQLParameterPasser ob=new SQLParameterPasser();
				ob.tablename="patient";
				//ob.patient_id=Integer.parseInt(value.getText());
				ArrayList<SQLParameterPasser> mylist1=sqlconnection.search(ob);
				MongoHandler mob=new MongoHandler();
				ArrayList<MongoParameterPasser> mylist2=mob.search();
				try {
					new table(mylist1,mylist2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Show.setBounds(158, 155, 117, 25);
		contentPane.add(Show);
		
		
		
		
	//	contentPane.add(comboBox);
		setVisible(true);
	}
}
