import java.util.List;
import java.util.ArrayList;
public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                result.add(matrix[row][col]);
            }
        }
        return result;
    }
}
