package ds.Tree;

public class TreeNode {

    TreeNode leftNode;

    int data;

    TreeNode rightNode;


    public TreeNode(int nodeData){
        data = nodeData;
        leftNode = rightNode = null;
    }

    public void insert(int insertValue){
        if(insertValue<data){
            if(leftNode == null){
                leftNode = new TreeNode(insertValue);
            }else {
                leftNode.insert(insertValue);
            }
        }else if(insertValue>data){
            if(rightNode == null){
                rightNode = new TreeNode(insertValue);
            }else {
                rightNode.insert(data);
            }
        }
    }

    public boolean contains(int value){
        if(value == data){
            return true;
        }else if(value<data){
            if(leftNode == null){
                return  false;
            }else {
                return leftNode.contains(value);
            }
        }else {
            if(rightNode == null){
                return  false;
            }else {
                return rightNode.contains(value);
            }
        }
    }

}
