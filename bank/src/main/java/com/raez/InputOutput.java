package com.raez;

import java.util.Scanner;

class InputOutput {

    private static Scanner input = new Scanner(System.in);

    public static String leerString(){

        return input.nextLine();
        
    }

    public static int leerInt(){

        while (true) {
            
            if (input.hasNextInt()) {
                
                int numero = input.nextInt();
                input.nextLine();
                return numero;

            }else{

                System.out.print("Tienes que introducir un numero válido: ");
                input.nextLine();

            }

        }

    }

}
