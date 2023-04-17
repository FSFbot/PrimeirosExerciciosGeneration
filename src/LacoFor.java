import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, pares = 0, impar = 0, x;
        for (x = 1; x <= 10; x++) {
            System.out.printf("Informe um numero: ");
            n = reader.nextInt();
            if (n % 2 == 0) {
                pares = pares + 1;
            } else {
                impar = impar + 1;
            }

        }
        System.out.printf("A quantidade de pares é de: %d\n", pares);
        System.out.printf("A quantidade de impares sera de: %d", impar);
    }
}

