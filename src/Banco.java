import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("As operações disponiveis são:\n1-Saldo\n2-Saque\n3-Deposito\n");
        float saldo =1000,saque,deposito;
        int op;
        System.out.printf("Qual das operação deseja fazer ==>" );
        op = reader.nextInt();
        switch (op){
            case 1:
                System.out.printf("O seu saldo atual é de %.2f ",saldo);
                break;
            case 2:
                System.out.printf("Quanto deseja sacar ?");
                float num = reader.nextFloat();
                saque = saldo - num;
                if(num > saldo){
                    System.out.printf("SALDO INSUFICIENTE !");
                }else{
                    System.out.printf("Voce sacou %.2f e seu saldo atual é: %.2f",num,saque);
                }
                break;
            case 3:
                System.out.printf("Qual valor deseja depositar: ");
                float num2 = reader.nextFloat();
                deposito = saldo + num2;
                System.out.printf("Seu saldo atual é de : %.2f",deposito);
                break;
            default:
                System.out.printf("Não reconheço essa operação!!");
        }
    }


}
