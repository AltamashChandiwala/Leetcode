class Solution {
    public int diagonalSum(int[][] mat) {
        int total = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i]==mat[j] || i+j == mat.length-1) {
                    total = total + mat[i][j];
                }
            }

        }
        return total;
    }
}