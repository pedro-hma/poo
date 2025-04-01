import java.util.Iterator;
import java.util.LinkedList;;

public class colecoes2 {
    public static void main(String[] args) {
        LinkedList <String> nomes = new LinkedList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Eduarda");

        Iterator <String> iterador = nomes.iterator();

        while (iterador.hasNext()) {
            System.out.println("Nome:"+ iterador.next());
        }
    }   
}