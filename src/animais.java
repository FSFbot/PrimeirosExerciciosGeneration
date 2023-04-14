import java.util.Scanner;

public class animais {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String classe, especie, food;
        System.out.printf("Informe a Classe: ");
        classe = reader.next();
        System.out.printf("Informe a Especie: ");
        especie = reader.next();
        System.out.printf("Informe a Comida: ");
        food = reader.next();
        // Bloco de lógica
        if(classe.equals("vertebrado") && especie.equals("ave") && food.equals("carnivoro") ){
            System.out.printf("Isto aí é uma Aguia");
        }
        else if (classe.equals("vertebrado") && especie.equals("ave") && food.equals("onivaro")) {
            System.out.printf("Isto aí é uma Pomba");
        }
        else if (classe.equals("vertebrado") && especie.equals("mamifero" ) && food.equals("onivaro")) {
            System.out.printf("Esse ai é o tal do bicho Homem");
        }
        else if(classe.equals("vertebrado") && especie.equals("mamifero") && food.equals("herbivoro")){
            System.out.printf("Isso é uma Vaca");
        }
        else if (classe.equals("invertebrado") && especie.equals("inseto") && food.equals("hematofago")) {
            System.out.printf("Isso ai é um Pulga");
        }
        else if (classe.equals("invertebrado") && especie.equals("inseto") && food.equals("herbivoro")) {
            System.out.printf("Isso ai e uma Lagarta");
        }
        else if (classe.equals("invertebrado") && especie.equals("anelideo") && food.equals("hematofago")) {
            System.out.printf("É uma sanguessuga");
        }
        else {
            System.out.printf("É uma minhoca");
        }


    }
}
