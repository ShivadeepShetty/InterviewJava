package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    private String[] letters = {"red","white","blue","green","yellow","purple","tan","pink"};
    private List<String> list;

    public BinarySearch () {
        list = new ArrayList<String>(Arrays.asList(letters));
        Collections.sort(list);
        System.out.printf("Sorted arraylist: %s\n", list);
    }

    private void search(){
         printSearchResults(letters[0]);
         printSearchResults(letters[3]);
         printSearchResults(letters[5]);
    }

    private void printSearchResults(String key){
        int result = 0;
        System.out.printf("\n searching for key: %s",key);
        result = Collections.binarySearch(list,key);

        if(result >=0){
            System.out.printf("Found at index: %s\n", result);
        }else {
            System.out.printf("not found: %s\n", result);
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search();
    }
}
