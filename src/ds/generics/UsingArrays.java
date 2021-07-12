package ds.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArrays {

    private int intArray[] = {8,2,3,9,1};
    private double doubleArray[] = {99.5,55.4,3.3,5.6,111.4};
    private int filledIntArray[],intArrayCopy[];

    public UsingArrays(){
        filledIntArray = new int[10];
        intArrayCopy = new int[intArray.length];
        Arrays.fill(filledIntArray,7);
        Arrays.sort(intArray);

        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);

    }
    public void printArrays(){
        System.out.println("doubleArray: ");
        for(double doubleValue : doubleArray)
            System.out.printf("%.1f",doubleValue);
        System.out.println("\nintArray: ");
        for(int intValue : intArray)
            System.out.printf("%d",intValue);
        System.out.println("\nfilledIntArray: ");
        for(int intValue : filledIntArray)
            System.out.printf("%d",intValue);
        System.out.println("\nIntArrayCopy: ");
        for(int intValue : intArrayCopy)
            System.out.printf("%d",intValue);
        System.out.println("\n");
    }

    public int searchForInt(int value)
    {
        return Arrays.binarySearch(intArray,value);
    }

    public void  printEqually()
    {
        Boolean b = Arrays.equals(intArray,intArrayCopy);
        System.out.printf("equals",b);
    }

    public static void main(String[] args) {
        UsingArrays usingArrays = new UsingArrays();
        usingArrays.printArrays();
        usingArrays.printEqually();
        int location = usingArrays.searchForInt(5);
        System.out.print(location);
    }
}
