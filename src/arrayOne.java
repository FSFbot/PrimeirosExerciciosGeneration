import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayOne {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite Cinco Cores Querido usuario");
        for(int i = 0; i < 5; i++){
            String color = reader.nextLine();
            colors.add(color);
        }
        System.out.println("\tCores que foram adicionadas ");
        for(String color : colors){
            System.out.println(color);
        }
        Collections.sort(colors);
        System.out.println("\tCores em ordem crescente: ");
        for(String color: colors){
            System.out.println(color);
        }
    }
}
