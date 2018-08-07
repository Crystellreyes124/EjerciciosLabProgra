/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana3;
import java.util.Scanner;
/**
 *
 * @author Crystell Reyes
 */
public class Ejercicio1 {
     public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);

          int numero,par=0,multiplo3=0,divisor=0,cont=0,primo=0,cont2=1;
         while(cont2<=5){
             
            System.out.print(" || Ingrese un número:  ||: ");
             numero= leer.nextInt();
              //Primos
                while(cont<=numero){
                  if (cont%numero==0){
                      divisor+=1;
                      cont+=1;
                  }
                  else{
                      cont+=1;
                  } 
                  
                  if (divisor==2){
                     primo+=1;
                } 
              }
                           
                  //Pares         
              if (numero%2==0){
                  par+=1;
              } 
              
              //Multiplos
              if (numero%3==0){
                  multiplo3+=1;   
              } 
              

              

               cont2+=1;
         }
         System.out.print("Numeros pares: "+ par+"\n");
         System.out.print("Multiplos de 3: "+multiplo3+"\n");
         System.out.print("Numeros primos: "+ primo+"\n");
         
         
         
         
         
         
     }
     
     
     
     }
