package array_questions;
import java.util.Arrays;
public class twoPointerEVENandODD {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = evenOdd(array);
        System.out.println(Arrays.toString(array2));
    }
    static int[] evenOdd(int[] arr){
        int[] result = new int[arr.length];
        int j = arr.length - 1;
        int i = 0;
        for (int index = 0; index < arr.length;index++) {
            if(arr[index]%2 == 0){
                result[i++] = arr[index];
            }else {
                result[j--] = arr[index];
            }
        }
        return result;
    }
}
