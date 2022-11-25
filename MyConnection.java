package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class MyConnection {
   public static Connection getConnection(){
       
   try{
  Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaind","root","" );
   return con;
           }
   catch(Exception e){
       JOptionPane.showMessageDialog(null, e);

   }
   return null;
           
   
   }
    
}
