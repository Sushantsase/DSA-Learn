package array.basic;
// index to element and element to index

// 2 4 3 0 1

// 3 4 0 2 1
public class InverseOfArray {
    public static void inverseArray(int[] arr) {
        int[] inArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            inArray[index] = i;
        }
        for (int ele : inArray) {
            System.out.print(ele + " ");
        }
    }


    public static void print(int[] arr) {
for(int ele:arr){
    System.out.print( ele+" ");
}
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 3, 0, 1};
        print(arr);
        System.out.println("");
        inverseArray(arr);


    }
}
