// 74. Search a 2D Matrix
// You are given an m x n integer matrix matrix with the following two properties:
// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.
// You must write a solution in O(log(m * n)) time complexity.

//applying binary search in 2d array
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cl = matrix.length;
        int rl = matrix[0].length;
        int left = 0 ,right = cl*rl - 1;
        while(left<=right){
            int mid = left+ (right- left)/2;
            if(matrix[mid/rl][mid%rl] == target){
                return true;
            }
            else if(matrix[mid/rl][mid%rl] > target){
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }
        return false;
    }
}