package ds.linkedlist;


public class LinkedLiist {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    public LinkedLiist() {
         this("name");
    }

    public LinkedLiist(String name) {
        this.name = name;
        firstNode = lastNode = null;
    }

    public void insertAtFirst(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }

    public void insertAtBack(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            lastNode = lastNode.nextNode = new ListNode(insertItem);
        }
    }

    public Object removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        Object removedItem = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem;
    }

    public Object removeFromBack() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        Object removedItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;

            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }
            lastNode = current;
            current.nextNode = null;
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s", name);
            return;
        }

        ListNode current = firstNode;

        while (current != null) {
            System.out.printf("%s", current.data);
            current = current.nextNode;
        }
    }
}
