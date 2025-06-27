class Student{
    String name;
    int age;

    //classMethod
    public void myMethod(){
        System.out.println("Hello World!");
    }

    //constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class oops {
    public static void main(String[] args){
        Student s1 = new Student("Garv", 12); //creating object
        s1.myMethod();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
