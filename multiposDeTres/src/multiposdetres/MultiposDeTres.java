/*
 * que muestre los números múltiplos de 3, del 1 al 100.
 */
package multiposdetres;

/**
 *
 * @author gburgos
 */
public class MultiposDeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant=1,resto;
        System.out.println(cant);
        while(cant <= 100){
            cant++;
            resto = cant%3;
            if(resto == 0){
                System.out.println(cant);
            }
        }
    }
    
}
