import java.util.ArrayList;

public class reverserrli {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(54);
        numbers.add(88);
        numbers.add(23);
        numbers.add(90);
        numbers.add(12);
        for(int i=numbers.size()-1; i>=0; i--){
            System.out.println(numbers.get(i));
        }
    }
}
