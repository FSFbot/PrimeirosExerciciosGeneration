import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_one {
    public static void main(String[] args) {
        Queue <String> Clientes = new LinkedList<>(); // Criação das filas de clientes
        Scanner reader = new Scanner(System.in);
        int op;
        do{
            System.out.println("""
                    Menu
                    1 - Adicionar um novo cliente na fila
                    2 - Listar os clintes na fila
                    3 - Chamar uma pessoa na fila
                    0 - Fechar o programa
                    """);
            op = reader.nextInt();
            reader.nextLine(); // Consumindo a quebra de linha deixada pelo next int

            switch (op){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = reader.nextLine();
                    Clientes.add(nomeCliente);
                    System.out.println("Cliente "+nomeCliente+" Adicionado á  fila\n");
                    break;
                case  2:
                    System.out.println("Clientes na fila: ");
                    for(String cliente : Clientes){
                        System.out.println("==> "+cliente);
                    }
                    break;
                case 3:
                    if(Clientes.isEmpty()){
                        System.out.printf("A fila esta vazia\n");
                    }else {
                        String nextCliente = Clientes.remove();
                        System.out.printf("Clinte "+nextCliente+" Retirado da fila\n");
                    }
                    break;
                case 0:
                    System.out.printf("Programa finalizado");
                    break;
                default:
                    System.out.printf("Opção invalida. Digite novamente por favor.");
            }
        }while (op != 0);


    }
}
