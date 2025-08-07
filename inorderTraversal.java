class TraNode{
    int val;
    TraNode left;
    TraNode right;

    TraNode(int val){
        this.val = val;
    }
}

public class inorderTraversal {
    static void inorder(TraNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val + "");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TraNode root = new TraNode(1);
        root.left = new TraNode(2);
        root.right = new TraNode(3);
        root.left.left = new TraNode(4);
        root.left.right = new TraNode(5);

        inorder(root);
    }
}
