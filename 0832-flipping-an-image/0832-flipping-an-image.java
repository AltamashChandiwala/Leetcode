class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int k = image[i].length-1;
            int j =0;
            while (k>j){
                swap(image[i],j,k);
                k--;
                j++;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;

    }
    static void swap(int[] arr,int firstno , int lastno){
        int temp = arr[firstno];
        arr[firstno] = arr[lastno];
        arr[lastno] = temp;
    }
}