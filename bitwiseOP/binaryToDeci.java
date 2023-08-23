package bitwiseOP;
class sear{

    sear(){
        System.out.println("say hello to google");
    }
    static int search(int[] arr, int x){
        for(int i = 0; i < arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
}
public class binaryToDeci {
    public static void main(String[] args) {
        sear obj = new sear();
        int[] arr = {1,2,4,5,3,6,7,8};
        System.out.println(obj.search(arr,4));
    }
}
