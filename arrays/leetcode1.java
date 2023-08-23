import java.util.*;
public class leetcode1 {
    public static void main(String[] args) {
//    int[] arr = {9};
//    System.out.println(Arrays.toString(plusOne(arr)));


    }


    static int[] plusOne(int[] digits) {
        int l = digits.length-1;
        digits[l] = digits[l]+1;
        if(digits[l]>=10){
            digits[l] = digits[l]/10;
        }
        if(digits[l]>=10){
            digits[l+1] = digits[l]%10;
        }
        return digits;
    }
}
