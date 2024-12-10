/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
   1° o produto do dobro do primeiro com metade do segundo .
   2° a soma do triplo do primeiro com o terceiro.
   3º o terceiro elevado ao cubo.
 */
import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        int numero1, numero2, questao1;
        double numero3, questao2, questao3;

        System.out.print("Digite o 1° número inteiro: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o 2° número inteiro: ");
        numero2 = scanner.nextInt();
        System.out.print("Digite o número real: ");
        numero3 = scanner.nextDouble();

        questao1 = (numero1 *2) + (numero2 / 2);
        questao2 = (numero1 *3) + numero3;
        questao3 = Math.pow(numero3,3);

        System.out.println("O dobro do primeiro número mais metade do segundo número é: "+questao1);
        System.out.println("A soma do triplo do primeiro número mais o terceiro número é: "+questao2);
        System.out.println("O terceiro número elevado ao cubo é: "+questao3);

    }
}