class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int value = 0;
        int count = 0;
        if(ruleKey.equals("type")){
            value = 0;
        } else if (ruleKey.equals("color")) {
            value = 1;
        } else if (ruleKey.equals("name")) {
            value = 2;
        }else {
            return -1;
        }
        for (int i = 0; i < items.size(); i++) {
            for (int j = value; j < items.get(i).size(); j = j + items.get(i).size()) {
                if(items.get(i).get(j).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}