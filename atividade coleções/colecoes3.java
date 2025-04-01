import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class colecoes3 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(2);
        numeros.add(9);

        ListIterator  <Integer> iterador = numeros.listIterator();
        while (iterador.hasNext()) {
            int valor = iterador.next();
            if(valor > 5){
                iterador.set(99);
            }
        }
        Collections.shuffle(numeros);
        System.out.println("Lista modificada e embaralhada: " + numeros);
    }
}