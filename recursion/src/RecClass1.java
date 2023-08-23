public class RecClass1 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumN(n));
        oneToN(n);
    }
    static int sumN(int n){
        int sum = 0;
        sum +=  n;
        if (n<=1){
            return sum;
        }
        return sumN(n-1);
    }
    static void oneToN(int n){
        if (n<=1){
            System.out.println(n);
            return;
        }

        oneToN(n-1);
        System.out.println(n);
    }
}
