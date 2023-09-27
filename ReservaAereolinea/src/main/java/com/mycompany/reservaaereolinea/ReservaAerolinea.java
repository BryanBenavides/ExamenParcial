package com.mycompany.reservaaereolinea;

import java.util.Scanner;

public class ReservaAerolinea {
    public static void main(String[] args) {
        char[][] asientos = new char[13][6];

        for (int fila = 0; fila < 13; fila++) {
            for (int asiento = 0; asiento < 6; asiento++) {
                asientos[fila][asiento] = '*';
            }
        }

        Scanner lector = new Scanner(System.in);

        while (true) {
            
            System.out.println("Menú de Reserva de Asientos:");
            
            System.out.println("1. Reservar asiento");
            
            System.out.println("2. Mostrar disponibilidad de asientos");
            
            System.out.println("3. Salir");
            
            System.out.print("Por favor, seleccione una opción (1/2/3): ");
            
            int opcion = lector.nextInt();

            if (opcion == 1) {
                System.out.println("Tipos de boleto:");
                
                System.out.println("1. Primera Clase");
                
                System.out.println("2. Clase de Negocios");
                
                System.out.println("3. Clase Económica");
                
                System.out.print("Por favor, seleccione el tipo de boleto (1/2/3): ");
                
                int tipoBoleto = lector.nextInt();

                if (tipoBoleto >= 1 && tipoBoleto <= 3) {
                    int filaInicio = (tipoBoleto == 1) ? 0 : ((tipoBoleto == 2) ? 2 : 7);
                    int filaFin = (tipoBoleto == 1) ? 1 : ((tipoBoleto == 2) ? 6 : 12);

                    System.out.println("Asientos disponibles:");
                    for (int fila = filaInicio; fila <= filaFin; fila++) {
                        for (int asiento = 0; asiento < 6; asiento++) {
                            if (asientos[fila][asiento] == '*') {
                                System.out.println("Fila " + (fila + 1) + ", Asiento " + (asiento + 1));
                            }
                        }
                    }

                    System.out.print("Ingrese la fila y el asiento deseado (por ejemplo, 1 3): ");
                    int filaDeseada = lector.nextInt() - 1;
                    int asientoDeseado = lector.nextInt() - 1;

                    if (filaDeseada >= filaInicio && filaDeseada <= filaFin && asientoDeseado >= 0 && asientoDeseado < 6) {
                        if (asientos[filaDeseada][asientoDeseado] == '*') {
                            asientos[filaDeseada][asientoDeseado] = 'X';
                            System.out.println("¡Asiento reservado con éxito!");
                        } else {
                            System.out.println("El asiento ya está ocupado.");
                        }
                    } else {
                        System.out.println("Selección de asiento no válida para el tipo de boleto.");
                    }
                } else {
                    System.out.println("Opción no válida. Por favor, seleccione un tipo de boleto válido.");
                }
            } else if (opcion == 2) {
                System.out.println("Disponibilidad de asientos:");
                for (int fila = 0; fila < 13; fila++) {
                    for (int asiento = 0; asiento < 6; asiento++) {
                        System.out.print(asientos[fila][asiento] + " ");
                    }
                    System.out.println();
                }
            } else if (opcion == 3) {
                System.out.println("Gracias por usar nuestro servicio de reserva de asientos.");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        lector.close();
    }
}

