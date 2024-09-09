package array.twoD;

public class StateOfWakanda {
    public static void display2(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void display21(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int[] a : arr) {
            for (int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }

    public static void stateOfWakanda(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30, 40, 50},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}};
        int data = 6;
        display21(arr);
        System.out.println("State of Wakanda");
        stateOfWakanda(arr);
    }
}
