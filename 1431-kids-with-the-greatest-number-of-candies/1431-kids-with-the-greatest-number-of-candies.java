class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int maxValue = candies[i] + extraCandies;
            int count = 0;
            for(int j =0 ; j < candies.length; j++){
                if (maxValue >= candies[j]){
                    count++;
                }
            }
            if(count == candies.length){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}