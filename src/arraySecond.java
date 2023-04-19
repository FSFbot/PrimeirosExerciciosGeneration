import java.util.ArrayList;
import java.util.Scanner;
public class arraySecond {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);
        numbers.add(55);

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");

        int numberSearch = reader.nextInt();

        int position  = numbers.indexOf(numberSearch);
        if(position != -1){
            System.out.println("O nuemro "+numberSearch+" Foi encontrado");
        }else {
            System.out.println("O numero "+ numberSearch+" Não foi encontrado");
        }
    }
}
