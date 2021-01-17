class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int row = grid.length;
        int column = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    mark_island(grid,i,j,row,column);
                }
            }
        }
        return islands;
        
    }
     public void mark_island(char[][] grid,int i,int j,int row, int column){
            if(i<0 || i>=row || j<0 || j>=column || grid[i][j]=='2' || grid[i][j]=='0'){
                return;
            }
            grid[i][j] = '2';
            mark_island(grid,i-1,j,row,column);
            mark_island(grid,i+1,j,row,column);
            mark_island(grid,i,j-1,row,column);
            mark_island(grid,i,j+1,row,column);
     }
}
