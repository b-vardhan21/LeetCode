class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        int nodelength = isConnected.length;
        int[] visited = new int[nodelength];
        //visited[0] = true; 
        for(int i=0; i<nodelength; i++){
            
            if(visited[i]==0){
                dfs(isConnected,visited,i,nodelength);
                visited[i] = 1;
                count++;
            }
        }
        
        return count;
    }
     void dfs(int[][] isConnected, int[] visited, int i,int n){
            
         for(int j = 0;j<n;j++){
             if(isConnected[i][j] == 1 && visited[j] == 0){
                
                 visited[j] = 1;
                 dfs(isConnected, visited,j,n);
             }
         }
            
         
        }
        
}