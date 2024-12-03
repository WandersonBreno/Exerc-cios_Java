import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args){
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Digite um número: ");
             int numero = in.nextInt();

             System.out.print("O número digitado foi "+numero);
        }
    }
}
