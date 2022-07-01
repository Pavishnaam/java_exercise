/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PAVISHNA
 */
import java.sql.*;
public class testmysql 
{
    public static void main(String[] args) throws Exception 
    {
       Connection con = null;
       try
       {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pavidb", "root", "987654321");
            System.out.println("connection success");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from login;");  
            while(rs.next())  
                System.out.println(rs.getString(1)+"  "+rs.getString(2));  
            con.close();    
       }catch(Exception e)
       {
           System.out.println("connection fails");
       }
    } 
}


