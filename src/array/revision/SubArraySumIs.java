package array.revision;
/*
1. Find pivot element in rotated sorted array.
2. find number of sub arrays with sum equals to zero
* */
public class SubArraySumIs {
    public static void printSub(int[] arr, int si, int ei){
        while(si<=ei){
            System.out.print(arr[si]+" ");
            si++;
        }
        System.out.println();

    }
    public static void printSubArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                System.out.println("Sum is " +sum);
                printSub(arr,i,j);


            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        printSubArray(arr);

    }
}
