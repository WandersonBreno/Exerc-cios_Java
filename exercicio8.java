//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;
public class exercicio8{
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        float ganho_por_hora, horas_trabalhada, ganho_total;
        System.out.println("Cálculo de ganho mensal");
        
        System.out.print("Digite o seu ganho por hora trabalhada: ");
        ganho_por_hora = scan.nextFloat();
        System.out.print("Digite quantas horas trabalhou no mês: ");
        horas_trabalhada = scan.nextFloat();
        ganho_total = ganho_por_hora * horas_trabalhada;
        System.out.println("Seu salário de acordo com os dados informados é: "+ganho_total);
    
    }
}