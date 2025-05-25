import java.util.*;

public class secondclass {
    public static void main(String[] args){
        System.out.println("*\n**\n***\n****");
        input.inp_out();
        
    }
}

class input{
    static void inp_out(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}

