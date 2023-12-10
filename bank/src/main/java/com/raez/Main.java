package com.raez;

public class Main {
    public static void main(String[] args) {

        try {

            banco banco = new banco();

            int eleccion = 0;
            int idnuevacuenta = 0;

            do {
                System.out.println("");
                System.out.println("-------");
                System.out.println(" Banco");
                System.out.println("-------");
                System.out.println("");
                System.out.println("1. Ver Lista Cuentas.");
                System.out.println("2. Añadir Cuentas");
                System.out.println("3. Añadir saldo a la Cuenta.");
                System.out.println("4. Ver Saldo Cuenta");
                System.out.println("5. Transferir Dinero.");
                System.out.println("6. Eliminar Cuenta.");
                System.out.println("7. Salir.");
                System.out.println("");
                System.out.print("Opción: ");

                eleccion = InputOutput.leerInt();

                if (eleccion == 1) {

                    System.out.println("");
                    System.out.println("Lista de cuentas: ");
                    System.out.println("");

                    banco.listacuentas();

                }

                else if (eleccion == 2) {

                    System.out.println("");
                    System.out.println("Has elegido añadir una cuenta.");
                    System.out.println("");

                    System.out.print("Introduce tu nombre: ");
                    String nombre_propietario = InputOutput.leerString();

                    System.out.print("Introduce el Saldo de la cuenta: ");
                    int saldo = InputOutput.leerInt();
                    System.out.println("");

                    idnuevacuenta++;

                    banco.agregarcuenta(idnuevacuenta, nombre_propietario, saldo);

                }

                else if (eleccion == 3) {

                    System.out.println("");
                    System.out.println("Añadir saldo a la cuenta: ");
                    System.out.println("");

                    System.out.print("Introduce el ID de la cuenta que quieres añadir saldo: ");
                    int id_elegido = InputOutput.leerInt();

                    System.out.print("Introduce la cantidad de saldo que quieres añadir: ");
                    int saldo_añadir = InputOutput.leerInt();

                    banco.añadirsaldo(id_elegido, saldo_añadir);

                }

                else if (eleccion == 4) {

                    System.out.println("");
                    System.out.println("Ver saldo de una cuenta: ");
                    System.out.println("");

                    System.out.print("Introduce el ID de la cuenta que quieres ver el saldo: ");
                    int id_elegido = InputOutput.leerInt();

                    banco.versaldo(id_elegido);

                }

                else if (eleccion == 5) {

                    System.out.println("");
                    System.out.println("Transferir dinero: ");
                    System.out.println("");

                    System.out.print("Introduce el ID de la cuenta de la que quieres EXTRAER el dinero: ");
                    int id_salida = InputOutput.leerInt();
                    System.out.print("Introduce la cantidad de dinero que quieres transferir: ");
                    int dinero = InputOutput.leerInt();
                    System.out.print("Introduce el ID de la cuenta a la que quieres transferirle el dinero: ");
                    int id_entrada = InputOutput.leerInt();

                    banco.transferirdinero(id_salida, id_entrada, dinero);

                }

                else if (eleccion == 6) {

                    System.out.println("");
                    System.out.println("Eliminar cuenta: ");
                    System.out.println("");

                    System.out.print("Introduce el ID de la cuenta que quieres eliminar: ");
                    int id_elegido = InputOutput.leerInt();

                    banco.eliminarcuenta(id_elegido);

                }

                else {

                    System.out.println("Has introducido una opción incorrecta, elige del 1-7.");

                }

            } while (eleccion != 7);

            System.out.println("");
            System.out.println("Has salido del programa.");
            System.out.println("");

        } catch (Exception e) {

            System.out.println("Ha habido un problema en la ejecución del codigo, se va a volver a iniciar.");
            main(args);

        }
    }
}