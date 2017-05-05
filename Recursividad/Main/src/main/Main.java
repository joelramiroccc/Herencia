/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author esdras.lopez
 */
public class Main {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int numero1,numero2;
      String opcionElegida;
      boolean continuar=true;
      
      
      do{
		System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("Elija la opción que desea ejecutar: \n" + "1. Potencia. \n" + "2. Número divisible  \n" + "3. Número divisible True o False. \n" + "4.Salir.");
        opcionElegida= scanner.nextLine();
        Ejercicios ejercicios;
          ejercicios = new Ejercicios();
        
            switch(opcionElegida){
                case "1":
                    System.out.print("Digite base: ");
                    numero1=scanner.nextInt();
                    System.out.print("Digite exponente: ");
                    numero2=scanner.nextInt();
                    System.out.println(Ejercicios.calcular(numero1,numero2,1));
                    break;
                    
                case "2":
                    System.out.print("Digite primer número: ");
                    numero1=scanner.nextInt();
                    System.out.print("Digite segundo número: ");
                    numero2=scanner.nextInt();
                    System.out.println(Ejercicios.cal(numero1,numero2));
                    break;
                    
                case "3":
                    System.out.print("Digite primer número: ");
                    numero1=scanner.nextInt();
                    System.out.print("Digite segundo número: ");
                    numero2=scanner.nextInt();
                    System.out.println(Ejercicios.calcu(numero1,numero2));
                    break;
                    
                case "4":
                    continuar=false;
                    break;
             }
        }while(continuar);  
    }
    
}
