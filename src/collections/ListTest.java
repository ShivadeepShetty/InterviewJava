package collections;

import java.util.*;

public class ListTest {

    private static final String colors[] = {"black", "yellow", "green", "violet", "silver"};
    private static final String colors2[] = {"gold", "white", "brown", "blue"};

    public ListTest() {
        List<String> list1 = new LinkedList<>(Arrays.asList(colors));
        List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
        Vector<String > vector = new Vector<>(Arrays.asList(colors));
        list1.addAll(list2);
        list2 = null;
        convertToUpperString(list1);
        printList(list1);
        removeitems(list1,4,6);
        printList(list1);
    }

    public void printList(List<String> list) {
        System.out.println("\n list:");

        for (String color : list) {
            System.out.printf(" %s", color);
        }
    }

    public void convertToUpperString(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    public void removeitems(List<String> list,int start,int end){
        list.subList(start,end).clear();
    }

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Date datedd = calendar.getTime();
        //dateList.add(calendar.getTime());
        calendar.add(Calendar.YEAR,2);
        dateList.add(calendar.getTime());
        dateList.add(datedd);
        calendar.add(Calendar.MONTH,8);
        dateList.add(calendar.getTime());

        for (Date date : dateList) {
            System.out.printf(" %s", date);
        }
        System.out.println();
        Collections.sort(dateList,new TimeComparator());
        for (Date date : dateList) {
            System.out.printf(" %s", date);
        }
    }

}
