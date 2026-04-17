/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;
/**
 *
 * @author Lenovo
 */
public class OpenPdf {
   public static void openById(String id) {
    try {
        String path = "C:\\Users\\Lenovo\\OneDrive\\Dokumen\\java\\Cafe Management System\\src\\bill\\" + id + ".pdf";
        File file = new File(path);
        if (file.exists()) {
            Process p = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler " + path);
        } else {
            JOptionPane.showMessageDialog(null, "File is not Exists at: " + path);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
