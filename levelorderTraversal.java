import java.util.LinkedList;
import java.util.Queue;

class TrNode{
    int data;
    TrNode left;
    TrNode right;

    TrNode(int data){
        this.data = data;
    }
}
public class levelorderTraversal {
    public static void levelOrder(TrNode root){
        if(root == null)
            return;
        Queue <TrNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TrNode currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        TrNode root = new TrNode(1);
        root.left = new TrNode(2);
        root.right = new TrNode(3);
        root.left.left = new TrNode(4);
        root.left.right = new TrNode(5);

        levelOrder(root);
    }
}
