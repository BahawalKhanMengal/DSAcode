package Bubble_sort;
import java.util.Arrays;

public class bubSort {
    static void sort(int[] array){
        for(int i = 0; i < array.length;i++){
            boolean swap = false;
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if (swap!=true){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 6, 7, 8, 9, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
