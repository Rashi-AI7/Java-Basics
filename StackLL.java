public class StackLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stackl{
        public static Node head = null;
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static boolean isEmpty(){
            return head == null;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        } 
}
        
    
    public static void main(String[] args) {
        
        Stackl.push(30);
        Stackl.push(20);
        Stackl.push(10);
        Stackl.push(40);

        while(!Stackl.isEmpty()){
            System.out.println(Stackl.peek());
            Stackl.pop();
        }
    }
}
