import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        float number1 = reader.nextFloat();
        System.out.println("Informe o segundo numero: ");
        float number2 = reader.nextFloat();
        System.out.println("Informe o terceiro numero: ");
        float number3 = reader.nextFloat();
        System.out.println("Informe o quarto numero: ");
        float number4 = reader.nextFloat();
        float diff = (number1 * number2) - (number3 * number4);
        System.out.printf("A diferença será de : %.1f",diff);
    }
}
