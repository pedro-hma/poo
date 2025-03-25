import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtvColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      

        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }
        Collections.sort(nomes);
        System.out.println("\nNomes ordenados em ordem alfabética:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
