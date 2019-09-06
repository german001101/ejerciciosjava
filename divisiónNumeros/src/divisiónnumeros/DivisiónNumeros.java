/*
 * Crear un programa que solicite dos números enteros y retorne la division entre estos.
 */
package divisiónnumeros;

import java.util.Scanner;

public class DivisiónNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables
        int num, num2, division;
        //Data request
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num = input.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = input.nextInt();
        //Perform the operation
        division = num/num2;
        //Printing the division
        System.out.println("\nEl resultado es: "+division);
    }
    
}
