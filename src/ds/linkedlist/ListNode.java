package ds.linkedlist;

public class ListNode {

    Object data;
    ListNode nextNode;

    ListNode(Object object) {
        this(object, null);
    }

    ListNode(Object object, ListNode node) {
        this.data = object;
        nextNode = node;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

}
