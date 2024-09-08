package array.twoD;

import java.util.Scanner;

public class Print2DArray {

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int max(int[][] arr) {
        int max = -(int) 1e9;
        int n = arr.length, m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }


    public static int min(int[][] arr) {
        int min = (int) 1e9;
        int n = arr.length, m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        return min;
    }

    public static void display(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean findIndex(int[][] arr, int data) {
        boolean index = false;
        int n = arr.length, m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                index = arr[i][j] == data;
                if (index) {
                    return index;
                }
            }

        }
        return index;
    }

    public static void display2(int[][] arr) {
        for (int[] ar : arr) {
            for (int w : ar) {
                System.out.print(w);
            }
            System.out.println();
        }

    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
//        input(arr);
        //  display2(arr);

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int data = 6;
        display2(arr);
        System.out.println(findIndex(arr, data));
//        int maxValue = max(arr);
//        System.out.println(maxValue);
//        int minValue = min(arr);
//        System.out.println(minValue);
    }
}
