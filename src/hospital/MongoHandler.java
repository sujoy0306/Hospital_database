package hospital;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoHandler {
	
	private	MongoClient mg;
	MongoHandler()
	{
		mg=new MongoClient("localhost",27017);
	}
	public boolean insert(MongoParameterPasser object)
	{
		try
		{
				DB dbs=mg.getDB("Hospital");
				DBCollection coll=dbs.getCollection("Patient");
				BasicDBObject doc1=new BasicDBObject("patient_id",object.patient_id)
						.append("disease",object.disease).append("Address",object.Address).append("PhoneNo",object.Ph_no)
						.append("Symptoms",object.Symptoms).append("DoctorAdvice",object.Doctor_advice)
						.append("lastMedication",object.last_medication);
				coll.insert(doc1);
		}catch(Exception e)
		{
			return false;
		}
		return true;
		
	}
	public boolean delete(MongoParameterPasser object)
	{
		try
		{
			DB dbs=mg.getDB("Hospital");
			DBCollection coll=dbs.getCollection("Patient");
			BasicDBObject doc=new BasicDBObject("patient_id",object.patient_id);
			coll.remove(doc);
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public boolean modify(MongoParameterPasser object) 
	{
		try
		{
			DB dbs=mg.getDB("Hospital");
			DBCollection coll=dbs.getCollection("Patient");
			BasicDBObject updateddoc=new BasicDBObject();
			if((object.Address)!="null")
			updateddoc.put("Address",object.Address);
			if((object.disease)!="null")
			updateddoc.put("disease",object.disease);
			if(object.Ph_no!="null")
			updateddoc.put("PhoneNo",object.Ph_no);
			if(object.Doctor_advice!="null")
			updateddoc.put("DoctorAdvice",object.Doctor_advice);
			if(object.Symptoms!="null")
			updateddoc.put("Symptoms",object.Symptoms);
			if(object.last_medication!="null")
			updateddoc.put("lastMedication",object.last_medication);
			BasicDBObject update=new BasicDBObject();
			update.put("$set",updateddoc);
			BasicDBObject old=new BasicDBObject().append("patient_id",object.patient_id);
			coll.update(old, update);
			
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public ArrayList<MongoParameterPasser> search() 
	{
		DB dbs=mg.getDB("Hospital");
		DBCollection coll=dbs.getCollection("Patient");
		ArrayList<MongoParameterPasser> mylist=new ArrayList<>();
		Cursor cur=coll.find();
		while(cur.hasNext())
		{
			DBObject dbo=cur.next();
			MongoParameterPasser obj=new MongoParameterPasser();
			obj.Address=(String)dbo.get("Address");
			obj.disease=(String)dbo.get("disease");
			
			obj.Ph_no=(String)dbo.get("PhoneNo");
			obj.Symptoms=(String)dbo.get("symptoms");
			
			obj.Doctor_advice=(String)dbo.get("DoctorAdvice");
			obj.last_medication=(String)dbo.get("lastMedication");
			

			obj.patient_id=((Number)dbo.get("patient_id")).intValue();
			/*System.out.println(obj.Address);
			System.out.println(obj.disease);
			System.out.println(obj.Doctor_advice);
			System.out.println(obj.last_medication);
			System.out.println(obj.patient_id);
			System.out.println(obj.Ph_no);
			System.out.println(obj.Symptoms);*/
			mylist.add(obj);
			
		}
		return mylist;
	}


}