/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjericiciosClase;
import java.util.Scanner;
/**
 *
 * @author Crystell Reyes
 */
public class DecimalBinario {
 
    public static void main(String[] args) {
    
        Scanner read=new Scanner(System.in);       
        System.out.print(" || Convertidor de Decimal a Binario. || \n");
        
       int numero_b10;
        System.out.print("Ingrese un numero decimal (base 10) : ");
        numero_b10=read.nextInt();

        if (numero_b10>0){
                
         int dividendo=numero_b10; //11
         int divisor=2;             //2
         int cociente=dividendo/divisor; //5
         int residuo=dividendo%divisor;  //1
         
         String numero_b2="";
         
         while (cociente>=1){
             numero_b2=residuo+numero_b2; //1+""
             dividendo=cociente;          //5
             cociente=dividendo/divisor;  //2
             residuo=dividendo%divisor;     //1
             
         }
          numero_b2="1"+numero_b2;
           System.out.print("El numero binario de "+numero_b10+" es: "+numero_b2+"\n");
        }
        else {
            System.out.println("Ingresar un numero entero positivo. ");
        }
    }
}
