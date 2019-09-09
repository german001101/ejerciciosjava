/*
 * Ingresar 2 números
 * Decir si son iguales
 * Si no son iguales decir si el primero es mayor o el segundo es mayor
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class Numeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert variable
        int num, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        //Operating
        
        if(num > num2){
            System.out.println("El primer numero es el mayor " + num);
        }else{
            System.out.println("El sugundo número es mayor "+ num2 );
        }
    }
    
}
