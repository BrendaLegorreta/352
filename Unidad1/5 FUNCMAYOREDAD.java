
package pkg5.funcmayoredad;

import java.util.Scanner;

public class FUNCMAYOREDAD {

    public static void main(String[] args) {
        // declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        int numero;
        //procesamiento de datos 
        System.out.println(" ingresa tu edad ");
        numero = Entrada.nextInt();
        //Salida de datos 
        System.out.println(retornaEdad(numero));
    }
    public static String retornaEdad(int numero){
        
        if (numero >=18){
            System.out.println("Eres mayor de edad ");
        } else if (numero<18){
            System.out.println("Eres menor de edad ");
        }
      
      return "Este es tu caso";   

    }
}
