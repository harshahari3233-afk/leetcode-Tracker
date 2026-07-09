// Last updated: 7/9/2026, 3:07:42 PM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o=image[sr][sc];
        if(o==color){
            return image;
        }
        dfs(image,sr,sc,color,o);
        return image;
    }
    private void dfs(int[][]img,int r,int c,int col,int o){
        if(r<0 || c<0 || r>=img.length || c>=img[0].length ){
            return ;
        }
        if(img[r][c]!=o){
            return ;
        }
        img[r][c]=col;
        dfs(img,r+1,c,col,o);
        dfs(img,r-1,c,col,o);
        dfs(img,r,c+1,col,o);
        dfs(img,r,c-1,col,o);
        

    }
}