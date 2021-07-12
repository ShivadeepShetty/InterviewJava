package ds.Queue;

import ds.linkedlist.EmptyListException;
import ds.linkedlist.LinkedLiist;

public class Queue extends LinkedLiist {

    public LinkedLiist list;

    public Queue(){
        list = new LinkedLiist("list");
    }

    public void enqueue(Object item){
        list.insertAtBack(item);
    }

    public void dequeue(Object item){
        try {
            list.removeFromBack();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        list.print();
    }
}
