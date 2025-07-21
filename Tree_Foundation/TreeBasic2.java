import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// Breadth First Traversal
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
public class TreeBasic2 {
    static Scanner scanner = new Scanner(System.in);

    static TreeNode createTree(){
        System.out.println("Enter the Data of a Node or Press -1 for Null");
        int data = scanner.nextInt();
        // i don't want to create a node
        if(data==-1){
            return null;
        }
        // i want to create a node
        TreeNode node = new TreeNode(data);
        System.out.println("Enter the data of Left Child for " + data);
        // build left
        node.left = createTree();
        // Backtrack time, it will call right
        // build right
        System.out.println("Enter the data of right child for " + data);
        node.right = createTree();
        return node;
    }
    static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            System.out.println(currentNode.data);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        levelOrder(root);
    }
}
