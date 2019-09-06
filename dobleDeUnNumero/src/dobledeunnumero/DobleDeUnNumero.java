/*
 * Crear un programa que solicite un numero y calcule el doble del mismo
 *Inicio
 ****Leer numero
 ****doble = numero * 2
 ****Mostrar "el doble es" doble
 *Fin
 */
package dobledeunnumero;

import java.util.Scanner;

public class DobleDeUnNumero {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarando variables
        int numero, doble;
        //Leyendo el dato a ingresar
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        //realizando el cálculo del número doble
        doble = numero * 2;
        //Imprimiendo el valor del número
        System.out.println("\nEl valor doble del número es: "+doble);
    }
    
}
