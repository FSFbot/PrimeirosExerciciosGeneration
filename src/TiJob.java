import java.util.Scanner;

public class TiJob {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Bloco das Variaveis
        String nome;
        int cod;
        float salario;
        // Bloco de entradas
        System.out.println("1-Gerente\n2-Vendedor\n3-Supervisor\n4-Motorista\n5-Estoquista\n6-Tecnico de TI");
        System.out.printf("Infome o nome do funcionario: ");
        nome = reader.next();
        System.out.printf("Informe o código do cargo do funcionario: ");
        cod = reader.nextInt();
        System.out.printf("Infome o salario do funcionario: ");
        salario = reader.nextFloat();

        switch (cod){
            case 1:
                System.out.printf("\nNome do colaborador: %s\nCargo:Gerente\nsalario:%.2f",nome,salario+(salario*0.1));
                break;
            case 2:
                System.out.printf("\nNome do colaborador: %s\nCargo:Vendedor\nsalario:%.2f",nome,salario+(salario*0.07));
                break;
            case 3:
                System.out.printf("\nNome do colaborador: %s\nCargo:Supervisor\nsalario:%.2f",nome,salario+(salario*0.09));
                break;
            case 4:
                System.out.printf("\nNome do colaborador: %s\nCargo:Motorista\nsalario:%.2f",nome,salario+(salario*0.06));
                break;
            case 5:
                System.out.printf("\nNome do colaborador: %s\nCargo:Estoquista\nsalario:%.2f",nome,salario+(salario*0.05));
                break;
            case 6:
                System.out.printf("\nNome do colaborador: %s\nCargo:Tecnico em TI\nsalario:%.2f",nome,salario*(salario*0.08));
                break;
            default:
                System.out.println("Não");
        }
    }
}
