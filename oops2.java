class Student{
    String name;
    int age;
    
    //cons1
    Student(){
        this("Unknown", 0);
        System.out.println("Default constructor called");
}   //cons2
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parametrised Constructor called");
}
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class oops2 {
    public static void main(String[] args){
        Student s1  = new Student();
        Student s2 = new Student("Garv", 12);
        s1.display();
        s2.display();
}    
}
