package array.basic;

public class SubArray {

    public static void printInRange(int[] arr, int si, int ei) {
        while(si<=ei){
            System.out.print(arr[si] +" ");
            si++;
        }
        System.out.println();
    }

    public static void printSubArray(int[] arr) {
        int n =arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                printInRange(arr,i,j);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,6,9,7,4};
        printSubArray(arr);

    }
}
