package hospital;


public class MongoParameterPasser {
	public int patient_id;
	public String disease;
	public String Address;
	public String Ph_no;
	public String Doctor_advice;
	public String Symptoms;
	public String last_medication;
	public String table_name;
	MongoParameterPasser()
	{
		patient_id=-1;
		disease="null";
		Address="null";
		Ph_no="null";
		Doctor_advice="null";
		Symptoms="null";
		last_medication="null";
		table_name="null";
	}

}