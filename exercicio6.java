import java.util.Scanner;
public class exercicio6 {

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva o valor do raio: ");

        double raio = scan.nextFloat();
        double area = Math.PI * (raio * raio);

        System.out.println("O valor da área é: "+area);
    }
}
