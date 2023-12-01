/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dou;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author HP
 */
public class Table {
      public static void main(String args[]) {

    try{
    Connection con = Connectionprovider.getCon();
    Statement st= con.createStatement();
    st.executeUpdate("create table appuser(appuser_PK int AUTO_INCREMENT primary key, userRole varchar(200), name varchar(200), dob varchar(200), mobileNumber varchar(200), email varchar(200), userName varchar(200), password varchar(50), address varchar(200))");
st.executeUpdate("insert into appuser(userRole, name, dob, mobileNumber, email, userName, password, address) values('Admin', 'Admin', 'admin', '0932109019', 'admin@gmail.com', 'Saiful', '12345', 'Bangladesh')");

    JOptionPane.showMessageDialog(null,"Table created successfully");
    
    }
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,e);
    }
    
}
}
