/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea03grupo5;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Tarea03grupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte menu = 0;
        while (menu != 5){
        menu = Byte.parseByte((JOptionPane.showInputDialog(null, 
                """
                --Menu--
                1- Ejercicio #1
                2- Ejercicio #2
                3- Ejercicio #3
                4- Ejercicio #4
                5- Salir     #5""")));
            switch (menu){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> JOptionPane.showMessageDialog(null, ""
                        + "Gracias por usar el programa");
                default -> JOptionPane.showMessageDialog(null, ""
                        + "Esa opción es inválida");
            }
        }
    }
    
    public static void ejercicio1(){
        byte antiguedad;
        float horasSemana;
        float pagaHora;
        float salarioSemana;
        float salarioMes;
        float salarioBruto;
        float salarioNeto =0;

        antiguedad = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite sus años " +
                "laborados: "));
        horasSemana = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite la cantidad de " +
                "horas" +
                " laboradas por semana: "));
        pagaHora = Short.parseShort(JOptionPane.showInputDialog(null,"Digite su paga por " +
                "hora"));

        salarioSemana = horasSemana * pagaHora;
        salarioMes = salarioSemana * 4;

        if (antiguedad > 10){
            salarioBruto = (float) (salarioMes + (salarioMes * 0.2));
            if (salarioBruto > 1000 && salarioBruto <= 2000) {
                salarioNeto = (float) (salarioBruto - (salarioBruto * 0.1));
            }
            else if (salarioBruto > 2000){
                salarioNeto = (float) (salarioBruto - (salarioBruto*0.15));
            }
        }
        else {
            salarioBruto = salarioMes;
            salarioNeto = salarioBruto;
        }
        JOptionPane.showMessageDialog(null , String.format("""
                    Antiguedad: %d años
                    Horas semanales: %.2f
                    Pago por hora: $%.2f
                    Salario semanal: $%.2f
                    Salario bruto: $%.2f
                    Salario Neto: $%.2f
                    """, antiguedad, horasSemana, pagaHora, salarioSemana, salarioBruto, salarioNeto));
    
    }
    
    public static void ejercicio2(){
    }
    
    public static void ejercicio3(){  
        
    double temperatura;
    temperatura=Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese la temperatura del clima: \n"));
    if (temperatura <= 10){
        JOptionPane.showMessageDialog(null, ""
                        + "Clima frío"); 
    } else if(temperatura > 10 && temperatura <= 20){
            JOptionPane.showMessageDialog(null,""
                    + "Clima Nubloso");
   } else if(temperatura > 20 && temperatura <= 30){
            JOptionPane.showMessageDialog(null,""
                    + "Clima Caluroso");
    } else if(temperatura > 30){
            JOptionPane.showMessageDialog(null,""
                    + "Clima Tropical");
    } else {
        JOptionPane.showMessageDialog(null,"" + "Intente de nuevo");
       }        
    }

    public static void ejercicio4(){
        byte dado1;
        byte dado2;
        byte dado3;
        dado1 = Byte.parseByte(JOptionPane.showInputDialog(
                "Ingrese el número de su primer dado: \n"));
        dado2 = Byte.parseByte(JOptionPane.showInputDialog(
                "Ingrese el número de su segundo dado: \n"));
        dado3 = Byte.parseByte(JOptionPane.showInputDialog(
                "Ingrese el número de su tercer dado: \n"));
        if (dado1 == 6 && dado2 == 6 && dado3==6){
            JOptionPane.showMessageDialog(null,"GENIAL!!!");
        }else if (dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3==6 ||dado2==6 
                && dado3==6 ){
            JOptionPane.showMessageDialog(null,"Muy bueno!");
        }else if (dado1 == 6 || dado2 == 6 || dado3 == 6){
            JOptionPane.showMessageDialog(null,"Justo");
        }else{
            JOptionPane.showMessageDialog(null,"MIEDO");
        } 
            
    }
}
