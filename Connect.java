package managementSystem;

import java.sql.*;  

public class Connect{
    Connection c;
    Statement s;
    public Connect(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///project","root","");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
