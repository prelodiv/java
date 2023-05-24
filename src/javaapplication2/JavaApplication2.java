/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author prelo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el numero 1");
        int numero1 = leer.nextInt();
        System.out.println("ingrese el numero2");
        int numero2 = leer.nextInt();
        System.out.println("la suma es" + (numero1 + numero2));
                
    }
    
}
