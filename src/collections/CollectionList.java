package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

    private static String[] colors={"red","blue","green","yellow","magenta","pink"};
    private static String[] removeColors={"red","blue","green"};

    public CollectionList(){
        List<String> list = new ArrayList<>();
        List<String> removeList = new ArrayList<>();

        for(String color: colors){
            list.add(color);
        }

        for (String color : removeColors){
            removeList.add(color);
        }

        System.out.println("Arraylist: ");

        for(int count = 0; count<list.size();count++){
            System.out.printf(" %s",list.get(count));
        }
        System.out.println(" ");

        System.out.println("removed colors: ");
        removeColors(list,removeList);
        for(int count = 0; count<list.size();count++){
            System.out.printf(" %s",list.get(count));
        }
    }

    private void removeColors(List<String> list,List<String> removeList){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(removeList.contains(iterator.next())){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        new CollectionList();
    }
}
