public class Q2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target=7;
    }
    static int minSubArrayLen(int target, int[] nums) {
        int ans;
        for (int i = 0; i < nums.length;i++){
            ans = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++){
                ans = Math.min(ans, j - i + 1);
                if (nums[j] > target){
                    break;
                }
            }
            if (ans!= Integer.MAX_VALUE){
                return ans;
            }
        }
        return 0;
    }
}
