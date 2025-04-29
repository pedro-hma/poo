public class Divisao {
    public static int dividirNumeros(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividirNumeros(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
