/*
 *Ingresar el año de nacimiento de una persona
 *Mostrar la edad que tendrá a fin de año (o sea que cumplirá durante el
 *año lectivo)
 *Decir si es mayor o menor de edad
 *Decir si falleció o si aún no ha nacido
 *Cuando esté pronto testearlo con los años:
 *o 1900
 *o 1950
 *o 2000
 *o 2050
 */
package añosnacimiento;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class Añosnacimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anioNacimiento, edad, mayorEdad, estado, test, anio; 
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el año de nacimiento: ");
        anioNacimiento = input.nextInt();
        System.out.println("Ingrese el año: ");
        anio = input.nextInt();
        edad = anio - anioNacimiento;
        if (edad >= 18){
            System.out.println("\nEs mayor de edad");
        }else{
            System.out.println("\nNo es mayor de edad");
        }
        System.out.println("\nSu edad es: "+edad);
    }
    
}
