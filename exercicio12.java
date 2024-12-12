/*Tendo como dados de entrada a altura de uma pessoa, 
construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58
 */
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float altura;
        double peso_ideal;

        System.out.print("Digite a sua altura: ");
        altura = scanner.nextFloat();
        peso_ideal = (72.7 * altura) - 58;
        System.out.printf("O seu peso ideal é: %.3f%n",peso_ideal);

        scanner.close();
    }
}
