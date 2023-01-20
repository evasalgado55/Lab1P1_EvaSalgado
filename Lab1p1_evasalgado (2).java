/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eva
 */
// Lab1P1_EvaSalgado
//socios

import java.util.Scanner; 

public class Lab1P1_EvaSalgado {
    public static void main(String[] args) {
         scanner leer = new scanner (source; system.in); 
        int opcion = 0;
        
        
        while (opcion != 4){
             system.out.printin("Menu")
            system.out.printin( "1. Socios")
            system.out.printin( "2. Determinar Mayor")
            system.out.printin( "3. Triagulo o No")
            system.out.printin( "4. Salir")
            
            opcion = leer.nextInt();
            
            if(opcion ==1){
                int grado = -1;
                float total = 0.0f;
                int repetir = 1;

                while (repetir != 0) {
                    system.out.printin("ngrese el grado del socio:");
                    grado = leer.nextInt();
                    system.out.printint("Ingrese el total de la compra: ");
                    total = leer.nextFloat();

                    //1 porcentaje 
                    if (grado == 0) {
                        total = total;
                    } else if (grado == 1) {
                        total = 0.9f * total;
                    } else if (grado == 2) {
                        total = 0.85f * total;
                    } else if (grado == 3) {
                        total = 0.75f * total;
                    } else {
                        system.out.printin("El grado ingresado no es valido.");
                    }
                    
                    system.out.printin8("Total a pagar: ",+total); 
                   
                    system.out.printin("deseas calculr el total a pagar de ptro cliente? [1/0]: ");
                    repetir = leer.nextint();
                }
            } else if (opcion == 2){
                
            } else if (opcion == 3){
                
            } else if (opcion == 4){
                system.out.printin("Terminando ejecucion")
            } else { 
                system.out.printin("La opcion ingresada no es válida")
                        
            }
                
        }
           
    }
       
   
} //Fin del algoritmo

