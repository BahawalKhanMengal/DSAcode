package array_questions;
import java.util.Arrays;
public class TwoPointers {
    public static void main(String[] args) {
        int[] array = {0,1,1,0,1,0,1,0,1};
        sort(array);
        System.out.print(Arrays.toString(array));
    }
    static void sort(int[] array){
        int left = 0;
        int right =array.length-1;
        while (left < right){
            if (array[left]==1 && array[right]==0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            if (array[left]==0){
                left++;
            }
            if (array[right]==1){
                right--;
            }

        }
    }
}
