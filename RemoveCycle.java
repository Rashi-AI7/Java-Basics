class Node{
  int data;
  Node next;


    Node(int data, Node next){
    this.data=data;
    this.next=null;
  }
}


class RemoveCycle{
public boolean detect(Node head){
            Node slow = head;
            Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
              return true;
              break;
            }
        }
        return false;
}
public void removeCycle(Node head){
            if(detect(Node head) == true){
              slow=head;
            Node prev=null;
            while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            }
      prev.next=null;
}


  

