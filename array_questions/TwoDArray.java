package array_questions;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int[][][] array = {{{1, 2},{1,2,3,4,5,6,7},{1,2,3,4,5}},{{1, 2},{1,2,3,4,5,6,7},{1,2,3,4,5}}};
//        int i = 0;
//        while (i<array.length){
//            for (int j = 0; j<array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//            i++;
//        }
//        int[][] arr = new int[2][3];
//        takeInput(arr);
//        printArray(arr);
//        int[][] arr1 = {{1,2,3},{1,2,4}};
//        int[][] arr2 = {{1,2},{1,2},{1,2}};
//        AdditionOFtwoARRAYS(arr1,2,4,arr2,2,4);
//        Multiplication(arr1,2,3,arr2,3,2);
//
//        int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.println("the transpose of matrix is ");
//        Transpose(arr3,4,4);
        int[][] spearicalMatrix = { {1,2,3,11},
                                    {4,5,6,12},
                                    {7,8,9,13}};
//        spearicalMMatrix(spearicalMatrix);
//        System.out.println();
//        spearialOrder(spearicalMatrix,3,4);
//        System.out.println();
//        int n = 10;
//        int[][] matrix = spearialGenerate(n);
//        printArray(matrix);

    }
//    generate spearial matrix
static int[][] spearialGenerate(int n){
        int[][] matrix = new int[n][n];
    int topRow = 0, bottomRow = n-1, rightCol = n-1, leftCol = 0;
    int current = 1;
    while(current <= n*n){
//            topRow -> leftCol to rightCol
        for(int j=leftCol; j<=rightCol && current <= n*n; j++){
            matrix[topRow][j] = current;
            current++;
        }
        topRow++;
//            rightCol -> topRow to bottomRow
        for (int i = topRow; i <= bottomRow && current <= n*n; i++) {
            matrix[i][rightCol] = current;
            current++;
        }
        rightCol--;
//            bottomRow -> rightCol to leftCol
        for(int j = rightCol; j >= leftCol && current <= n*n; j--){
            matrix[bottomRow][j] = current;
            current++;
        }
        bottomRow--;
//            leftCol -> bottomRow to topRow
        for (int i = bottomRow; i>=topRow && current <= n*n; i--){
            matrix[i][leftCol] = current;
            current++;
        }
        leftCol++;
    }
    return matrix;
}
// the code of spearical matrix is given below;
    static void spearialOrder(int[][] matrix,int row, int col){
        int topRow = 0, bottomRow = row-1, rightCol = col-1, leftCol = 0;
        int totalElements = 0;
        while(totalElements<row*col){
//            topRow -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol && totalElements<row*col; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
//            rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements<row*col; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
//            bottomRow -> rightCol to leftCol
        for(int j = rightCol; j >= leftCol && totalElements<row*col; j--){
            System.out.print(matrix[bottomRow][j]+" ");
            totalElements++;
        }
        bottomRow--;
//            leftCol -> bottomRow to topRow
            for (int i = bottomRow; i>=topRow && totalElements<row*col; i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    static void spearicalMMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
//            System.out.println();
        }
    }

    static void printArray(int[][] array4){
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void takeInput(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k <arr[j].length; k++) {
                arr[j][k] = sc.nextInt();
            }
        }
    }
//    this is the addition code of two matrices
    static void AdditionOFtwoARRAYS(int[][] array1,int r1 , int c1, int[][] array2, int r2,int c2){
        if (r1 != r2 || c1 != c2) {
            System.out.println("wrong input: addition of array is not possible");
            return;
        }
        int[][] result = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
               result[i][j] = array1[i][j]+array2[i][j];
            }
        }
        printArray(result);
    }
//    this i the multiplication code two matrices
static void Multiplication(int[][] array1,int r1 , int c1, int[][] array2, int r2,int c2){
    if (c1!=r2) {
        System.out.println("wrong input: Multiplication of array is not possible");
        return;
    }
    int[][] result = new int[r1][c2];
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
            for (int k = 0; k < c1; k++) {
                result[i][j] += array1[i][k]*array2[k][j];
            }
        }
    }
    printArray(result);
}
//transpose of matrix code is under below
    static void Transpose(int[][] arr,int r, int c){
        int[][] result = new int[c][r];
        for(int row = 0; row < c; row++) {
            for(int col = 0; col <r; col++) {
                result[row][col]=arr[col][row];
            }
        }
        printArray(result);
    }

}
