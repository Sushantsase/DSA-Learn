package array.basic;

public class BinarySearchSortedArray {
    public static int binarySearch(int[] arr, int data) {
        int si = 0, ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) return mid;
            else if (arr[mid] < data) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100};
        int data = 10;
       int value = binarySearch(arr,data);
        System.out.println(value);
    }
}
