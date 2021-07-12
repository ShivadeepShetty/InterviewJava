package ds.linkedlist;

public class EmptyListException extends Exception {

    public EmptyListException(String name) {
        super(name + "Empty");
    }
}
