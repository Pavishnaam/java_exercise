import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginsql
{       
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/pavidb", "root", "987654321");
            System.out.println("DB connected....");
            Scanner sc= new Scanner(System.in);
            Statement stmt=conn.createStatement();
            String title;
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            ResultSet rs = stmt.executeQuery("select * from login where loginid='"+s1+"' and password='"+s2+"';");
            
             if(rs.next())
             {
                  title=s1 + " is a Valid User";
               }
            else{
                  title=s1 + "is an Invalid User.... ";
           
            }
             System.out.println(title);
        }catch(Exception e){System.out.println(e);}
        
    }
    
}