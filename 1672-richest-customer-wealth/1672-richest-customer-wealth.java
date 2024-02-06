class Solution {
    public int maximumWealth(int[][] accounts) {
        int [] finalArray = newArray(accounts);
        int maxvalue = 0;
        for (int i = 0; i < finalArray.length; i++) {
            if(finalArray[i] > maxvalue){
                maxvalue = finalArray[i];
            }
        }
        return maxvalue;
    }
    int[] newArray(int[][] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
            }
            array[i] = total;
        }
        return array;
    }
}