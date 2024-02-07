class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        int altitude = 0;
        ans[0] = 0;
        int max = ans[0];
        for (int i = 1; i < ans.length; i++) {
            altitude = altitude + gain[i-1];
            ans[i] = altitude;
            if(max < altitude){
                max = ans[i];
            }
        }
        return max;
    }
}