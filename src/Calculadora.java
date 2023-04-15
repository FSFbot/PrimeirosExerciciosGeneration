import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float n1, n2;
        int op;
        // Bloco de comunocação
        System.out.println("Digite ==> 1- Somar 2-Subtração 3- Multiplicação 4-Divisão ");
        // Coleta das informações
        System.out.printf("Coloque o primeiro numero: ");
        n1 = reader.nextFloat();
        System.out.printf("Coloque o segundo numero: ");
        n2 = reader.nextFloat();
        System.out.printf("Qual operação deve ser feita? ==> ");
        op = reader.nextInt();
        switch (op){
            case 1:
                float soma = n1 + n2;
                System.out.printf("A soma de %f + %f = %f", n1,n2,soma);
                break;
            case 2:
                float sub = n1 - n2;
                System.out.printf("A substração de %f - %f = %f", n1,n2,sub);
                break;
            case 3:
                float prod = n1 * n2;
                System.out.printf("A multiplicação de %f X %f = %f",n1,n2,prod);
                break;
            case 4:
                float div = n1 / n2;
                if (n2 == 0){
                    break;
                }else{
                    System.out.printf("A divisão de %f / %f = %f", n1,n2,div);
                }
                break;
            default:
                System.out.printf("Não reconheço essa operação");
        }
    }
}
