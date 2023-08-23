package array_questions;
import java.util.Arrays;
public class newlac {
    public static void main(String[] args) {
//        int a = 9 , b = 90;
        int[] array = {1,2,3,4,5,6};
//        swap(array,0,array.length-1);
         int[] res =  reverse(array);
        System.out.println(Arrays.toString(res));

    }
//    to reverse an array of numbers
    static int[] reverse(int[] array){
        int j = array.length-1;
        int[] result = new int[array.length];
        for(int i =0; i<array.length;i++){
            result[j] = array[i];
            j--;
        }
        return result;
    }
    //    to swap two values
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }

}
