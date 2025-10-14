package com.company.chap6_arrays;

import java.util.Scanner;
import java.util.Arrays;
public class practice_set6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
//      classes for different features.
/*       1). sorting array
        int[] arr = {3,2,5,3,6,8,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

/*      2). searching element with element , it tells the index(location)
        int[] arr = {2,4,5,3,5,7,9};
        int index = Arrays.binarySearch(arr,3);
        System.out.println(index); */

//       3). comparison
         //       a). equals(...) (shallow compare)
       int[] a = {1,4,2,3};
        int[] b = {1,2,3,5};
        int[] c = {1, 2, 4};
        int[] d = {1, 2};
        System.out.println(Arrays.equals(a,b));
        //       b). deepEquals(...) (nested arrays)
        int[][] a1 = {{2,6},{4,2},{1,6}};
        int[][] a2 = {{2,6},{4,2},{1,6}};
        System.out.println(Arrays.deepEquals(a1,a2));
        //       c).pare(...) (lexicographic) only compare with 1D array
        System.out.println(Arrays.compare(a,c)); // 0 for array is equal and -1 for b is greater and 1 for
        //mismatch(...) (first differing index)
        System.out.println(Arrays.mismatch(d,a));
    }
}