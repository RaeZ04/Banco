package com.raez;

import java.util.ArrayList;

class banco {

    ArrayList<cuenta> bank = new ArrayList<>();

    public void agregarcuenta(int id, String propietario, int saldo) {

        cuenta nuevacuenta = new cuenta(id, propietario, saldo);
        bank.add(nuevacuenta);

        System.out.println(
                "Cuenta agregada con ID: " + id + ", Propietario: " + propietario + ", Saldo: " + saldo + " euros.");

    }

    public void añadirsaldo(int id, int saldo) {

        for (cuenta cuenta : bank) {

            if (cuenta.getId() == id) {

                int nuevosaldo = cuenta.getSaldo() + saldo;
                cuenta.setSaldo(nuevosaldo);

                System.out.println("");
                System.out.println("Has agregado " + saldo + " euros. Tu nuevo saldo es: " + nuevosaldo + " euros.");

            } else {

                System.out.println("");
                System.out.println("No se ha encontrado una cuenta con ese ID.");

            }

        }

    }

    public void versaldo(int id) {

        for (cuenta cuenta : bank) {

            if (cuenta.getId() == id) {

                System.out.println("");
                System.out.println("El saldo de la cuenta de " + cuenta.getPropietario() + " es de " + cuenta.getSaldo()
                        + " euros.");

            } else {

                System.out.println("");
                System.out.println("No se ha encontrado una cuenta con ese ID.");

            }

        }

    }

    public void listacuentas() {

        int contador = 0;

        for (cuenta cuenta : bank) {

            System.out.println("ID: " + cuenta.getId() + ", Propietario: " + cuenta.getPropietario() + ", Saldo: "
                    + cuenta.getSaldo() + " euros.");
            contador++;

        }

        if (contador == 0) {

            System.out.println("");
            System.out.println("No se ha encontrado ninguna cuenta.");

        } else {

            System.out.println("");
            System.out.println("Hay un total de " + contador + " cuentas.");

        }

    }

    public void eliminarcuenta(int id) {

        for (cuenta cuenta : bank) {

            if (cuenta.getId() == id) {

                bank.remove(cuenta);

                System.out.println("");
                System.out
                        .println("Has eliminado la cuenta a nombre de " + cuenta.getPropietario() + " correctamente.");
                

            } else {

                System.out.println();
                System.out.println("No se ha encontrado ninguna cuenta con ese ID.");

            }

        }

    }

    public void transferirdinero(int id_salida, int id_entrada, int saldo) {

        boolean cuentaSalidaEncontrada = false;
        boolean cuentaEntradaEncontrada = false;

        for (cuenta cuenta : bank) {

            if (id_salida == cuenta.getId()) {

                cuentaSalidaEncontrada = true;
                int saldo_actual_salida = cuenta.getSaldo();

                if (saldo_actual_salida >= saldo) {

                    for (cuenta cuenta2 : bank) {

                        if (id_entrada == cuenta2.getId()) {

                            cuentaEntradaEncontrada = true;

                            int nuevosaldo_salida = cuenta.getSaldo() - saldo;
                            cuenta.setSaldo(nuevosaldo_salida);

                            int nuevosaldo_entrada = cuenta2.getSaldo() + saldo;
                            cuenta2.setSaldo(nuevosaldo_entrada);

                            System.out.println();
                            System.out.println(
                                    "Has transferido satisfactoriamente " + saldo + " euros desde la cuenta de "
                                            + cuenta.getPropietario() + " a la de " + cuenta2.getPropietario() + ".");

                            break;
                        }

                    }

                    if (!cuentaEntradaEncontrada) {

                        System.out.println("");
                        System.out.println("No se ha encontrado la cuenta a la que desea transferir el dinero.");
                        break;

                    }
                } else {

                    System.out.println("");
                    System.out.println("No hay suficiente dinero en la cuenta.");
                    break;

                }
            }
        }

        if (!cuentaSalidaEncontrada) {

            System.out.println("");
            System.out.println("No se ha encontrado la cuenta de la que desea extraer el dinero.");

        }

    }

}
