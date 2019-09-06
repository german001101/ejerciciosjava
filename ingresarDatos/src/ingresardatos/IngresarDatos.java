package ingresardatos;

import java.util.Scanner;

public class IngresarDatos {

    public static void main(String[] args) {
        // TODO code application logic here
        //Declarando variables
        int edad;
        float altura;
        String nombre;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = input.next();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println("Ingrese su altura: ");
        altura = input.nextFloat();
        System.out.println("\n Los datos ingresados fueron: \n Nombre: "+nombre+"\n Edad: "+edad+"\n Altura: "+altura+"m");
    }
    
}
