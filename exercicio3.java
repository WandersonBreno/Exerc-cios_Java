import java.util.Scanner; //importando Scanner para leitura

public class exercicio3 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);  
        //Definindo variáveis
        int num1; 
        int num2;
        int soma;

        //Usuário recebe a mensagem de solicitação para digitar um número
        System.out.print("Digite o primeiro número: ");
        //recebendo o número
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        //realizando a soma entre os números digitados.
        soma = num1 + num2;
        //imprimindo resultado da soma.
        System.out.print("A soma entre os números é: "+soma);

          
    }
}

