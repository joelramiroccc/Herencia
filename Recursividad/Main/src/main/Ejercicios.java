/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author esdras.lopez
 */
public class Ejercicios {
    
    public static int calcular(int numero1, int numero2, int total){
        if(numero2==0){
            return total;
        }else{
            total*=numero1;
            return calcular(numero1,--numero2,total);
        }
    }
     
     
          public static int cal(int numero1, int numero2){
          if(numero1<numero2){
              return numero1;
          }else{
              return cal(numero1-numero2,numero2);
          }
      }
          
          
         public static boolean calcu(int numero1, int numero2){
            if(numero1<0){
                 return false;
             }else if(numero1==0){
            return true;
             }else{
              return calcu(numero1-numero2,numero2);
             }
           
         }
    
}
