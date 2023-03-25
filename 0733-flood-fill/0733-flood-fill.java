class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pc=image[sr][sc];
        image=populateArray(image, sr, sc, color, pc);
        return image;
    }

    public int[][] populateArray(int[][] image, int sr, int sc, int color, int pc)
    {
        if(sr>-1 && sr<image.length && sc>-1 && sc<image[0].length)
            {
                if(image[sr][sc]==color || image[sr][sc]!=pc)
                    return image;
                else
                    image[sr][sc]=color;
            }
        
        else
            return image;
        image=populateArray(image,sr-1,sc,color,pc);
        image=populateArray(image,sr+1,sc,color,pc);
        image=populateArray(image,sr,sc-1,color,pc);
        image=populateArray(image,sr,sc+1,color,pc);
        return image;
    }
}