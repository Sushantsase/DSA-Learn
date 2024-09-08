package array.basic;

public class SpanOfArray {
    public static int spanOfArray(int[] arr){
        int max =-(int) 1e9;
        int min = (int) 1e9;
        for(int ele:arr){
            max = Math.max(max,ele);
            min = Math.min(min,ele);
        }
        System.out.println(max);
        System.out.println(min);
        return max-min;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 100, 4, 8, 3, 44};
       int ans = spanOfArray(arr);
        System.out.println(ans);
    }
}
