import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(9);
        set.add(5);
        set.add(8);
        set.add(3);
        set.add(7);
        set.add(5);
        // System.out.println(set);
        System.out.println(set.size());
        set.remove(3);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
    
}