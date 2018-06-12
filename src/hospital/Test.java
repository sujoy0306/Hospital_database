package hospital;


import java.util.ArrayList;

public class Test{
	public static void main(String args[]) {
		SQLParameterPasser nilu=new SQLParameterPasser();
		SqlHandler test=new SqlHandler();
			nilu.tablename="patient";
			nilu.patient_id=7;
			nilu.patient_name="bhusu";
			nilu.patient_sex="m";
			nilu.assigned_doctor_id=1;
			nilu.patient_room_no=1;
                        nilu.doctor_id=4;
                        nilu.doctor_name="nil";
                        nilu.doctor_address="kol";
                        nilu.doctor_specialization="denst";
                        nilu.doctor_phone_no="2321";
                        nilu.doctor_chamber_no=1;
			boolean abc=test.Insert(nilu);
                        ArrayList<SQLParameterPasser> mylist=test.search(nilu);
                 for(SQLParameterPasser obj : mylist)
                 {
                     System.out.println(obj.assigned_doctor_id);
                 }
}
}