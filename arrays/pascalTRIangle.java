import java.util.List;
import java.util.ArrayList;
public class pascalTRIangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            triangle.add(new ArrayList<>());
        }

        for (int row = 0; row < numRows; row++) {

            for (int col = 0; col < 1+row; col++) {
              triangle.get(row).add(1);
            }
        }
        return triangle;
    }
}
