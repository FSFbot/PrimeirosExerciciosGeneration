import java.util.Scanner;

public class tresMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, soma = 0, count = 0;
        double media;

        do{
            System.out.printf("Digite um número inteiro (ou zero para sair): ");
            num = ler.nextInt();
            if(num % 3 == 0 && num != 0){
                soma += num;
                count ++;
            }
        if (count > 0) {
            media = (double)  soma / count;
            System.out.printf("A media dos multiplos de 3 digitos é: %.2f\n", media);
        }else {
            System.out.printf("Não foi digitado nenhum numero de 3. ");
        }
        }while (num != 0);
    }
}
