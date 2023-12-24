class Solution {
    public void gameOfLife(int[][] board) {
        int[][] result = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                result[i][j]=calulateNeighbours(board,i,j);
            }
        }
        // return result;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]=result[i][j];
            }
        }
    }

    public int calulateNeighbours(int[][] board, int x, int y)
    {
        int l1=board.length;
        int l2=board[0].length;
        int total=0;
        for(int i=-1;i<=1;i++)
        {
            if(x+i<0 || x+i>=l1) continue;
            for(int j=-1;j<=1;j++)
            {
                if(y+j<0 || y+j>=l2) continue;
                total+=board[x+i][y+j];
            }
        }
        total-=board[x][y];
        if(total==2 && board[x][y]==1)  return 1;
        else if(total==3) return 1;
        else return 0;
    }
}