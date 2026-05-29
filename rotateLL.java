class rotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        int sz=1;
        ListNode tail=head;
       if(head==null || head.next==null)
            return head;
        if(k==0)
            return head;
        while(tail.next!=null){
            sz++;
            tail=tail.next;
        }
        tail.next=head;
        k=k%sz;
        int m=sz-k;
        ListNode temp=head;
        for(int i=0; i<m-1; i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
