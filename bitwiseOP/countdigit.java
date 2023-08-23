package bitwiseOP;

public class countdigit {
    public static void main(String[] args) {
        int n =6;
//        int i =0;
//        while (n>0){
//            n = n/10;
//            i++;
//        }
//        System.out.println(i);
//        int remainder = 0;
//        int summ = 0;
//        while (n>0){
//            remainder = n %10;
//            n = n/10;
//            summ = summ + remainder;
//        }
//        System.out.println(summ);
//        int raw = 0;
//        int sum = 0;
//        while (n>0){
//            raw = n%10;
//            n = n/10;
//            sum = sum*10 + raw;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0){
//                sum = sum - i;
//            }else{
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//        int fac = 1;
//        for (int i = 0; i <=n; i++) {
//            if (i==0){
//                System.out.println(i+" fac = "+1);
//            }else{
//                fac = fac*i;
//                System.out.println(i+" fac = "+ fac);
//            }
//
//
//        }
        int a = 2;
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
           ans = ans*a;
        }
        System.out.println(ans);
    }
}
//123456