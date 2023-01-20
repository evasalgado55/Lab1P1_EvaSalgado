/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eva salgado
 */

//Lab1P1_EvaSalgado

import java.util.scanner; 

public class Lab1P1_EvaSalgado {
    public static void main(String[] args) {
       scanner leer = new scanner (source; system.in);  
       
       int numa;
       int numb;
       int numc;
       int resp = 1;
       int tot_abc;
       
       while (resp != 0){
          system.out.printin("Inserte a: ");
           numa = leer.nextint(); 
           system.out.printin("Inserte b: ");
           numb = leer.nextint();
           system.out.printin("Inserte c: ");
           numc = leer.nextint();
   
           //determinar si es trinagulo
           tot_abc = numa + numb + numc;
           if (tot_abc==12){
               system.out.print("los lados ingresados si forman un triangulo");
           } else {
               system.out.print("los lados ingresados no forman un triangulo");
           }
           
           system.out.print("Desea ingresar otras longitudes?[1:si/0:no]");
           resp = leer.nextint();
       }  
    }
}//fin del algoritmo
