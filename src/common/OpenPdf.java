/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author damik
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            String filePath = "C:\\Users\\damik\\Downloads\\Disal\\java\\" + id + ".pdf";
            File file = new File(filePath);
            if (file.exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler \"" + filePath + "\"");
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist at: " + filePath);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
