
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new HashSet<>(Arrays.asList(5,6,7,8,9,10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new HashSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new LinkedHashSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}