package array.basic;

public class digitFrequencyNummber {
    public static void frequency(int n, int d) {
        int count = 0;
        while (n != 0) {
           int lastdigit = n% 10;
            n /= 10;
            if(lastdigit == d){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int n = 995530947;
        int d = 9;
        frequency(n, d);
    }
}
