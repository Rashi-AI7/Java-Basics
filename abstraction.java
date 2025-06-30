abstract class RemoteControl{
    abstract void turnOn();
}

class tvRemote extends RemoteControl{
    void turnOn(){
        System.out.println("Turning TV on");
    }
}

class fan extends RemoteControl{
    void turnOn(){
        System.out.println("Turning fan on");
    }
}

public class abstraction{
    public static void main(String[] args){
        RemoteControl r1 = new tvRemote();   //Creating object of tvremote using remotecontrol reference 
        RemoteControl r2 = new fan();       //Creating object of fan using remotecontrol reference
        r1.turnOn();
        r2.turnOn();
    }
}