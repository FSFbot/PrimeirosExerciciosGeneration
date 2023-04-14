import java.util.Scanner;

public class hamburger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Seja bem vindo a nossa Lanchonete !!\n");
        System.out.printf("Aqui vai nosso cardapio\n");
        System.out.printf("1 - Hamburger por R$ 10,00\n2- X-Salada por R$ 15,00\n3- X-Bacon por R$ 18,00\n4-Bauro por " +
                "R$ 12,00\n5- Refrigerante por R$ 8,00\n6- Suco de Laranja por R$ 13,00\n");

        System.out.printf("Qual opcão deseja ?\n");
        int pedido, qtd;
        pedido = reader.nextInt();
        System.out.printf("E qual a Quantidade que deseja?\n");
        qtd = reader.nextInt();
        switch (pedido){
            case 1:
                System.out.printf("Voce escolheu %d Hamburguer e isso vai dar %d", qtd, qtd*10);
                break;
            case 2:
                System.out.printf("Voce escolheu %d X-Salada e isso vai custar %d", qtd, qtd*15 );
                break;
            case 3:
                System.out.printf("Voce escolheu %d X-Bacon e isso vai custar %d", qtd, qtd*18 );
                break;
            case 4:
                System.out.printf("Voce escolheu %d X-Bacon e isso vai custar %d", qtd, qtd*12 );
                break;
            case 5:
                System.out.printf("Voce escolheu %d X-Bacon e isso vai custar %d", qtd, qtd*8 );
                break;
            case 6:
                System.out.printf("Voce escolheu %d X-Bacon e isso vai custar %d", qtd, qtd*13 );
                break;
            default:
                System.out.printf("Não podemos atender o seu pedido pois ele não esta no nosso sistemas :(");
        }
    }
}
