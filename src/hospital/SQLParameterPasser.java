package hospital;
public class SQLParameterPasser {
    public String tablename;
    
    /*patient variables*/
    
    public String patient_name;
    public String patient_admission_date;
    public String patient_sex;
    public int patient_age;
    public int patient_id;
    public int assigned_doctor_id;
    public int patient_room_no;

    /* Doctor  variables */

    public String doctor_name;
    public String doctor_address;
    public String doctor_specialization;
    public String doctor_phone_no;
    public int doctor_id;
    public int doctor_chamber_no;

    /* Dependents variables */

    public String dependents_name;
    public String dependents_phone;
    public int dependents_patient_id;

    /* Nurse Variables */

    public String nurse_name;
    public String nurse_phone_no;
    public String nurse_address;
    public int nurse_id;

    SQLParameterPasser()
            
    {    //   System.out.println("nil");
                    tablename="null";
                    patient_name="null";
                    patient_admission_date="null";
                    patient_sex="n";
                    patient_age=-1;
                    patient_id=-1;
                    assigned_doctor_id=-1;
                    patient_room_no=-1;



                    doctor_name="null";
                    doctor_address="null";
                    doctor_specialization="null";
                    doctor_phone_no="null";
                    doctor_id=-1;
                    doctor_chamber_no=-1;



                    dependents_name="null";
                    dependents_phone="null";
                    dependents_patient_id=-1;



                    nurse_name="null";
                    nurse_phone_no="null";
                    nurse_address="null";
                    nurse_id=-1;

    } 
}