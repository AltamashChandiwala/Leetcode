class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j =0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    public void swap(int[] arr, int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}