/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios7.pkg2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
            File f = new File("Ejercicio3.txt");
            Scanner sc = new Scanner (System.in);
            String nombre;
            int contador1=9;
            int contador2=1;
             FileWriter fw = new FileWriter(f); 
             String [][] nt = new String [10][2];
           
            System.out.println("Introduce 10 nombres");
            for (int i = 0; i < 10; i--) {
                for (int j = 0; j < 2; j++) {
                    
                }
                nombre=sc.next();
                nt[i]=nombre;
                
                System.out.println("te quedan "+contador1--+" nombres por introducir");
            
        }
            System.out.println("Introduce 10 tipos");
            for (int i = 0; i < tipos.length; i++) {
                nombre=sc.next();
                tipos[i]=nombre;
                System.out.println("te quedan "+contador1--+" tipos por introducir");
            
        }
            System.out.println("si quiere cambiar algun dato, pulse 1, si no, pulse 2");
            int elegir= sc.nextInt();
            if (elegir==1) {
                System.out.println("Aqui tiene los nombres que ha introducido, escriba cual quiere modificar");
                for (int i = 0; i < nombres.length; i++) {
                    System.out.println("El nombre en la posición "+ contador2++ +" es ");
                    
                    System.out.println(nombres[i]);
                    
                    System.out.println("\n");
                    System.out.println(tipos[i]);
                    
                    System.out.println("\n");
                    
                }
                
        
            
        }
            
            
                
}
}