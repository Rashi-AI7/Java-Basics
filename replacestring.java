import java.util.Scanner;

public class replacestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        //to replace 'e' with 'i'

        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        String result = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e'){ //if the char is e, add i to the result
                result += 'i';
            }else{
                result += str.charAt(i); //otherwise keep the original characters
            }
        }
        System.out.println(result);

        //toExtract userName from emailID

        System.out.println("Enter you Email ID: ");
        String email = sc.nextLine();
        String userName = "";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){         //username ends here if '@' is found
                break;                         
            }else{
                userName+=email.charAt(i);
            }
        }
        System.out.println("Your username is: " + userName);  //for e.g email: vscode123@gmail.com
        sc.close();                                                //password: vscode123
    }
}
