import java.util.Scanner;

public class ifmaior {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo aqui vamos realizar algumas verificações aqui");
        // Bloco de sistemas auxiliares
        Scanner reader = new Scanner(System.in);
        // Bloco de Variaveis
        int n1 , n2, n3, soma;
        // Bloco de lógicas
        System.out.printf("Por favor informe um numero aqui: ");
        n1 = reader.nextInt();
        System.out.printf("Por favor informe um outro numero aqui: ");
        n2 = reader.nextInt();
        System.out.printf("Por favor informe um outro numero aqui: ");
        n3 = reader.nextInt();

        soma = n1 + n2;
        if(soma > n3){
            System.out.printf("A soma de de %d + %d  gera %d é maior que %d", n1,n2,soma,n3);
        }else {
            System.out.printf("A soma de de %d + %d resulta em %d que não é maior que %d",n1,n2,soma,n3);
        }
    }
}
