import java.util.Arrays;
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i] + numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
