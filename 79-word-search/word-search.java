class Solution {
        boolean flag=false;
        int l1,l2;
    public boolean exist(char[][] board, String word) {
        l1=board.length;
        l2=board[0].length;
        boolean[][] matrix=new boolean[l1][l2];
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(word.charAt(0)==board[i][j])
                bfs(i,j,0,board,word,matrix);
            }
        }
        return flag;
    }

    public void bfs(int i, int j,int pointer, char[][] board,String word,boolean[][] matrix)
    {
        if(pointer==word.length())
            {
                flag=true;
                return;
            }
        if(i<0 || j<0 || i>=l1 || j>=l2 || pointer>word.length()) return;
        if(board[i][j]==word.charAt(pointer) && matrix[i][j]==false)
        {
            matrix[i][j]=true;
            bfs(i-1,j,pointer+1,board,word,matrix);
            bfs(i+1,j,pointer+1,board,word,matrix);
            bfs(i,j-1,pointer+1,board,word,matrix);
            bfs(i,j+1,pointer+1,board,word,matrix);
            matrix[i][j]=false;
        }
        return;
    }
}