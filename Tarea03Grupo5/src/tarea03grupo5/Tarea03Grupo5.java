/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea03grupo5;

import javax.swing.JOptionPane;

/**
 *
 * @author AmberB,
 */
public class Tarea03Grupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int i = 1;
        while(true){
        double num1;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número= "
                + ""));
        double num2;
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número= "
                + ""));
            i++; 
        if (num1 == num2)
            break;

