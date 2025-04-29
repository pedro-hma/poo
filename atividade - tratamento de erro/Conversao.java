import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.print("Digite um número inteiro: ");
            numero = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido! Assumindo 0 como padrão.");
        }

        System.out.println("Número: " + numero);
    }
}
