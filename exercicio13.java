/*Tendo como dado de entrada a altura (h) de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
a)Para homens: (72.7*h) - 58
b)Para mulheres: (62.1*h) - 44.7 */
 import java.util.Scanner;

 public class exercicio13 {
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bem-vindo ao programa de cálculo de peso ideal");

        System.out.print("Informa a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Informe o seu sexo, (M) para masculino ou (F) para feminino: ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        double pesoIdeal;
        if (sexo == 'M'){
            pesoIdeal = (72.7 * altura) - 58 ;
        }
        else if (sexo == 'F'){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else{
            System.out.print("Dados incorretos, tente novamente.");
            scanner.close();
            return;
        }
        System.out.printf("Seu peso ideal é: %.3f kg\n ", pesoIdeal);
        scanner.close();

    }
 }