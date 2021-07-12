package collections;

import java.util.*;


public class Sort {

    private static  final String suits[] = {"Hearts","Diamonds","Clubs","Spades"};

    public void printElements()
    {
        List<String> elements = Arrays.asList(suits);

        System.out.printf("Unsorted array elements: %s",elements);
        Collections.sort(elements,Collections.reverseOrder());

        System.out.printf("Sorted array elements:\n %s",elements);
    }

    public static void main(String[] args) {
        Sort sort1  = new Sort();
        sort1.printElements();
    }
}
