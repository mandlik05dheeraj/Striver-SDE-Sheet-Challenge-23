class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix[0].length - 1;
        boolean ans = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] >= target) {
                ans = binarySearch(matrix, i, 0, j, target);
                break;
            }
        }

        return ans;
    }

    public boolean binarySearch(int[][] matrix, int row, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (matrix[row][mid] == target) return true;
            else if (target < matrix[row][mid]) e = mid - 1;
            else s = mid + 1;
        }

        return false;
    }

}
