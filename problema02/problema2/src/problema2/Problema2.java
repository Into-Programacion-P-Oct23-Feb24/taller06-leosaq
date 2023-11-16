/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double precioCarro;
        String nombre;
        String apellido;
        double total = 0;
        int op;
        String vehiculo= ""; 

        System.out.println("Ingrese el nombre del usuario");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del usuario");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el valor del vehiculo");
        precioCarro = entrada.nextDouble();
        System.out.println("Selecciones el tipo de vehiculo\n"
                + "Ingrese 1 <-- vehículo liviano particular\n"
                + "Ingrese 2 <-- vehículo grande particular\n"
                + "Ingrese 3 <-- taxi\n"
                + "Ingrese 4 <-- bus urbano");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                total = (precioCarro * 0.01) /100 + 2;
                vehiculo ="Vehículo liviano particular";
                break;

            case 2:
                total = (precioCarro * 0.02) /100 + 2.5;
                vehiculo ="Vehículo grande particular";
                break;

            case 3:
                total = (precioCarro * 0.04) /100 + 1.5;
                vehiculo ="Taxi";
                break;
            case 4:
                total = (precioCarro * 0.05) /100 + 2.2;
                vehiculo ="Bus urbano";
                break;

            default:
                System.out.println("Datos incorrectos");
                break;
        }
        System.out.printf("Peaje \"Buena vía\" Propietario:%s %s Tipo:%s "
                + "Valor:%s Peaje:%s",
                nombre, apellido, vehiculo, precioCarro, total);

    }

}
