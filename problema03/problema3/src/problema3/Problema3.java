/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String incremento;
        String nombre;
        double sueldoFinal = 0;
        double sueldo;
        double aumento;
        int op;

        System.out.println("Ingrese nombre de empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        op = entrada.nextInt();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();
        
        // op = entrada.nextInt();

        switch (op) {
            case 1:
                aumento = (sueldo * 0.05);
                sueldoFinal = sueldo + aumento;
                System.out.printf("Nombre:%s\nTipo de empleado:Empleado 1\nIncremento%.2f\n"
                        + "Nuevo sueldo:%.2f\n",
                        nombre, aumento, sueldoFinal);
                break;

            case 2:
                aumento = (sueldo * 0.07);
                sueldoFinal = sueldo + aumento;
                System.out.printf("Nombre:%s\nTipo de empleado:Empleado 2\nIncremento%.2f\n"
                        + "Nuevo sueldo:%.2f\n",
                        nombre, aumento, sueldoFinal);
                break;

            case 3:
                aumento = (sueldo * 0.09);
                sueldoFinal = sueldo + aumento;
                System.out.printf("Nombre:%s\nTipo de empleado:Empleado 3\nIncremento%.2f\n"
                        + "Nuevo sueldo:%.2f\n",
                        nombre, aumento, sueldoFinal);
                break;

            case 4:
                aumento = (sueldo * 0.12);
                sueldoFinal = sueldo + aumento;
                System.out.printf("Nombre:%s\nTipo de empleado:Empleado 4\nIncremento%.2f\n"
                        + "Nuevo sueldo:%.2f\n",
                        nombre, aumento, sueldoFinal);
                break;

            case 5:
                aumento = (sueldo * 0.15);
                sueldoFinal = sueldo + aumento;
                System.out.printf("Nombre:%s\nTipo de empleado:Empleado 5\nIncremento%.2f\n"
                        + "Nuevo sueldo:%.2f\n",
                        nombre, aumento, sueldoFinal);
                break;
            default:
                System.out.println("Datos ingresados incorrectos");
                break;
        }

    }

}
