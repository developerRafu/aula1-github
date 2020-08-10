/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_course;

import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Soft04 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Horas:"));
        if(x<12){
            JOptionPane.showMessageDialog(null,"Bom dia");
        }
        else if(x>=12 && x<=18){
                JOptionPane.showMessageDialog(null,"Boa tarde");
            }
            else{
                JOptionPane.showMessageDialog(null,"Boa noite");
            }
}
}