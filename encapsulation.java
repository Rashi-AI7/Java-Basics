class Person {
    private String name;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String newName){
        this.name = newName;
    }
    
}

public class encapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Garv");
        System.out.println(myObj.getName());
    }
}
