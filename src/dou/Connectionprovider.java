/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dou;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionprovider {
    public static Connection getCon(){
        try {
            // The new driver class name is "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartMedicalShop?useSSL=false", "root", "AdminSaiful");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

