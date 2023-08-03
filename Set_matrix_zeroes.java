// 73.Set Matrix setZeroes
// Given an m x n integer matrix matrix, if an element is 0, set 
// its entire row and column to 0's.
class Solution {
    public void setZeroes(int[][] matrix) {
       int[] a = new int[matrix.length];
       int[] b = new int[matrix[0].length];
       Arrays.fill(a,1);
       Arrays.fill(b,1);
       for(int i =0;i<matrix.length;i++){
           for(int j = 0;j<matrix[0].length;j++){
               if(matrix[i][j] == 0){
                   a[i] = 0;
                   b[j] = 0;
               }
           }
       }
       for(int i= 0;i<matrix.length;i++){
           for(int j = 0;j<matrix[0].length;j++){
               if(a[i] == 0 || b[j] == 0){
                   matrix[i][j] = 0;
               }
           }
       }
    }
}