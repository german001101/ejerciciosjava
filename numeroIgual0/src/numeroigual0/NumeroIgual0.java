/*
 * Crear un programa que solicite números hasta que se ingrese un 0 y retorne la suma
 * de los mismos.
 */
package numeroigual0;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class NumeroIgual0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables
        int num = 1, suma = 0;
        //Operating
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero. ");
        num = input.nextInt();
        while (num != 0){
            suma = suma + num;
            System.out.println("Ingrese otro numero: ");
            num = input.nextInt();
        }
        System.out.println("\nLa suma de los numeros ingresados es: "+suma);
    }
    
}
