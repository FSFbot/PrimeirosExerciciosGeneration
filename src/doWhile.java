import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num, sum = 0;
        do{
            System.out.printf("Infome um numero caso escolha zero o programa irar parar: ");
            num = reader.nextInt();
            if(num > 0){
                sum += num;
            }
        }while(num != 0);
        System.out.printf("A Soma dos numero deu um total de %d", sum);
    }
}
