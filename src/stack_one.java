import java.util.Scanner;
import java.util.Stack;
public class stack_one {
    public static void main(String[] args) {
        Stack<String> stackBook = new Stack<>(); // Criação da pilha de livros
        Scanner reader = new Scanner(System.in);
        int op;
        do{
            System.out.print("""
                    Menu:
                    1 - Adicione um novo livro para a pilha
                    2 - Listar todos os livros da pilha
                    3 - Retirar um livro da pilha
                    0 - Feche o programa
                    
                    Digite a opção desejada => """);

            op = reader.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite um nome um livro: \n");
                    reader.nextLine();
                    String nomeLivro = reader.nextLine();
                    stackBook.push(nomeLivro);
                    System.out.printf("Livro " + nomeLivro + " foi adicionado a pilha\n");
                    break;

                case 2:
                    System.out.print("Livro na pilha: ");
                    for (String book : stackBook) {
                        System.out.printf("==> " + book+"\n");
                    }
                    break;

                case 3 :
                    if (stackBook.isEmpty()) {
                        System.out.print("A pilha esta vazia.\n");
                    } else {
                        String leaveBook = stackBook.pop();
                        System.out.printf("Livro " + leaveBook + " foi retidado da pilha\n");
                    }
                    break;

                case 0 :
                    System.out.print("O programa foi finalizado\n");
                    break;
                default :
                        System.out.print("Esta opção é invalida não reconheço este comando por favor digite um novo numero");
                        break;
            }
            System.out.print("");
        }while (op != 0);
    }
}
