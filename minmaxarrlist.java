import java.util.ArrayList;

public class minmaxarrlist {
    public static void main(String[] args){
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(29);
        arr.add(43);
        arr.add(77);
        arr.add(26);
        arr.add(67);
        arr.add(53);

        int min = arr.get(0);
        int max = arr.get(0);
        for(int i=0; i<arr.size()-1; i++){
            int currElement = arr.get(i);
            if(currElement < min){
                min = currElement;
            }if(currElement > max){
                max = currElement;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
