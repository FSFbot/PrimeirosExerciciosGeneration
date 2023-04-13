import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nOla mundo eu sou Felipe e vou aprender a usar JAVA\n");
        String nome = "Felipe Freitas";
        int idade = 27;
        double altura = 1.81;
        System.out.println("O aluno: "+nome+" Tem a idade de: "+idade+" e tem a altura de: "+altura);
        float nota1,nota2,nota3,media;
        Scanner leia = new Scanner(System.in); // Aqui aonde vamos fazer entradas aqui no sistema.
        System.out.println("Entre com a primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Entre com a terceira nota: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\nEntão a média do aluno será igual a: %.2f ", media);
        leia.close();
        nota1 = (float) Math.sqrt(nota2);
        nota2 = (float) Math.pow(nota3,3);

    }
}
