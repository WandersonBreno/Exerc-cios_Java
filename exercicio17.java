/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados 
da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, 
que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 3 situações:
a) Comprar apenas latas de 18 litros;
b) Comprar apenas galões de 3,6 litros;
c) Misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de 
folga e sempre arredonde os valores para cima, isto é, considere latas cheias. */
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe quantos m²: ");
        double area = scanner.nextDouble();
        double metros_quadrados_mais_dez = area * 1.1;
        double rendimento_litro = 6.0;
        double litros_lata = 18.0;
        double preco_lata = 80.0;
        double rendimento_lata = rendimento_litro * litros_lata;
        double litros_galao = 3.6;
        double preco_galao = 25.0;
        double rendimento_galao = rendimento_litro * litros_galao;

        int somente_latas = (int) Math.ceil(area / rendimento_lata);
        int somente_galoes = (int) Math.ceil(area / rendimento_galao);
        
        int latas = (int) Math.floor(metros_quadrados_mais_dez / rendimento_lata);
        int galoes = (int) Math.ceil((metros_quadrados_mais_dez % rendimento_lata) / rendimento_galao);

   
        System.out.printf("Somente latas: %d, Valor: R$ %.2f\n", somente_latas, somente_latas * preco_lata);
        System.out.printf("Somente galões: %d, Valor: R$ %.2f\n", somente_galoes, somente_galoes * preco_galao);
        System.out.printf("Latas: %d, Galões: %d, Valor: R$ %.2f\n", latas, galoes, (latas * preco_lata) + (galoes * preco_galao));   
        
        scanner.close();
    }
}
