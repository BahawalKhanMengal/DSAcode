package array_questions;

public class oneBasedIndexing {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6};
        int ans = rangeSum(arr,1,arr.length-1);
        System.out.println(ans);
    }
    
    static int rangeSum(int[] arr, int l ,int r){
        int sum = 0;
        for (int i =l ;i<=r;i++){
            sum += arr[i];
        }
        return sum;
    }
}
