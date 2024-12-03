//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a 
//temperatura em graus Celsius.C = 5 * ((F-32) / 9).
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converte para Celsius usando a fórmula
        double celsius = 5 * ((fahrenheit - 32) / 9);

        // Exibe o resultado
        System.out.printf("A temperatura em graus Celsius é: %.2f%n", celsius);

        // Fecha o scanner
        scanner.close();
    }   
}