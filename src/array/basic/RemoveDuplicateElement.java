package array.basic;

public class RemoveDuplicateElement {
    public static void removedyplicate(int[] arr){
      //  int[] ans =
    }
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        System.out.print(set);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,5,8,5,6,2,8,2,5,9};
        removedyplicate(arr);
    }
}
