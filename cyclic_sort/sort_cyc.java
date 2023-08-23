package cyclic_sort;

import java.util.Arrays;

public class sort_cyc {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
