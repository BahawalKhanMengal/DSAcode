package array_questions;
import java.util.Arrays;

public class findTheNumberOfSameEle {
    public static void main(String[] args) {
        int[] numbers = {5,4,5,6,7,8,9,6,4,3,2,1,0};
        int[] arr = {1,2,3,4,5,6};
//        System.out.println(findTheNumberOfSameEle(numbers,12));
//        System.out.println(findLastOCCER(numbers,12));
//        System.out.println(greaterElement(numbers,5));
//        sorted(numbers);
//        sorted(arr);
        int[] arr2 =fintLargeAndSmall(arr);
        System.out.println(Arrays.toString(arr2));

    }
//    to find the smallest element of an array
    static int findTheNumberOfSameEle(int[] arr,int target){
            int sum = 0;
            for (int i = 0; i < arr.length;i++){
                if (arr[i] == target){
                    sum = sum+1;
                }
            }
            return sum;
    }
//    to find the last occurence of an element in an array
    static int findLastOCCER(int[] arr,int target){
        for (int i = arr.length-1;i>=0;i--){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
//    to find the largest element of an array
    static int greaterElement(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>target){
                count++;
            }
        }
        return count;
    }
//    to find that the array is sorted or not sorted
    static void sorted(int[] arr){
        for (int i = 0; i < arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                System.out.println("the array is not sorted");
                return;
            }
        }
        System.out.println("the array is sorted");
    }
//    find the largest and smallest element of an array
    static int[] fintLargeAndSmall(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
