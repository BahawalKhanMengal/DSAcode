public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,19};
        System.out.println(maxVal(arr));
    }
    static int maxVal(int[] arr){
        int maxvalue = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
