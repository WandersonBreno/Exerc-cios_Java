/*Faça um programa que peça o tamanho de um arquivo para download (em MB)
e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download 
do arquivo usando este link (em minutos). */

import java.util.Scanner;
public class exercicio18 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em Mb: ");
        double tamanho_mbp = scanner.nextDouble();
        System.out.print("Informe a velocidade do link em Mbps: ");
        double velocidade_link = scanner.nextDouble();

        double tempo = tamanho_mbp / velocidade_link;
        double min = tempo / 60;

        System.out.printf("O tempo aproximado de download do arquivo será de: %.2f minutos",min);

        scanner.close();
    }
}

