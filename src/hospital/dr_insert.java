package hospital;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dr_insert extends JFrame {

	private JPanel contentPane;
	private JTextField p_id;
	private JTextField p_name;
	private JTextField age;
	private JTextField sex;
	private JTextField ass_dr_id;
	private JTextField ro_no;
	private JTextField addr;
	private JTextField disease_des;
	private JTextField dr_adv;
	private JTextField last_medication;
	private JTextField symtom;
	private JTextField phone_number;

	

	/**
	 * Create the frame.
	 */
	public dr_insert() {
		setTitle("DOCTOR INSERT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PATIENT ID");
		lblNewLabel.setBounds(52, 25, 201, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PATIENT NAME");
		lblNewLabel_1.setBounds(52, 52, 181, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblA = new JLabel("AGE");
		lblA.setBounds(52, 79, 181, 15);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_2 = new JLabel("SEX");
		lblNewLabel_2.setBounds(52, 106, 181, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ASSIGNED DOCTOR ID");
		lblNewLabel_3.setBounds(52, 133, 181, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ROOM NUMBER");
		lblNewLabel_4.setBounds(52, 160, 181, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS");
		lblNewLabel_5.setBounds(52, 187, 181, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PHONE NUMBER");
		lblNewLabel_6.setBounds(52, 214, 181, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DISEASE DESCRIPTION");
		lblNewLabel_7.setBounds(52, 241, 181, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DOCTOR ADVICE");
		lblNewLabel_8.setBounds(52, 274, 181, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("LAST MEDICATION GIVEN");
		lblNewLabel_9.setBounds(52, 311, 181, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("SYMPTOMS");
		lblNewLabel_10.setBounds(52, 338, 168, 15);
		contentPane.add(lblNewLabel_10);
		
		p_id = new JTextField();
		p_id.setBounds(325, 23, 217, 19);
		contentPane.add(p_id);
		p_id.setColumns(10);
		
		p_name = new JTextField();
		p_name.setBounds(325, 50, 217, 19);
		contentPane.add(p_name);
		p_name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(323, 77, 219, 19);
		contentPane.add(age);
		age.setColumns(10);
		
		sex = new JTextField();
		sex.setBounds(325, 104, 217, 19);
		contentPane.add(sex);
		sex.setColumns(10);
		
		ass_dr_id = new JTextField();
		ass_dr_id.setBounds(325, 131, 217, 19);
		contentPane.add(ass_dr_id);
		ass_dr_id.setColumns(10);
		
		ro_no = new JTextField();
		ro_no.setBounds(325, 158, 217, 19);
		contentPane.add(ro_no);
		ro_no.setColumns(10);
		
		addr = new JTextField();
		addr.setBounds(325, 185, 217, 19);
		contentPane.add(addr);
		addr.setColumns(10);
		
		disease_des = new JTextField();
		disease_des.setBounds(325, 239, 217, 19);
		contentPane.add(disease_des);
		disease_des.setColumns(10);
		
		dr_adv = new JTextField();
		dr_adv.setBounds(325, 272, 217, 19);
		contentPane.add(dr_adv);
		dr_adv.setColumns(10);
		
		last_medication = new JTextField();
		last_medication.setBounds(325, 303, 217, 19);
		contentPane.add(last_medication);
		last_medication.setColumns(10);
		
		symtom = new JTextField();
		symtom.setBounds(325, 336, 217, 19);
		contentPane.add(symtom);
		symtom.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQLParameterPasser ob=new SQLParameterPasser();
				MongoParameterPasser ob1=new MongoParameterPasser();
				ob.tablename="patient";
				ob.patient_id=Integer.parseInt(p_id.getText());
				String in_nm=p_name.getText();
				if(!in_nm.equals("")) {
					ob.patient_name=in_nm;
				}
				String ag=age.getText();
				if(!ag.equals("")) {
					ob.patient_age=Integer.parseInt(ag);
				}
				String sex1=sex.getText();
				if(!sex1.equals("")) {
					ob.patient_sex=sex1;
				}
				String ass_dr=ass_dr_id.getText();
				ob.assigned_doctor_id=Integer.parseInt(ass_dr);
				if(!ass_dr.equals("")) {
				
				}
				String rno1=ro_no.getText();
				if(!rno1.equals("")) {
					ob.patient_room_no=Integer.parseInt(rno1);
				}
				String addr1=addr.getText();
				if(!addr1.equals("")) {
					ob1.Address=addr1;
				}
				String ph_no=phone_number.getText();
				if(!ph_no.equals("")) {
					ob1.Ph_no=ph_no;
				}
				String dis_desc1=disease_des.getText();
				if(!dis_desc1.equals("")) {
					ob1.disease=dis_desc1;
				}
				String dr_adv1=last_medication.getText();
				if(!dr_adv1.equals("")) {
					ob1.Doctor_advice=dr_adv1;
				}
				String last_med1=dr_adv.getText();
				if(!last_med1.equals("")) {
					ob1.last_medication=last_med1;
				}
				String sym1=symtom.getText();
				if(!sym1.equals("")) {
					ob1.last_medication=sym1;
				}
			
			//	System.out.println(ob.patient_id+1+" "+ob.patient_name+" "+ob.patient_age+" "+ob.patient_sex+" "+ob.assigned_doctor_id+" "+ob.patient_room_no);;
				
				
				SqlHandler h1=new SqlHandler();
				MongoHandler h2=new MongoHandler();
				if(h1.Insert(ob) && h2.insert(ob1)) {
					JOptionPane.showMessageDialog(contentPane, "Data successfully inserted");
					//frame.dispose();
				}
				else {
					String ans="Some error occured";
					JTextArea output=new JTextArea(16,14);
					output.setText(ans);
					JOptionPane.showMessageDialog(null, ans," dialog box",JOptionPane.ERROR_MESSAGE );
				}
			}
		});
		btnNewButton.setBounds(200, 394, 147, 25);
		contentPane.add(btnNewButton);
		
		phone_number = new JTextField();
		phone_number.setBounds(325, 212, 217, 19);
		contentPane.add(phone_number);
		phone_number.setColumns(10);
		setVisible(true);
	}
}
