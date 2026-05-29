class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next=null;
    }
}

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


    // Helper to print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addLL solver = new addLL();
        ListNode result = solver.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
