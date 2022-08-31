package Ejercicio9;

import java.util.Scanner;

public class CalcularPeso {

    public static void main(String[]args) {
        Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Ingrese su altura en cm: ");
        persona.setAltura(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese con mayusculas");
        System.out.println("Ingrese a que genero pertenece: H o M");
        persona.setGenero(leer.nextLine().charAt(0));

        System.out.println(CalcularPeso.getPesoIdeal(persona));
        System.out.println(persona.toString());

    }

    public static int getPesoIdeal(Persona persona) {
        switch (persona.getGenero()) {
            case 'H': return persona.getAltura() - 110;
            case 'M': return persona.getAltura() - 120;
            default: return -200;
        }
    }

}
 class Persona {
    private int altura;
    private char genero;
    private int pesoIdeal;

     public int getAltura() {
         return altura;
     }

     public void setAltura(int altura) {
         this.altura = altura;
     }

     public char getGenero() {
         return genero;
     }

     public void setGenero(char genero) {
         this.genero = genero;
     }
     public int getPesoIdeal(){
         return pesoIdeal;
     }
     public int setPesoIDeal(){
         this.pesoIdeal = pesoIdeal;
        return pesoIdeal;
     }
     private void ComprobarGenero(char genero){
         if (genero!= 'H' && genero!= 'M'){
             this.genero = 'H';
         } else {
             this.genero = genero;
         }
     }
    public String toString(){
         String gender = "";
         if(this.genero=='H'){
          gender = "Hombre";
         } else {gender = "Mujer";}
         return "Genero: " + gender + ", Altura: " + altura + ", Peso ideal: " + CalcularPeso.getPesoIdeal(this);
    }


 }