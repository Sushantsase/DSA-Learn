package leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }
        long rev = 0;
        int original = x;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;

        }
        return rev == original;
    }
}