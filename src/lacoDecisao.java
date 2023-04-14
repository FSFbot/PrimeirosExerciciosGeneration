import java.util.Scanner;

public class lacoDecisao {
    public static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nEntre com a primeira nota");
        n1 = ler.nextFloat();
        System.out.println("\nEntre com a Segunda nota");
         n2 = ler.nextFloat();
        System.out.println("\nEntre com a terceira nota");
         n3 = ler.nextFloat();

         media = (n1 + n2 + n3) / 3;
        System.out.printf("\nA média sera de: %.2f",media);
        if(media >= 7 && media <= 10){
            System.out.println("\nParabens você foi aprovado nesta materia");
        } else if (media < 7 && media >= 5) {
            System.out.println("\nLamento mas voce esta recuperação, mas não desanima");
        }else {
            System.out.println("\nVoce nao foi aprovado logo tera que se esforca mais na proxima :)");
        }
    }
}
