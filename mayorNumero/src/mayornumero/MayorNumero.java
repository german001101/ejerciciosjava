/*
 * find number 
 */
package mayornumero;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class MayorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int num, num2, result;
        //Requesting data
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        //Operating
        if(num > num2){
            System.out.println("\nEl numero mayor es: " + num);
        }else{
            System.out.println("\nEl numero mayor es: " +  num2);
        }
            
    }
    
}
