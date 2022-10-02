/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea03grupo5;
import javax.swing.JOptionPane;

/**
 *
 * @author Amber B
 */
public class Tarea03Grupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte eleccion;

        eleccion = Byte.parseByte((JOptionPane.showInputDialog(null, """
                --Menu--
                1- Ejercicio #1 While
                2- Ejercicio #2 Do While
                3- Ejercicio #3 For""")));
        switch (eleccion){
            case 1 -> ejercicio1();
//           case 2 -> ejercicio2();
//            case 3 -> ejercicio3();
            default -> JOptionPane.showMessageDialog(null, "Esa " +
                    "opción es inválida");
        }
    }
    public static void ejercicio1(){
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
            }             
}    }   