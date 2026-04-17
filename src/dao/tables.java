/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class tables {
        public static void main(String[] args) {
        try {
            
           // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "");
            // String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
           // String sqlAdmin = "INSERT INTO admin(email, password, status) VALUES (?, ?, ?)"; 
           // String productTable = "create table product (id int AUTO_INCREMENT primary key,name,category,price,";
            //String productTable = "create table product(id int AUTO_INCREMENT primary key,name"
            //DbOperations.setDataOrDelete(adminDetails,"Admin Details Added Successfully");
            //DbOperations.setDataOrDelete(userTable,"User Table Created Succesfully");
            //DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            //DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
