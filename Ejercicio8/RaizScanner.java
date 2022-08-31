package Ejercicio8;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RaizScanner Raiz= new RaizScanner();
        double num = 0;
        System.out.println("Introduce un numero");
        num = leer.nextInt();

        double raizCuadrada = Math.sqrt(num);
        System.out.println("La raiz de " + num + "es " + raizCuadrada);
    }
    private double num;

    public RaizScanner() {
        num =0;
    }

    public RaizScanner(double numero){
        num = numero;
    }
    public double getNum(){ return num;}
    public void setNum(double num){this.num = num;}

}
