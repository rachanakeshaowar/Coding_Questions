public class ChessHorseGrid {
    public  boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        // base case
        if(grid[row][col]== n*n-1) return true;
        // we have to check 8 conditions
        //2 Up 1 right
        int i, j;
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 Up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 down 1 right
        i= row +2;
        j=col +1;
        if(i<n && j<n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 down 1 left
        i= row +2;
        j=col -1;
        if(i<n && j>=0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        // 2 right 1 up
        i= row -1;
        j=col +2;
        if(i>=0 && j<n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 right  1 down
        i= row +1;
        j=col +2;
        if(i<n && j<n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 left 1 up
        i= row -1;
        j=col -2;
        if(i>=0 && j>=0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2 left 1 down
        i= row +1;
        j=col -2;
        if(i<n && j>=0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);
        return false;//if we not found any number then to stop program
    }
    public   boolean checkValidGrid(int[][] grid){
        if(grid[0][0]!=0) return false;
        // in leetcode their is written in question that knight starts at top left so start element should be 0 so we checked it
        return helper(grid,0,0,0);// grid,row,col,no.to_start
        // we create helper function if we want to add more parameters as in given function in leetcode their is only
        // grid passed so if we want to add more parameters then we can use helpher function
        // int num is number in grid which starts from 0
    }
    public static void main(String[] args) {
        int[][] grid ={{0,11,16,5,20},
        {17,4,19,10,15},
                {12,1,8,21,6},
                {3,18,23,14,9},
                {24,13,2,7,22}
        };
        ChessHorseGrid chessHorseGrid = new ChessHorseGrid();
        boolean isValid = chessHorseGrid.checkValidGrid(grid);
        System.out.println("Is the grid valid? " + isValid);
    }
}


