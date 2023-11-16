/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int valor1;
        int valor2;
        int op;
        int resultado = 0;
        String tipo = "";

        System.out.println("Ingrese el primer valor la operación 1");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor la operación 2");
        valor2 = entrada.nextInt();

        System.out.println("Selecciones la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir");

        op = entrada.nextInt();

        if (valor1 > valor2) {
            switch (op) {

                case 1:
                    resultado = valor1 + valor2;
                    tipo = "suma";
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    tipo = "resta";
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    tipo = "multiplicación";
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    tipo = "division";
                    break;

                default:
                    System.out.println("Operación incorrecta");
                    break;
            }

        } else {
            System.out.println("Debe ingresar el primer"
                    + " valor MAYOR al "
                    + "SEGUNDO valor");
        }
        System.out.printf("El resultado de la operación %s es: %d\n",
                tipo,
                resultado);

    }
}
