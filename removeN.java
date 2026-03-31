class removeN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=1;
        int s = size(head);
        if(n==s){
            head=head.next;
            return head;
        }
        ListNode prev=head;
        while(i<s-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static int size(ListNode head){
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        return sz;
    }
}
