/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados 
da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */
import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double area, litros, latas;
        double precoPorLata = 80.0; 

        System.out.print("Informe qual o tamanho da área: ");
        area = scanner.nextDouble();

        litros = area / 3.0;
        latas = Math.ceil(litros / 18.0);

        double precoTotal = latas * precoPorLata;
       
        
        System.out.printf("A quantidade de latas que será gasta é de: %.0f\n",latas);  
        System.out.printf("O valor a ser pago é de: R$ %.2f\n", precoTotal);

        scanner.close();
    }
}
