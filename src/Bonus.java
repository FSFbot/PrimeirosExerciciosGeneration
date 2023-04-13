import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        System.out.println("Olá informe seu salário aqui ==> ");
        Scanner reader = new Scanner(System.in);
        float salario = reader.nextFloat();
        System.out.println("Informe quanto de abone será aplicado: ");
        float abono = reader.nextFloat();
        float NovoSalario = salario + abono;
        System.out.printf("Logo seu salario junto com abono será de: %.2f", NovoSalario);

    }
}
