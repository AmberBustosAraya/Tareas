import javax.swing.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numero;
        int numerodevalores;
        numerodevalores = Integer.parseInt(JOptionPane.showInputDialog("" +
                "Ingrese la cantidad de valores para el arreglo="));
        arreglo = new int[numerodevalores];
            System.out.println("Llenando arreglo");
            for (int i=0;i<numerodevalores;i++){
                System.out.print("Ingrese los valores del arreglo");
                arreglo[i] = entrada.nextInt();
            }
        System.out.println("\n Ingrese el valor que desea buscar:");
           numero = entrada.nextInt();
           int j=0;
           while(j<numerodevalores && arreglo[j]<numero){
               j++;
           }
           if(j==numerodevalores) {
               System.out.println("\n Número no encontrado");
           }
           else{
               if (arreglo[j]==numero) {
                   System.out.println("\n Número encontrado en la posición  " + j);
               }
               else{
                   System.out.println("\n Número no encontrado");

               }

           }







        }

    }



