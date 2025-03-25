import java.util.*;
public class TesteListas{
    public static void main(String[] args) {
        List <String> l1 = new ArrayList<String>();
        List <Integer> l2 = new LinkedList<Integer>();
    }
    for (int i = 0; i < 5; i++){
        l1.add ("a"+i);
        l2.add(i, new Integer(i));
        // completar
    }
}