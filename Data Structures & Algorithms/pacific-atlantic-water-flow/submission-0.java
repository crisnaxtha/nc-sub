class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    List<List<Integer>> res;
    int ROWS, COLS;
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ROWS = heights.length; COLS = heights[0].length;
        res = new ArrayList<>();
        boolean[][] pacific = new boolean[ROWS][COLS];
        boolean[][] atlantic = new boolean[ROWS][COLS];

        for (int r = 0; r < ROWS; r++) {
            dfs(heights, r, 0, heights[r][0], pacific);
            dfs(heights, r, COLS - 1, heights[r][COLS - 1], atlantic);
        }
        for (int c = 0; c < COLS; c++) {
            dfs(heights, 0, c, heights[0][c], pacific);
            dfs(heights, ROWS - 1, c, heights[ROWS - 1][c], atlantic);
        }

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
    }

    public void dfs(int[][] heights, int r, int c, int prevHeight, boolean[][] ocean) {
        if (r < 0 || r >= ROWS || c < 0 || c >= COLS || ocean[r][c] || heights[r][c] < prevHeight) {
            return;
        }
        ocean[r][c] = true;
        for (int[] dir : directions) {
            dfs(heights, r + dir[0], c + dir[1], heights[r][c], ocean);
        }
    }
}