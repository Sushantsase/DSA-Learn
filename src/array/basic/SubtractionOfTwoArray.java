package array.basic;

public class SubtractionOfTwoArray {

    public static void SubtractionOfTwoArra(int[] a, int[] b) {
     int i = a.length - 1, j = b.length - 1;
     int[] ans = new int[i];

     int k = ans.length -1;
     int borrow =0;
        while (k >= 0) {
    int diff = borrow + a[i] - (j>=0 ? b[j] : 0);
    if(diff < 0){
        diff +=10;
        borrow = -1;
    }
    else{
        borrow = 0;
    }
    ans[k] =diff;
            i--;
            j--;
            k--;
        }
        for (int idx = 0; idx < ans.length; idx++) {
for(int p:ans){
    System.out.print(p+" ");
}
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 6, 4, 8, 3, 4};
        int[] arr2 = new int[]{1, 4, 0, 1, 9};
        SubtractionOfTwoArra(arr1, arr2);
    }
}
