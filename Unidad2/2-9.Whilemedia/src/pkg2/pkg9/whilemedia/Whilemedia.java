package pkg2.pkg9.whilemedia;
import java.util.Scanner;
/**
 *
 * @author Brenda
 */
public class Whilemedia {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println("Introduzca un numero");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num<=0){
            suma+= num;
            elementos++;
            
            System.out.println("Introduce otro numero");
            num=entrada.nextInt();
            }
        
            media = (float)suma/elementos;
            System.out.println("La media es de: " + media);
            }
        }
    
    

