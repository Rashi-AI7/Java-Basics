class Student{
    String name;
    int age;
    public void myMethod(){
        System.out.println("Hello World!");
    }
}

public class oops {
    public static void main(String[] args){
        Student s1 = new Student(); //creating object
        s1.name = "Garv";
        s1.age = 12;
        s1.myMethod();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
