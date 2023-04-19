import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class arraythird {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros não repetidos: ");
        for(int i = 0; i < 10; i++){
            int num = reader.nextInt();
            while (numbers.contains(num)){
                System.out.println("Numero repetido! Digite outro número: ");
                num = reader.nextInt();
            }
            numbers.add(num);
        }
        System.out.println("Elementos da Collection Set: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
