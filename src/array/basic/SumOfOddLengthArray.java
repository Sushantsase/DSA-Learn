    package array.basic;

    public class SumOfOddLengthArray {

        public static int subArray(int[] a, int i, int j) {
            int sum = 0;
            while (i <= j) {
                System.out.print(a[i] + " ");
                sum = sum + a[i];
                i++;
            }
            System.out.println();
            return sum;
        }

        public static int addOddSubArray(int[] arr) {
            int totalSum = 0;
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if ((j - i + 1) % 2 != 0) {
                        int res = subArray(arr, i, j);
                        System.out.println(res);
                        totalSum = totalSum + res;
                    }

                }
            }
            return totalSum;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 4, 2, 5, 3};
            int result = addOddSubArray(arr);
            System.out.println(result);
        }
    }
