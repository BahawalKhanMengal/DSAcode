package array_questions;

import java.util.Arrays;

public class NonDecressing {
    public static void main(String[] args) {
        int[] array = {-10,-8,1,2};
        int[] array2 = nonDEC(array);
        System.out.println(Arrays.toString(array2));
    }
    static int[] nonDEC(int[] arr){
        int[] result = new int[arr.length];
        int i = 0;
        for (int index = 0; index < arr.length;index++) {
            result[i++] = arr[index]*arr[index];
        }
        boolean swap = false;
        for (int j = 0; j < result.length; j++) {
            for(int k =0;k<result.length-1;k++){
                if(result[k]>result[k+1]){
                    int temp = result[k];
                    result[k] = result[k+1];
                    result[k+1] = temp;
                    swap = true;
                }
                if(swap!=true){
                    break;
                }
            }
        }
        return result;
    }
}
