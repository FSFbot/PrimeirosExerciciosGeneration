import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        System.out.println("Olá seja bem vindo ao seu sistema de notas");
        Scanner reader = new Scanner(System.in);
        // Etapa de coleta das notas
        System.out.println("Coloque a primeira nota aqui: ");
        float nota1 = reader.nextFloat();
        System.out.println("Coloque a segunda nota aqui: ");
        float nota2 = reader.nextFloat();
        System.out.println("Coloque a terceira nota aqui: ");
        float nota3 = reader.nextFloat();
        System.out.println("Coloque a quarta nota aqui: ");
        float nota4 = reader.nextFloat();
        // Etapa de calcular as médias
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Caro aluno sua média foi calculada e é de: %.1f", media);

    }
}
