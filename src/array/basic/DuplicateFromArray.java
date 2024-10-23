package array.basic;

public class DuplicateFromArray {
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int findDuplicateOptimize(int[] arr) {
        int n = arr.length;
        int[] res = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            if (res[arr[i]] == 0) {
                res[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }

    public static String findDuplicateOptimizeString(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n - 1; j++) {
                if ((arr[i].equals(arr[j])) && i!=j) {
                    return arr[i];
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 3};
        System.out.println("The duplicate element is " + findDuplicate(arr));
        System.out.println("The duplicate element is " + findDuplicateOptimize(arr));

        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        System.out.println(findDuplicateOptimizeString(my_array));
    }
}
