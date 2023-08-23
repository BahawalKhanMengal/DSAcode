public class binarySS {
    static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left)/2;
        while(left <= right){
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            mid = left + (right - left)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(binary(arr,5));
    }
}
////public class BinarySearch {
////    public static void main(String[] args) {
////        int[] arr = {1,3,5,7,9,90,445,555,667};
////        System.out.println(search(arr,3));
////    }
////    static int search(int[] arr, int target){
////        int start_index = 0;
////        int end_index = arr.length-1;
////        int mid_index = start_index + (end_index-start_index)/2;
////        while (start_index<=end_index){
////            if (arr[mid_index]==target){
////                return mid_index;
////            }else if (arr[mid_index]>target){
////                end_index = mid_index-1;
////            }else if (arr[mid_index]<target){
////                start_index = mid_index+1;
////            }
////            mid_index = start_index + (end_index-start_index)/2;
////        }
////        return -1;
////    }
////}
////sql creating table command
////create table student(rollno int, sname varchar(15), age int);
//// to see the table
////select table_name from cat where table_name='STUDENT';
//// to insert the data;
////insert into student values (1,'Ali ahmed',25);
//// to show the table result
//// select * from student;
