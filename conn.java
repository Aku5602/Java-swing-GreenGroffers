/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author akuku
 */
public class conn {
      public static void main(String[] args) 
    {
        
        Connection c;
        Statement s;
        ResultSet rs;
     
     

   //  s.executeUpdate("insert into Product values(pid_sec.nextval,'Watermelon',40)");
   String query,DateofOrder1;
   int seq=0;
   int cost=20;
        try
         {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","pccoe");
        
          s = c.createStatement();
          query="select * from Enter";
          rs=s.executeQuery(query);
          rs.next();
          String cid=rs.getString("cidstore");
          System.out.println(cid);
          
          seq++;
           s.executeUpdate("insert into Hello values(sysdate)");
           //System.out.print("Check");
        // query="insert into Orders values('"+cid+"',order_sec.nextval,'"+cost+"','"+DateofOrder1+"','"+DateofOrder2+"')";
          s.executeUpdate("insert into Orders1 values('"+cid+"','"+seq+"','"+cost+"',sysdate,sysdate)");
         }
         catch(Exception e)
         {
          e.getStackTrace();
         }
     
     
     
     
    }
    
}
