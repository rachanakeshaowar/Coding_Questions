public class maxKnightsInNxN {
    // 53:30
    static int maxKnights=-1;
public static boolean isSafe(char[][] board,int row, int col){
    // to check that is it valid to place horse
    int n=board.length;
    int i, j;
    /// 2 up one right
    i = row - 2;
    j = col + 1;
    if (i >= 0 && j < n && board[i][j] == 'K') return false;

    //2 Up 1 left
    i = row - 2;
    j = col - 1;
    if (i >= 0 && j >= 0 &&  board[i][j] == 'K') return false;
    //2 down 1 right
    i= row +2;
    j=col +1;
    if(i<n && j<n && board[i][j] == 'K') return false;

    //2 down 1 left
    i= row +2;
    j=col -1;
    if(i<n && j>=0 && board[i][j] == 'K') return false;

    // 2 right 1 up
    i= row -1;
    j=col +2;
    if(i>=0 && j<n && board[i][j] == 'K') return false;
    //2 right  1 down
    i= row +1;
    j=col +2;
    if(i<n && j<n && board[i][j] == 'K') return false;

    //2 left 1 up
    i= row -1;
    j=col -2;
    if(i>=0 && j>=0 && board[i][j] == 'K') return false;
    //2 left 1 down
    i= row +1;
    j=col -2;
    if(i<n && j>=0 && board[i][j] == 'K') return false;
    return true;
}
public static void nKnight(char[][] board,int row,int col,int num){ // num is no. of knigts
int n= board.length;
    // here in same row we can place Knights so here row will not change and if
    // row finish then we can place knights in next row
    if(isSafe(board,row,col)){ // if it is safe to send knight in this row or col then
        board[row][col]='K';
        if(col!=n-1)  nKnight(board,row,col+1,num+1);// recursion for same row and col+1 and now next Knight will get place so num+1
else nKnight(board,row+1,0,num+1);
        board[row][col]='x';// backtracking
    }
    else{// not safe
        if(col!=n-1)  nKnight(board,row,col+1,num);// recursion for same row and col+1 and now next Knight will not  get place so num
        else nKnight(board,row+1,0,num+1);
    }
}
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
nKnight(board,0,0,0);
    }
}
