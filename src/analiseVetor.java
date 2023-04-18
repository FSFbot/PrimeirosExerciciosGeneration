import java.util.Scanner;

public class analiseVetor {
    public static void main(String[] args) {
        Scanner look = new Scanner(System.in);
        int[] num = new int[10]; // Criação do vetor de 10 posições
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Digite o " + (i + 1) + " Numero:");
            num[i] = look.nextInt();

        }
        // Exibição dos elementos dos indices ímpares
        for(int i = 0; i < num.length; i +=2){
            System.out.printf(num[i]+" ");
        }
        System.out.printf(" ");
        // Exibição dos numeros pares
        for(int i = 0; i < num.length; i ++){
            if(num[i] % 2==0){
                System.out.printf( num[i]+" ");
            }

        }
        System.out.printf(" ");
        int soma = 0;
        for(int i = 0; i < num.length; i ++){
            soma+= num[i];
        }
        System.out.printf("\nA soma dos elementos sera de: %d\n", soma);
        double media = (double) soma / num.length;
        System.out.printf("A media sera de %.2f", media);
    }
}
