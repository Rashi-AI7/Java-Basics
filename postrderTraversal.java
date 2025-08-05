class NewNode{
    int val;
    NewNode left;
    NewNode right;

    NewNode(int val){
        this.val = val;
    }
}

public class postrderTraversal {
    // Post-order traversal: LEFT → RIGHT → ROOT
    static void postOrder(NewNode root){
        if(root == null)
            return;
        // Visit left subtree
        postOrder(root.left);
        // Visit right subtree
        postOrder(root.right);
        // Process current node
        System.out.println(root.val + "");
    }

    public static void main(String[] args) {
        // Constructing the binary tree
        NewNode root = new NewNode(1);
        root.left = new NewNode(2);
        root.right = new NewNode(3);
        root.left.left = new NewNode(4);
        root.left.right = new NewNode(5);
        postOrder(root);
    }
}
