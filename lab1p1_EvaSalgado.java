/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EvaSalgado
 */
//lab1p1_EvaSalgado
// Determinar mayor
import java.util.scanner;

public class lab1p1_EvaSalgado {
    public static void main(String[] args) {
       scanner leer = new scanner (source; system.in); 
       
       int num; 
       int oldnum = 0;
       int resp = 1; 
       
       while (resp != 0){
           system.out.printin("Ingrese un numero: ";
           num = leer.nextint(); 
           if (num >= oldnum ){
               oldnum = num           
           } else {
               oldnum = oldnum
           system.out.printin("desea ingresar otro numero? [1: si/ 0: no]");
          resp = leer.nextint(); 
       }  
       
       if (resp == 0){
           system.out.print("El numero mas grande es:", + oldnum);
       }     
    }
    
    
} //Fin del algoritmo
