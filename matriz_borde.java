package javaapplication2;
import java.util.Scanner;
public class matriz_borde {
   public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = teclado.nextInt();// alamcenar dato
        teclado.close();
 
        System.out.println();
        //calcular y dividir los datos
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}