/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/cms?useSSL=false",
                "root", ""
            );
            return con;
        } catch (Exception e) {
            // Tambahkan dialog agar kelihatan error-nya
            javax.swing.JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}

