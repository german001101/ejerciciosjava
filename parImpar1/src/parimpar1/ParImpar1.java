/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar1;

import java.util.Scanner;

/**
 *
 * @author gburgos
 */
public class ParImpar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables
        int a;
        //Requesting data
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        //Operation
        if ( a%2 != 0){
            System.out.println("\n El valor es impar");
        }else{
            System.out.println("\n El valor es par");
        }
    }
    
}



