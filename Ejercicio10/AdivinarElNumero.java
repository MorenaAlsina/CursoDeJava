package Ejercicio10;

import java.util.Scanner;

public class AdivinarElNumero {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char decision = 'S';
        do {
            adivinarElNumero();
            System.out.println("Desea seguir jugando? S / N");
            decision = leer.nextLine().charAt(0);
        } while (decision != 'N');
    }

    public static void adivinarElNumero() {
        Scanner leer = new Scanner(System.in);
        int numeroRandom = (int) (Math.random() * 100);
        int numeroDelUsuario = -1;

        do {
            System.out.println("Ingrese un numero");
            numeroDelUsuario = leer.nextInt();

            if (numeroRandom > numeroDelUsuario) {
                System.out.println("El numero ingresado es menor que el numero aleatorio");
            } else if (numeroRandom < numeroDelUsuario) {
                System.out.println("El numero del usuario es mayor que el numero aleatorio");
            } else if (numeroRandom == numeroDelUsuario) {
                break;
            }

        } while (numeroRandom != numeroDelUsuario);
        System.out.println("Correcto!, el numero aleatorio es: " + numeroRandom);
    }
}