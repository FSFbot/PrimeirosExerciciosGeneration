import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        System.out.printf("Vamos analisar se os numero são pares e positivos ou não\n ");
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.printf("Insira o numero que sera analisado: ");
        number = reader.nextInt();
        if(number >=0 && number % 2 == 0 ){
            System.out.printf("Este numero é par e positivo");
        }
        else if (number < 0 && number % 2 == 0  ) {
            System.out.printf("Este numero não é positivo mas ainda é um par");
        }
        else if (number > 0 && number % 2 != 0) {
            System.out.printf("Este numero é positivo porem ele é impar");
        }
        else{
            System.out.printf("Este numero é negativo e impar");
        }


    }
}
