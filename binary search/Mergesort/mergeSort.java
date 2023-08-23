package Mergesort;
import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr) {
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length){
            if (left[i]<right[j]){
                result[k]=left[i];
                i++;
            }else {
                result[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
}
