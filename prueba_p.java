/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pplias;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class prueba_p {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //daos
        int tam, opt, tope=0;
        //tamaño
        tam=27;
        //pila
        char [] pila = new char [ tam ];
        //menu 
        do{
            System.out.println("\n 1-llenar\n "+"2-mostrar\n"+"3-eliminar\n"+"4-salir\n");
            switch(opt= sc.nextInt()){
                case 1:
                    if(tope<tam){
                        for(int i=tope=0;i<27;i++){
                    System.out.println((i+1)+"ingrese un valor:" );              
                    pila[tope] = sc.next().charAt(0);
                    tope++;
                        }
                        System.out.println("valores agregados");
                    }else {System.out.println("pila llena... ");}
                    break;
                case 2:
                    if(tope>0){
                    for(int i = tope - 1;   i >= 0; i--){
                        System.out.println(" "+ pila [i]);
                    }
                    }else{System.out.println("pila vacia... ");}
                    break;
                case 3:
                    if(tope>0){
                        System.out.println("datoeliminado...");
                        tope--;
                    }else{System.out.println("no hay datos para eliminar...");}
                    break;
        }
        } while (opt !=4); 
        
    }
    
}

