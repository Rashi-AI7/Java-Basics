class addLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;
        int total = 0, carry=0;
        while(l1 != null || l2 !=null || carry !=0){
            total=carry;
            if(l1 != null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                total+=l2.val;
                l2=l2.next;
            }
            carry = total/10;
            int sum=total%10;
            dummy.next = new ListNode(sum);
            dummy=dummy.next;
        } 
            return result.next;  
        }
}
