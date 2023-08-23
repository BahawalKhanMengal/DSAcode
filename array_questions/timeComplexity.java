package array_questions;

public class timeComplexity {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        for (int i = 0;i<n;i++
        ){
            i = i*2;
            count++;
        }
        System.out.println(count);
    }
}
