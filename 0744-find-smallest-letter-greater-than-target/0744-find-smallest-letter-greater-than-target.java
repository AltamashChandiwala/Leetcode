class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                ans = letters[mid];
                end = mid - 1;
            }
        }

        // If no greater letter is found, return the first letter
        return ans == 0 ? letters[0] : ans;
    }
}
