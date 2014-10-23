/*Mostrar en pantalla dando una cantidad de dinero, 
 los billetes en 100,20,5 y monedas de un euro. */
package boletin2.pkg10;

import java.util.Scanner;

public class Boletin210 {

    public static void main(String[] args) {
        // Código de la aplicación.
        // D=cantidad de dinero 
        int D, x, y, z, v;
        System.out.println("Introduzca una cantidad de dinero en €");
        Scanner dato = new Scanner(System.in);
        System.out.println("Cantidad: ");
        D = dato.nextInt();

        x = D / 100;
        y = D % 100 / 20;
        z = D % 100 % 20 / 5;

        System.out.println("Billetes de 100€: " + x);
        System.out.println("Billetes de 20€: " + y);
        System.out.println("Billetes de 5€: " + z);
        System.out.println("Monedas de 1€: " + z);
    }

}
