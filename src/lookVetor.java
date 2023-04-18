import java.util.Scanner;

public class lookVetor {
    public static void main(String[] args) {
        int [] vetor = {2,5,1,3,4,9,7,8,10,6};
        Scanner look = new Scanner(System.in);
        System.out.printf("Digite um numero aqui : ");
        int num = look.nextInt();
        int fix = -1; // Aqui ajuda a inicializar a posição de um vetor invalido
        for(int i =0; i<vetor.length; i++){
            if(vetor[i] == num){
                fix = i;
                break;
            }
        }
        if(fix != -1){
            System.out.println("O numero"+num+" Foi encontrado na posição "+fix+" do vetor");
        }else {
            System.out.println("Não foi encontrado nada");
        }

    }
}
