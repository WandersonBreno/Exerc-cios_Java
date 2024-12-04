// Faça um Programa que peça a temperatura em graus Celsius,
// transforme e mostre em graus Fahrenheit.
import java.util.Scanner;

public class exercicio10 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double C, F;

        System.out.println("Programa que faz conversão de Celsius para Fahrneheit");

        System.out.print("Digite quantos graus Celsius: ");
        C = scanner.nextDouble();
        F = C *1.8 +32;
        System.out.printf("A conversão de Celsius para Fahrneheit é: %.2f%n",F);


        scanner.close();
    }

}
