import java.util.Arrays;
public class TwodMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = binarySearch(matrix, 2);
        System.out.println(Arrays.toString(result));
    }
    static int[] binarySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row <arr.length && col>=0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
