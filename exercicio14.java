/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 
por quilo excedente. João precisa que você faça um programa que leia a variável peso 
(peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do 
programa com as mensagens adequadas. */

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double peso_peixes, excesso = 0, multa = 0;

        System.out.println("Bem vindo João");
        System.out.print("Informe quantos quilos de peixe foi pego: ");
        peso_peixes = scanner.nextDouble();

        if (peso_peixes > 50){
            excesso = peso_peixes - 50;
            multa = excesso * 4;
            System.out.printf("O peso em kg de excesso dos peixes é de: %.2f kg.%n",excesso);
            System.out.printf("O valor da multa a ser pago é de: %.2f R$.%n",multa);
        }
        else{
            System.out.println("Não é necessário pagar multa.");
        }
        scanner.close();
    }
}