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

    //addinmiddle
    void addinMiddle(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i=idx
        newNode.next = temp.next;
        temp.next = newNode;
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

    //deletefirst

    void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
    }

    //deleteLast

    void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    //Reverse a linkedlist
    public void reversell(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node curr = head;
        Node Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
        System.out.println("Now head is: " +  head.data);
    }


    //printList
    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
public class linkedlist {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        System.out.println("Element found? " + list.search(4) );
        // list.deleteFirst();
        // list.deleteLast();
        // list.reversell();
        list.addinMiddle(2, 5);
        list.printList();
    }
}
