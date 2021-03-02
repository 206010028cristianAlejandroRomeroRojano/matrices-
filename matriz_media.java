package javaapplication2;
import java.util.Scanner;
public class matriz_media {
 public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = teclado.nextInt();// almacenar dato
 //realiza filas y restar asteriticos 
        for(int i = 1; i<=numFilas; i++){
            for(int j = 0; j<=numFilas-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        teclado.close();// finaliazar programa
    }
}