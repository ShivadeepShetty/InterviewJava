package ds.linkedlist;

public class LinkedTest {

    public static void main(String[] args) {

        LinkedLiist list = new LinkedLiist();
        list.insertAtFirst("-1");
        list.print();
        System.out.println();

        list.insertAtFirst(0);
        list.print();
        System.out.println();

        list.insertAtBack(1);
        list.print();
        System.out.println();

        list.insertAtBack(5);
        list.print();

        System.out.println();


        try {
            Object removed = list.removeFromFront();
            System.out.println();
            System.out.printf("%s removed\n",removed);
            list.print();
            removed = list.removeFromBack();
            System.out.println();
            System.out.printf("%s removed\n",removed);
            list.print();

        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }
}
