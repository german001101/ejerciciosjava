/*
 * Crear un programa que solicite dos numeros y retorne la suma
 */
package dosnumerossuma;

import java.util.Scanner;

public class DosNumerossuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarations of variables
        int num1, num2, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        //Perform the operation
        resultado = num1+num2;
        //printing the sum  
        System.out.println("\nLa suma de los números es: " + resultado);
       
    }
    
}
