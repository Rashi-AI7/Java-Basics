import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String firstName = t.nextLine();
        String secondName = t.nextLine();

        //concatenation
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
        //to get length
        System.out.println(fullName.length());
        //Access character
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i) + " " );
        }
        //compare 2 strings
        String name1 = t.nextLine();
        String name2 = t.nextLine();
        if(name1.equals(name2)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        //substring
        String name = "IronMan";
        System.out.println(name.substring(0,3));

        //parseInt method of integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //toString method of string class
        int num = 123;
        String st = Integer.toString(num);
        System.out.println(st.length());
        
        t.close();

    }
}
