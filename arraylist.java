import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
    //create and display
    ArrayList <Integer> arr = new ArrayList<>(5);
    arr.add(2);
    arr.add(4);
    arr.add(6);
    arr.add(8);
    arr.add(10);
    
    //update 
    ArrayList <String> clr = new ArrayList<>();
    clr.add("Red");
    clr.add("Pink");
    clr.add("Blue");
    clr.add("Green");
    clr.set(2, "Orange");
    
    //remove
    clr.remove("Red");
    System.out.println("Evn numbers: " + arr);
    System.out.println("Colours: " + clr);
    }
}
