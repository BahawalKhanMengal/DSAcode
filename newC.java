public class newC {
    public static void main(String[] args) {
        printNums(5);
    }
    static void printNums(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNums(n-1);
    }
}
