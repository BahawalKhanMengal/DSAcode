import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,1};
        int[] arr1 = {2,2};
        int[] ans = intersection(arr,arr1);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[]{};
        int index = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    result[index] = nums1[i];
                    index++;
                }
            }
        }
        return result;
    }
}
