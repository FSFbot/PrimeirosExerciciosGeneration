import java.util.Scanner;
public class tets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        for (;;) { // loop infinito
            System.out.print("Digite o primeiro número: ");
            num1 = input.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = input.nextInt();

            if (num1 < num2) {
                break; // sair do loop
            } else {
                System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
            }
        }

        System.out.println("Números múltiplos de 3 e 5 no intervalo de " + num1 + " a " + num2 + ":");

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("O numero %d é multiplo de 3 e 5 !");
            }
        }
    }

}
