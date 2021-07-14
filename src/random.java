
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var r = new Random();
        var random = r.nextInt(99)+1;
        var contador = 0;
        System.out.println(random);

        while (random != contador ){
            System.out.println("Ingrese un numero del 0 al 99");
            contador = sc.nextInt();
            if(contador > random){
                System.out.println("El numero es mayor");
            }else if(contador < random){
                System.out.println("El numero es Menor");
            }else if(contador == random){
                
                System.out.println("Adivinaste");
            }
        }
        sc.close();
    }
    
}
