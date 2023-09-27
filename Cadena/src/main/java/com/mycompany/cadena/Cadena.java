package com.mycompany.cadena;

import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadenaOriginal = lector.nextLine();


        char[] cadena = new char[cadenaOriginal.length()];

        
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            cadena[i] = cadenaOriginal.charAt(i);
        }

        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] >= 'a' && cadena[i] <= 'z') {
                cadena[i] = (char) (cadena[i] - 'a' + 'A');
            }
        }

        System.out.print("Cadena en letras mayúsculas: ");
        for (char c : cadena) {
            System.out.print(c);
        }

        lector.close();
    }
}
