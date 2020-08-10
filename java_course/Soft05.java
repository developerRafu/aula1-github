/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_course;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Soft05 {

    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog(null, "Minutos:"));
        if (min > 100) {
            min = min - 100;
            min = min * 2;
            JOptionPane.showMessageDialog(null, "Preço R$:" + (50 + min));
        } else {
            JOptionPane.showMessageDialog(null, "Valor: R$50");
        }
    }
}
