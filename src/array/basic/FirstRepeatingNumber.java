package array.basic;

public class FirstRepeatingNumber {
    public static int firstRepeatingNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println(firstRepeatingNumber(arr));;
    }
}
