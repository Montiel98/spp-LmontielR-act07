package spp.lmontielrocha.act07;
import java.util.Scanner;
public class SppLmontielRochaAct07 {

    public static void main(String[] args) {
 int n;
        String [] Numero = new String[10];
        Scanner dato = new Scanner (System.in);
        for (int i = 0; i < Numero.length; i++){
            System.out.println("Introduce el telefono " + i);
            Numero[i] = dato.nextLine();
        }
        System.out.println("introduzca el numero");
        n = dato.nextInt();
        if (n < Numero.length){
        System.out.println("El numero es " + Numero[n]);
        } else System.out.println(" Esta fuera del rango el numero que acaba de ingresar.");
    }
    
} 
   
