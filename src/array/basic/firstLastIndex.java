package array.basic;

public class firstLastIndex {
    public static int firstIndex(int[] arr, int data) {
        int si = 0, ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid -1 >=0 && arr[mid - 1] == data) {
                    ei = mid - 1;
                }else{
                    return mid;
                }
            }
            else if(arr[mid]<data){
                si = mid + 1;
            }else{
                ei = mid -1;
            }
        }
        return -1;
    }

    public static int lastIndex(int[] arr,int data) {
        int n = arr.length;
        int si = 0, ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid -1 > n && arr[mid - 1] == data) {
                    si = mid + 1;
                }else{
                    return mid;
                }
            }
            else if(arr[mid]<data){
                si = mid + 1;
            }else{
                ei = mid -1;
            }
        }
        return -1;

    }
public static void firstIndexLastIndeax(int[] arr, int data){
        int fi = firstIndex(arr,data);
        if(fi == -1){
            System.out.println("data not found");
            return;
        }
        int li = lastIndex(arr,data);
    System.out.println(fi);
    System.out.println(li);

}
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20,25,30,30,30,30,30, 40, 50, 60, 70, 80, 90, 100};
        int data = 300;
        firstIndexLastIndeax(arr,data);
//        int value = firstIndex(arr, data);
//      int valuec = lastIndex(arr, data);
//        System.out.println("first : "+value);
//        System.out.println("Last : "+valuec);
    }
}
