class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int source = image[sr][sc];
        if(source!=newColor){
            floodfill(image,sr,sc,newColor,source);
        }
        return image;
    }
    public void floodfill(int[][] image,int i,int j,int newColor,int source){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=source){
            return;
        }
        image[i][j]=newColor;
        floodfill(image,i-1,j,newColor,source);
        floodfill(image,i+1,j,newColor,source);
        floodfill(image,i,j-1,newColor,source);
        floodfill(image,i,j+1,newColor,source);
    }
}
