class Solution {
    public int arrangeCoins(int n) {
        int i = 0;
        int j = 1;

        while (n >= j) {
            i++;
            n = n - j;
            j = i + 1;
        }

        return i;
    }
}