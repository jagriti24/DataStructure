import java.util.ArrayList;
import java.util.HashMap;

/**
 * Program to print product of all numbers in array except the number at that position.
 *
 * Created by jagriti on 28/4/15.
 */
public class ProductProblem {

    private static int arr[]={3,5,2,1,6,7};

    public static int leftProduct(int index){
        if(index==-1){
            return 1;
        }
        if (index ==0){
            return arr[index];
        }

        return  arr[index] * leftProduct(index-1);

    }

    public static int rightProduct(int index){
        if(index==arr.length){
            return 1;
        }
        else if (index ==(arr.length-1)){
            return  arr[index];
        }

         return  arr[index] * rightProduct(index + 1);
    }

    public static void main(String args[]){
        int[] arrNew = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            System.out.print("index "+i+": left product->"+leftProduct(i-1)+" right product->"+rightProduct(i+1));
            arrNew[i] = leftProduct(i-1)*rightProduct(i+1);
            System.out.println("| Product->"+arrNew[i]);
        }

    }

}

