package javaapplication2;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
 int op,l1;
 
    Scanner teclado=new Scanner(System.in);
    System.out.println("Bienvenido");
    System.out.println("1. solo x");
    System.out.println("2. media pantalla");
    System.out.println("3. un marco");
    System.out.println("selccione el numero de la figura que dese");
    op=teclado.nextInt();
    switch(op){
        case 1:      
        System.out.print("Introduce el número de filas: ");
        l1 = teclado.nextInt();
        teclado.close();
 
        System.out.println();   
 
        for(int i=1, k=l1; i<=l1; i++, k--){
            for(int j=1; j<=l1; j++){
 
                if(i==j || k==j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            break;
        case 2:
          System.out.print("Introducir el número de filas: ");
        l1 = teclado.nextInt();
 
        for(int i = 1; i<=l1; i++){
            for(int j = 0; j<=l1-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        teclado.close();
        case 3:
          System.out.print("Introduzca el lado del cuadrado: ");
        l1 = teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=l1; row++){
            for(int col=1; col<=l1; col++){
                if(row==1 || row==l1 || col==1 || col==l1){
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
} 