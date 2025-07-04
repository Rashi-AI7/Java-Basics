class LL{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //addFirst
    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //printList
    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("Null");
    }
}
public class linkedlist {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
    }
}
