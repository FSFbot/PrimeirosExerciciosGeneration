import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Seja bem vindo ao sistema finaceiro da empresa !");
        System.out.println("Informe seu salario Bruto: ");
        float SalarioBruto = reader.nextFloat();
        System.out.println("Informe seu adicional noturno: ");
        float Noturno = reader.nextFloat();
        System.out.println("Informe as horas extras ");
        float extra = reader.nextFloat();
        System.out.println("Informe os descontos");
        float desconto = reader.nextFloat();
        float SalarioLiquido = SalarioBruto + Noturno + (extra * 5) - desconto;
        System.out.printf("Seu salario liquido sera de: %.2f ", SalarioLiquido);
    }
}
