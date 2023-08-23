package selection_sort;

import java.util.Arrays;

public class s_sort {
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[] arr, int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int frist, int second){
        int temp = arr[frist];
        arr[frist] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//5450121847965
