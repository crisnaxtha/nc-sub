class Solution {

    public static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        int ROWS = board.length, COLS = board[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                if(dfs(board, r, c, ROWS, COLS, visited, 0, word)) {
                    return true;
                }
            }
        } 
        return false;
    }

    public boolean dfs(char[][] board, int r, int c, int ROWS, int COLS, boolean[][] visited, int i, String word) {
        if( i == word.length()) return true;
        
        if(r >= ROWS || c >= COLS || r < 0 || c < 0 || visited[r][c] || word.charAt(i) != board[r][c]) {
            return false;
        }

        visited[r][c] = true;

        boolean res = dfs(board, r + 1, c, ROWS, COLS, visited, i + 1, word) || 
        dfs(board, r - 1, c, ROWS, COLS, visited, i + 1, word) ||
        dfs(board, r, c + 1, ROWS, COLS, visited, i + 1, word) ||
        dfs(board, r, c - 1, ROWS, COLS, visited, i + 1, word);

        visited[r][c] = false;

        return res;
    }
}