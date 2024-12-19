/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a)Salário bruto.
b)Quanto pagou ao INSS.
c)Quanto pagou ao sindicato.
d)O salário líquido.
e)Calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$ */

import java.util.Scanner;

    public class exercicio15 {
    
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double salario_mes = 0, ganho_hora = 0, horas_trabalhada = 0, inss = 0, sindicato = 0, imposto_renda = 0, salario_liquido = 0;

            System.out.println("Cálculo de salário");
            System.out.print("Informe quanto ganha por hora trabalhada: ");
            ganho_hora = scanner.nextDouble();
            System.out.print("Informe quantas horas trabalhada no mês: ");
            horas_trabalhada = scanner.nextDouble();

            salario_mes = ganho_hora * horas_trabalhada;
            inss = salario_mes * (8.0 / 100);
            sindicato = salario_mes * (5.0 / 100);
            imposto_renda = salario_mes * (11.0 / 100);
            salario_liquido = salario_mes - inss - sindicato - imposto_renda;

            System.out.printf("Salário Bruto: R$ %.2f%n",salario_mes);
            System.out.printf("Desconto Inss: R$ %.2f%n",inss);
            System.out.printf("Desconto Sindicato: R %.2f$%n",sindicato);
            System.out.printf("Desconto Imposto de Renda: R %.2f$%n",imposto_renda);
            System.out.printf("Salário Líquido: R$ %.2f%n",salario_liquido);
            
            scanner.close();
        }
    }