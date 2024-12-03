import java.util.Scanner;
public class exercicio7 {

    public static void main(String[] args){
        @SuppressWarnings({ "resource" })
        Scanner scan = new Scanner(System.in);
        float area, calcular_area,dobro_area;

        System.out.print("Informe a base ou altura da área m²: ");
        area = scan.nextFloat();
        calcular_area = area * area;
        dobro_area = calcular_area * 2;
        System.out.println("A área do quadrado é: "+calcular_area+" m²");
        System.out.println("O dobro da área do quadrado é: "+dobro_area+" m²");
        

    }
}