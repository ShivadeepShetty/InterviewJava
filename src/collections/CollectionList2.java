package collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionList2 {

    private Character[] letters = {'P','C','R'};
    private Character[] lettersCopy;
    private List<Character>  list;
    private List<Character>  copyList;

    public CollectionList2(){
        list = Arrays.asList(letters);
        lettersCopy = new Character[3];
        copyList = Arrays.asList(letters);
        Collections.reverse(list);
        System.out.println("\n After calling reverse");
        output(list);

        Collections.copy(copyList,list);
        System.out.println("After copying");
        output(copyList);

        Collections.fill(list,'R');
        System.out.println("\n After calling fill");
        output(list);
    }

    public void output(List<Character> list){
        System.out.println("The list is: ");

        for(Character ref : list)
        {
            System.out.printf(" %s",ref);
            System.out.println("");

        }

        System.out.printf("max is %s :", Collections.max(list));
        System.out.printf("min  is %s :",Collections.min(list));



    }

    public static void main(String[] args) {
        new CollectionList2();
    }
}
