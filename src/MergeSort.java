import java.util.Random;

import static com.sun.org.apache.bcel.internal.generic.InstructionConstants.POP;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class MergeSort {


    private int[] data;
    private static Random generator = new Random();


    public MergeSort(int size){
        data = new int[size];

        for(int i=0;i<data.length;i++){
            data[i] = 10 + generator.nextInt(90);
        }
    }

    public void sort(){
        sortArray(0,data.length-1);
    }

    public void  sortArray(int low,int high){

        if((high-low)>=1){
            int middle1 = (low+high)/2;
            int middle2 = middle1 + 1;

            System.out.println("split:    "+subArray(low,high));
            System.out.println("          "+subArray(low,middle1));
            System.out.println("          "+subArray(middle2,high));
            System.out.println();

            sortArray(low,middle1);
            sortArray(middle2,high);

            merge(low,middle1,middle2,high);

        }
    }

    public String subArray(int low,int high){
        StringBuffer temporary = new StringBuffer();

        for(int i=0; i<low; i++){
            temporary.append(" ");
        }

        for(int i = low ; i<=high ; i++){
            temporary.append(" "+ data[i]);
        }

        return  temporary.toString();
    }


    private void  merge(int left,int middle1,int middle2, int right){
        int leftIndex =  left;
        int rightIndex = middle2;
        int combinedIndex = left;
        int[] combined = new int[data.length];

        System.out.println("merge " + subArray(left,middle1));
        System.out.println("          " + subArray(middle2,right));

        while (leftIndex <=middle1 && rightIndex <=right){
            if(data[leftIndex] <= data[rightIndex]) {
                combined[combinedIndex++] = data[leftIndex++];
            }else {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }

        if(leftIndex == middle2){
            while (rightIndex<=right)
                combined[combinedIndex++] =  data[rightIndex++];
        }else {
            while (leftIndex<= middle1){
                combined[combinedIndex++] = data[leftIndex++];
            }
        }

        for(int i= left ; i<=right; i++){
            data[i] =combined[i];
        }
        System.out.println("          "+ subArray(left,right));
        System.out.println();
    }

    @Override
    public String toString() {
        return subArray(0,data.length-1);
    }
}
