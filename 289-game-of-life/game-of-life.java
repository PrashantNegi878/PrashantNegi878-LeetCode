class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                board[i][j]=calulateNeighbours(board,i,j);
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                board[i][j]=(board[i][j]==2)?1:(board[i][j]==3)?0:board[i][j];
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
                total+=(board[x+i][y+j]==2)?0:(board[x+i][y+j]==3)?1:board[x+i][y+j];
            }
        }
        total-=board[x][y];
        int result;
        if(total==2 && (board[x][y]==1 || board[x][y]==3))  result=1;
        else if(total==3) result=1;
        else result= 0;

        if((board[x][y]==0 || board[x][y]==2)&& result==1)return 2;
        else if((board[x][y]==1 || board[x][y]==3)&& result==0) return 3;
        else return board[x][y];
    }
}