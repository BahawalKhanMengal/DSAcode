public class Q5 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
    }
    static int singleNumber(int[] nums) {
        if  (nums.length==1){
            return nums[0];
        }
        int singleNum =0;
        for(int i = 0;i<nums.length;i++){
            for (int j = 1+i; j <nums.length ; j++) {
                if(nums[j]==nums[i]){
                    continue;
                } else if (nums[j]!=nums[i]){

                }
            }
        }
        return singleNum;
    }
}
