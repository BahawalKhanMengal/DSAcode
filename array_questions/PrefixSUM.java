package array_questions;
import java.util.Arrays;
public class PrefixSUM {
    public static void main(String[] args) {
        int[] prefix = {2,4,6,2,4};
//        prefixsum(prefix);
        int[] pref = prefixsum(prefix);
        System.out.println(Arrays.toString(pref));
    }
//    all of the below approaches are working but all of them are
//    different from there return values
//    static void prefixsum(int[] prefix){
//        int n = prefix.length;
//        int[] result = new int[n];
//        result[0] = prefix[0];
//        System.out.println(result[0]);
//        for(int i = 1; i < n; i++){
//            result[i] = result [i-1]+prefix[i];
//            System.out.println(result[i]);
//        }
//    }
    static int[] prefixsum(int[] prefix){
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1]+prefix[i];
        }
        return prefix;
//        int n = prefix.length;
//        int[] result = new int[n];
//        result[0] = prefix[0];
//        for(int i = 1; i < n; i++){
//            result[i] = result [i-1]+prefix[i];
//        }
//        return result;
    }
}
