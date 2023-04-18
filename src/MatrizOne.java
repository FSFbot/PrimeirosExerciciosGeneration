import java.util.Scanner;

public class MatrizOne {
    public static void main(String[] args) {
        int [][]  matriz = new int[3][3];
        Scanner look = new Scanner(System.in);
        // Leitura dos números e armazenamento na matriz
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("Digite os elementos ["+ i +"][" + j + "]:");
                matriz[i][j] = look.nextInt();
            }
        }
        // ExibiÇão do elementos da diagonal principal
        for(int i = 0; i < 3; i++){
            System.out.printf(matriz[i][i]+" ");
        }
        System.out.printf(" ");
        System.out.printf("\nElementos da diagonal secundaria: ");
        for(int i = 0, j = 2 ; i < 3; i++, j-- ){
            System.out.printf(matriz[i][j]+" ");
        }
        // Soma dos Elementos da diagonal principal
        int somaPrincipal = 0;
        for(int i = 0 ; i < 3; i++){
            somaPrincipal += matriz[i][i];
        }
        System.out.printf("\nA soma dos elementos na principal sera igual a: %d", somaPrincipal);
        // Soma dos elementos da diagonal secundaria
        int somaSecond = 0;
        for(int i = 0, j= 2; i<3 ; i++, j--){
            somaSecond += matriz[i][j];
        }
        System.out.printf("\nSoma dos elementos da diagonal secundaria: %d", somaSecond);
    }
}
