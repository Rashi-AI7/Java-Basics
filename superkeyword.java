class A{
    int a = 7;
    A(){
        System.out.println("Default constructor of A"); 
    }
    void show(){
        System.out.println("Hello World");
    }
}

class B extends A{
    B(){
        super();  //calling constructor of parent class
        System.out.println("Default constructor of B");
    }
    int a = 8;
    void show(){
        super.show(); //calling method of parent class
        System.out.println("Hello Everybody");
        System.out.println(a);
        System.out.println(super.a); //accessing variable of parent class
    }
}

public class superkeyword {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}
