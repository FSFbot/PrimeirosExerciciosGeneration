import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class arrayFourth {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
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

        if(numbers.contains(numberSearch)){
            System.out.println("Numero "+numberSearch+" Encontrado Ebaaa!");
        }else {
            System.out.println("O numero "+numberSearch+"não foi encontrado!");
        }
    }
}
