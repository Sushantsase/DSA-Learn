package array.twoD;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];

        arr[1] = new int[2];
        arr[2] = new int[3];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += count;
                count++;

            }
        }

        for (int[] a:arr) {
            for (int e:a) {
                System.out.print(e+" ");

            }
            System.out.println();
        }
    }
}
