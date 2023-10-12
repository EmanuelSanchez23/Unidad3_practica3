
package practica3;

import java.util.Scanner;

public class Practica3unidad3 {

   
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        int num, fib, fit, e;
        do {            
            System.out.print(" Ingresa numero: ");
            num = Scanner.nextInt();           
        } while (num<=1);
        System.out.println(" Los " + num + " primeros  numeros de la serie son: ");
        fib=1;
        fit=1;
        System.out.print(fib + " ");
        for (int i = 2; i <=num; i++) {
            System.out.println(fit + " ");
            fit = fib + fit;
            fit = fit + fib;            
        }
        
    }
    
}
