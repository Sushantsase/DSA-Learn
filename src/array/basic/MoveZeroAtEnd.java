package array.basic;

public class MoveZeroAtEnd {
    public static void moveZero(int[] arr){
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
    for(int a:arr){
        System.out.print(a+" ");
    }
    }

    public static void main(String[] args) {
      int[] nums = {45,0,8,90,0,3,0,9,7,4,5,0,00,0,7,1,0,3,12};
     moveZero(nums);
    }
}
