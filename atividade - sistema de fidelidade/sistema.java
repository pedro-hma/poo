import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cliente {
    private String nome;
    private String email;
    private int  pontos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontos = 0;
    }
    public void realizarCompra(double valor){
        this.pontos += valor * 10;
    }
    public int  getPontos(){
        return pontos;
    }
    public String getNome(){
        return nome;
    }
    public void descontarPontos(int pontos){
        this.pontos-= pontos;
    }
}
class Recompensa{
    private String descricao;
    private int custoEmPontos;

    public Recompensa(String descricao, int custoEmPontos) {
        this.descricao = descricao;
        this.custoEmPontos = custoEmPontos;
    }

    public int getCustoEmPontos() {
        return custoEmPontos;
    }

    public String getDescricao() {
        return descricao;
    }
}
class SistemaFidelidade {
    public static boolean resgatarRecompensa(Cliente cliente, Recompensa recompensa) {
        if (cliente.getPontos() >= recompensa.getCustoEmPontos()) {
            cliente.descontarPontos(recompensa.getCustoEmPontos());
            System.out.println(cliente.getNome() + " resgatou: " + recompensa.getDescricao());
            return true;
        } else {
            System.out.println(cliente.getNome() + " não tem pontos suficientes.");
            return false;
        }
    }
}
class RankingFidelidade {
    public static void mostrarRanking(List<Cliente> clientes) {
        Collections.sort(clientes, Comparator.comparingInt(Cliente::getPontos).reversed());

        System.out.println("\n=== Ranking de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getPontos() + " pontos");
        }
    }
}
public class TesteFidelidade {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        Cliente cliente3 = new Cliente("Carlos", "carlos@email.com");

        cliente1.realizarCompra(100.0);
        cliente2.realizarCompra(50.0);
        cliente3.realizarCompra(200.0);  

        Recompensa recompensa1 = new Recompensa("Caneca Personalizada", 800);
        Recompensa recompensa2 = new Recompensa("Desconto de R$50", 1200);

        SistemaFidelidade.resgatarRecompensa(cliente1, recompensa1);
        SistemaFidelidade.resgatarRecompensa(cliente2, recompensa2); 

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        RankingFidelidade.mostrarRanking(clientes);
    }
}