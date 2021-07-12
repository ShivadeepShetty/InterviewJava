package ds.Tree;

public class Tree {

    private TreeNode root;

    public Tree(){
        root = null;
    }

    public  void  insertNode(int value){
        if(root == null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }
    }

    public void  preOrderTraversal(){
        preOrderHelper(root);
    }
    public void  postOrderTraversal(){
        postOrderHelper(root);
    }
    public void  inOrderTraversal(){
        inOrderHelper(root);
    }
    public void preOrderHelper(TreeNode node){
        if(node == null){
            return;
        }

        System.out.printf("   %d",node.data);
        preOrderHelper(node.leftNode);
        preOrderHelper(node.rightNode);
    }

    public void postOrderHelper(TreeNode node){
        if(node == null){
            return;
        }

        postOrderHelper(node.leftNode);
        postOrderHelper(node.rightNode);
        System.out.printf("   %d",node.data);

    }


    public void inOrderHelper(TreeNode node){
        if(node == null){
            return;
        }


        preOrderHelper(node.leftNode);
        System.out.printf("  %d",node.data);
        preOrderHelper(node.rightNode);
    }
}
