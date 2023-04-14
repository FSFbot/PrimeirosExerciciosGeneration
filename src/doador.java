import java.util.Scanner;

public class doador {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int idade;
        String nome;
        boolean doador;
        System.out.printf("Informe O nome: ");
        nome = reader.next();
        System.out.printf("Informe a sua idade : ");
        idade = reader.nextInt();
        System.out.printf("primeira doacao de sangue? \n");
        doador = reader.nextBoolean();
        if( idade >= 18 && idade <= 69){
            if( idade >= 60 && doador == true){
                System.out.printf("%s não esta apto a doa sangue",nome);
            }
            else{
                System.out.printf("%s esta apto a doar Sangue", nome);
            }
        }
        else{
            System.out.printf("%s Não esta apto a doar sangue", nome);
        }

    }
}
