import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

     /* MergeSort mergeSort = new MergeSort(10);
      System.out.println("Unsorted:"+mergeSort+"\n");
      mergeSort.sort();
      System.out.println("Unsorted:"+mergeSort+"\n");*/

     /*InsertionSort sortArray = new InsertionSort(10);

     System.out.println("Unsorted Array");
     System.out.println(sortArray);

     sortArray.sort();

     System.out.println("sorted array");
     System.out.println(sortArray);*/

        /*SelectionSort sortArray = new SelectionSort(10);

        System.out.println("Unsorted Array");
        System.out.println(sortArray);

        sortArray.sort();

        System.out.println("sorted array");
        System.out.println(sortArray);*/

        //BINARY SEARCH

        Scanner input = new Scanner(System.in);

        int searchInt;
        int position;

        BinaryArray searchArray = new BinaryArray(10);
        System.out.println(searchArray);

        System.out.print("Please enter an integer value (-1 to quit)");
        searchInt = input.nextInt();
        System.out.println();

        while (searchInt!=-1)
        {
            position = searchArray.binarySearch(searchInt);
            if(position == -1){
                System.out.println("The Integer " + searchInt +"was not found");
            }else {
                System.out.println("The Integer " + searchInt + " was found in position "+position+"\n");

            }

            System.out.println("please enter an integer value (-1 to quit):");
            searchInt = input.nextInt();
            System.out.println();
        }
    }







}
