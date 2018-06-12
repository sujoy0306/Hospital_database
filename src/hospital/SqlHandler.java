package hospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

/*
 *
 * @author wolf
 */

public class SqlHandler {
   //
   int err=0;
   public Connection conn;
   SqlHandler() {
   }
   boolean Insert(SQLParameterPasser object){
       
       try {
    	   
            if(object.tablename=="patient") {
          	   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
               conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sujoy","hi_sujoy");
            /*   String sql = "insert into patient "
                       + " (patient_id,patient_name,patient_sex,patient_age,patient_assigned_doctor_id,patient_room_no)" + " values (?,?,?,?,?,?)";*/
               String sql="insert into patient values(?,?,?,?,?,?)";
               PreparedStatement statement = conn.prepareStatement(sql);
               statement.setInt(1, object.patient_id);
               statement.setString(2, object.patient_name);
               statement.setString(3, object.patient_sex);
               statement.setInt(4, object.patient_age);
               statement.setInt(5, object.assigned_doctor_id);
               statement.setInt(6, object.patient_room_no);
              // System.out.println("yo1asdsad2");
               err = statement.executeUpdate();
               conn.commit();
              // System.out.println("sadsadasd");
               
               if (err > 0) {
                   return true;
               } else {
                     System.out.println("yo1");
                   return false;
               }

           }
            else if(object.tablename=="doctors") {
          	   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
               conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sujoy","hi_sujoy");
               String sql="insert into doctors values(?,?,?,?,?,?)";
               PreparedStatement statement = conn.prepareStatement(sql);
               statement.setInt(1, object.doctor_id);
               statement.setString(2, object.doctor_name);
               statement.setString(3, object.doctor_address);
               statement.setString(4, object.doctor_specialization);
               statement.setString(5, object.doctor_phone_no);
               statement.setInt(6, object.doctor_chamber_no);
               System.out.println("yo1asdsad2");
               err = statement.executeUpdate();
               conn.commit();
               System.out.println("sadsadasd");
               
               if (err > 0) {
                   return true;
               } else {
                     System.out.println("yo1");
                   return false;
               }
                
                
            }
       } catch (SQLException e) {
                return false;
               
       }
       if (err > 0) {
                   return true;
               } else {
                   return false;
               }

   }
   ArrayList<SQLParameterPasser> search(SQLParameterPasser object) {
	   
       ArrayList<SQLParameterPasser> mylist=new ArrayList<>();
       if(object.tablename=="patient"){
           String sql="select * from patient";
            try {
          	   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
               conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sujoy","hi_sujoy");
                    PreparedStatement statement=conn.prepareStatement(sql);
                    ResultSet rs=statement.executeQuery();
                    //System.out.println("ads");
                    while(rs.next())
                    {       
                            SQLParameterPasser res=new SQLParameterPasser();
                            int t1=rs.getInt("patient_id");
                            String t2=rs.getString("patient_name");
                            String t3=rs.getString("patient_sex");
                            int t4=rs.getInt("patient_age");
                            int t5=rs.getInt("patient_assigned_doctor_id");
                            int t6=rs.getInt("patient_room_no");
                            res.patient_id=t1;
                            res.patient_name=t2;
                            res.patient_sex=t3;
                            res.patient_age=t4;
                            res.assigned_doctor_id=t5;
                            res.patient_room_no=t6;
                            mylist.add(res);
                            //System.out.println(" "+t1+" "+t2+" "+" "+t3+" "+t4+" "+t5+" "+t6);
                            
                    }  
                    return mylist;

            } catch (SQLException e) {
                        //e.printStackTrace();
                        System.out.println("error");
                        
            }
       }
       System.out.println(""+mylist);
       return mylist;
   }
   
   
}