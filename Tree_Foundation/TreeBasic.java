import java.util.Scanner;
// Depth First Traversal
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
public class TreeBasic {
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

    static void preorderTree(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorderTree(root.left);
        // Backtrack
        preorderTree(root.right);
    }
    static void postorderTree(TreeNode root){
        if(root==null){
            return;
        }
        
        postorderTree(root.left);
        // Backtrack
        postorderTree(root.right);
        System.out.println(root.data);
    }
    static void inorderTree(TreeNode root){
        if(root==null){
            return;
        }
        
        inorderTree(root.left);
        System.out.println(root.data);
        // Backtrack
        inorderTree(root.right);
    }

    static void formattedTree(TreeNode root, String prefix, boolean isLeft){
        final String left = "|--";
        final String right = "└──";
        final String pipe = "|  ";
        final String space = "   ";

        if(root==null){
            System.out.println(prefix + (isLeft?left:right) + "NULL");
            return;
        }
        System.out.println(prefix + (isLeft?left:right) 
        + root.data);
        formattedTree(root.left, prefix + (isLeft?pipe:space), true);
        // Backtrack
        formattedTree(root.right, prefix + (isLeft?pipe:space), false);

        // System.out.println("|--");
        // char treeCorner = '\u2514';
        // char line = '\u2500';
        // System.out.println(treeCorner + "" + line + line);
    }
    public static void main(String[] args) {
        TreeNode root = createTree();
        preorderTree(root);
        System.out.println();
        postorderTree(root);
        System.out.println();
        inorderTree(root);
        // formattedTree(root, "", true);
    }
}
