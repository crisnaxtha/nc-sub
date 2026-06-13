class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<int[]> list = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(matrix[r][c]);
                if (matrix[r][c] == 0) {
                    int[] arr = new int[2];
                    arr[0] = r;
                    arr[1] = c;
                    list.add(arr);
                }
            }
        }

        for(int[] arr : list) {
            int row = arr[0];
            int col = arr[1];
            for(int i = 0; i < n; i++) {
                matrix[row][i] = 0;
            }
             for(int j = 0; j < m; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}
