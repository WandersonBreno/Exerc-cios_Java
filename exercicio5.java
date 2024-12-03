import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        float metros, centimetros;

        System.out.println("Programa que converte metros em centímetros");
        System.out.print("Digite a quantidade de metros: ");
        metros = entrada.nextFloat();
        centimetros = metros * 100;
        System.out.print(+metros+" metros convertidos para centímetros é: "+centimetros+ "cm");

    }
}
