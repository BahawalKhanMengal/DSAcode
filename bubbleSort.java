import java.util.Arrays;
public class bubbleSort {
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
