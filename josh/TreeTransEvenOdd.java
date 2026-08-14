package josh;

// 1. ⭐ Tree Odd/Even Transform

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class TreeTransEvenOdd {

    public static void transform(TreeNode root){

        if(root == null){
            return;
        }

        if( root.left != null){
            root.left.data -=1;
        }

        if( root.right != null){
            root.right.data +=1;
        }

        transform(root.left);
        transform(root.right);
    }

    public static void print(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(6);

        transform(root);
        print(root);
    }
}
