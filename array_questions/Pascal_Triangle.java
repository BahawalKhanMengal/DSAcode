package array_questions;

import java.util.Arrays;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 15;
        int[][] array =pascal(n);
        printArray(array);
    }
    static void printArray(int[][] array4){
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] pascal(int n){
        int[][] array = new int[n][];
        for(int i = 0; i < n;i++){
            array[i] = new int[i+1];
            array[i][0]=array[i][i]=1;
            for(int j = 1; j < i;j++){
                array[i][j] = array[i-1][j]+array[i-1][j-1];
            }
        }
        return array;
    }
}
