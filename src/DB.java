
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DB {
    
    
    
     public static void main(String[] args)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create Database librarys");
                stmt.executeUpdate();
                stmt=con.prepareStatement("use librarys");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table users(ulogin varchar(20),upass varchar(20),utype varchar(20))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("insert into users values('admin','admin123','admin')");
                stmt.executeUpdate();
               stmt=con.prepareStatement("Create Table student(rollnumber varchar(10),student_name varchar(20),father varchar(20),Gender varchar(6),course varchar(10),gmail varchar(25),number varchar(10),address varchar(100))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table bookissue(rollno varchar(10) Primary Key,Book int,fbi date,fbr date,2bi date,2br date,books_name varchar(20),fine int)");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table books(name varchar(20),status varchar(30))");
                stmt.executeUpdate();
              
                System.out.println("Done");
        }catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
    
}
