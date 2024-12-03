import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, media;

        System.out.println("Média das notas bimestrais");
        
        System.out.print("Digite a nota do 1° bimestre: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite a nota do 1° bimestre: ");
        nota2 = entrada.nextFloat();
        System.out.print("Digite a nota do 1° bimestre: ");
        nota3 = entrada.nextFloat();
        System.out.print("Digite a nota do 1° bimestre: ");
        nota4 = entrada.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("O média final é: "+media);

    }
}
