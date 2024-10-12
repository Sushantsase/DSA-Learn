package array.basic;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n + m];
        for (int i = 0; i < n; i++) {
            res[i] = arr1[i];
        }
        for (int j = 0; j < m; j++) {
            res[n + j] = arr2[j];
        }
        Arrays.sort(res);
        for (int a : res) {
            System.out.print(a + " ");
        }

    }
    public static void merge2(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n + m];
        int i =0, j=0,k=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while(i<n){
            res[i]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            res[k]=arr2[j];
            j++;
            k++;
        }
        //Arrays.sort(res);
        sortArray(res);
        for (int a : res) {
            System.out.print(a + " ");
        }

    }
    public static void sortArray(int[] arr){
        for(int i= 0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){    //15 5
                    int temp = arr[j+1];    // temp = 5
                    arr[j+1] = arr[j];      // j+1 = 15
                    arr[j] = temp;            // j 5
                }

            }
        }
    }

    public static void main(String[] args) {
      int[] arr1 = new int[]{2, 4, 6, 4, 8, 3, 4};
        int[] arr2 = new int[]{1, 4, 0, 1, 9};
        //int[] arr1 = new int[]{0};
       // int[] arr2 = new int[]{1};
        merge(arr1, arr2);
        System.out.println();
        merge2(arr1, arr2);
    }
}
