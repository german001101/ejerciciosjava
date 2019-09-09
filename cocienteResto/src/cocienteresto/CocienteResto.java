/*
 * Ingresar 2 números y calcular cociente y resto entero.
 * Avisar que no es posible cuando el divisor es cero
 */
package cocienteresto;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class CocienteResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Insert variable
        int dividendo, divisor, resto, cociente;
        float result;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        dividendo = input.nextInt();
        System.out.println("Ingrese otro número: ");
        divisor=input.nextInt();
        if(divisor == 0){
            System.out.println("La operacción no es posible realizar por que el divisor es igual a 0");
        }else{
            cociente = dividendo/divisor;
            System.out.println("\nEl cociente es: " + cociente);
            resto = dividendo%divisor;
            System.out.println("\nEl resto es: " + resto);
        }
        
        
    }
    
}
