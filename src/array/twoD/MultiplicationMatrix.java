package array.twoD;

public class MultiplicationMatrix {
    public static void multiplication(int[][] a, int[][] b){
        int n = a.length;
        int m = a[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0;i< n;i++){
            for (int j=0;j<m;j++){
                ans[i][j] = a[i][j] * b[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printSum(int[][] a){
        int n = a.length;
        int m = a[0].length;

        for(int[] arr:a){
            for(int e:arr){
                System.out.print(e+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {10, 20, 30, 40, 50},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}};

        int[][] arr2 = new int[][]{
                {10, 20, 30, 40, 50},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}};


        int[][] arr3 = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 1, 3, 1, 5},
                {21, 2, 23, 24, 25}};

        multiplication(arr1,arr3);
    }
}
