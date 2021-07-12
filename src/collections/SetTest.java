package collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SetTest {


    private String[] colors = {"red","red","white","white","blue","green","green","yellow","purple","tan","pink"};


    public SetTest(){
        List<String> list = Arrays.asList(colors);
        System.out.printf("Arraylist: %s",list);
        System.out.println();
        printNonDuplicates(list);
    }

    private void printNonDuplicates(Collection<String> collection){
        SortedSet<String> set = new TreeSet<>(collection);
        for(String s : set){
            System.out.printf(" %s",s);
        }
        System.out.println();

        for(String s : set.headSet("purple")){
            System.out.printf(" %s",s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new SetTest();
    }
}
