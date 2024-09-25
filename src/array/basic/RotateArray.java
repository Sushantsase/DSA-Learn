package array.basic;

public class RotateArray {
    public static void rotateArrayExtraArray(int[] arr, int r) {
        int[] ans = new int[arr.length];
        r %= arr.length;  // Handle negative number
        if (r < 0) {
            r += arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            int idx = (i + r) % arr.length;
            ans[idx] = arr[i];
        }
        for (int a : ans) {
            System.out.print(a + " ");

        }
    }

    public static void rotateArrayOptimalSolution(int[] arr, int r) {
        r %= arr.length;
        if (r < 0) {
            r += arr.length;
        }
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, r - 1);
        reverseArray(arr, r, arr.length - 1);

        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 65, 4, 8, 3, 44, 10};
        int place = 3;
        print(arr);
        System.out.println("");
       // rotateArrayExtraArray(arr, place);
        rotateArrayOptimalSolution(arr,place);

    }
}
