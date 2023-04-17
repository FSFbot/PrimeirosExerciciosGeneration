import java.util.Scanner;

public class lacoWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int idades , menorQ = 0, maiorQ = 0;
        System.out.printf("Informe uma idade: ");
        int idade = reader.nextInt();
        while (idade >= 0){

            if(idade < 21){
                menorQ = menorQ + 1;
            } else if (idade > 50) {
                maiorQ = maiorQ +1;
            }
            System.out.printf("Infome uma idade: ");
            idade = reader.nextInt();
        }
        System.out.printf("A quantidade de pessoas menores que 20 Anos São de: %d\n",menorQ );
        System.out.printf("A quantidade de pessoas maiores que 50 anos são de: %d", maiorQ);
        reader.close();
    }
}
