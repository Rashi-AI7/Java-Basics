import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Visual Studio Code");
        System.out.println(sb);
        //get a char from index
        System.out.println(sb.charAt(7));
        //set a char from index
        sb.setCharAt(0, 'B');
        System.out.println(sb);
        //insert a char at some index
        sb.insert(18, 'e');
        System.out.println(sb);
        //delete char at some index
        sb.delete(14, 19);
        System.out.println(sb);
        //Append a char
        sb.append("Editor");
        System.out.println(sb);
        //printLength
        System.out.println(sb.length());

        sc.close();
}
}
