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

    //addLast
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    //search in linkedlist

    boolean search(int key){
        Node curr = head;
        while(curr.next != null){
            if(curr.data  == key){
            return true;
        }
        curr = curr.next;
    }
    return false;
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
        list.addLast(4);
        // list.search(3);
        System.out.println("Element found? " + list.search(3) );

        list.printList();
    }
}
