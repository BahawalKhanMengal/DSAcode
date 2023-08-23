import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                Scanner n = new Scanner(System.in);
                System.out.print("Enter three numbers: ");

                int a = n.nextInt();
                int b = n.nextInt();
                int c = n.nextInt();


                while(a>b) {
                    if(true)  {
                        System.out.print( a + " is greater than " + b );
                    }
                    else {
                        System.out.print( b + " is greater than "+ a );
                    }

                    while(a>c) {
                        if(true) {
                            System.out.print( a + " is greater than "+ c );
                        }
                        else {
                            System.out.print( c + " is greater than "+ a );
                        } }
                    while(c>b) {
                        if(true){
                            System.out.print( c + " is greater than "+ b );
                        }
                        else {
                            System.out.print( b + " is greater than "+ c );
                        }
                    }
                }
            }
        }
