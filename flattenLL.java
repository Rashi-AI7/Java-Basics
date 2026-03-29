class flattenLL {
    public Node flatten(Node head) {
        if(head==null)
            return head;
        Node curr = head;
        while(curr!=null){
            if(curr.child != null){ //child flattening
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                while(curr.next != null){ //reconnecting after flattening
                    curr=curr.next;
                }
                    if(next!=null){
                        curr.next=next;
                        next.prev=curr;
                    }
                
            }
            curr=curr.next;
        }
        return head;
    }
}
