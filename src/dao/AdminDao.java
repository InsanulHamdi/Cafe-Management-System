/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class AdminDao {

    public static Admin login(String email, String password) {
        Admin admin = null;
        try {
            Connection con = DbOperations.getConnection(); // pastikan ini sesuai class koneksi kamu
            String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                admin = new Admin();
                admin.setEmail(rs.getString("email"));
                admin.setPassword(rs.getString("password"));
                admin.setStatus(rs.getString("status"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return admin;
    }

    private static class Admin {

        public Admin() {
        }

        private void setEmail(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setPassword(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setStatus(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

   