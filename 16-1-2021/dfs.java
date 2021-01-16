class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        boolean visited[] = new boolean[V];
        dfs(0,adj,l,visited);
        return l;
        
    }
    public void dfs(int index, ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> l, boolean visited[]){
        visited[index] = true;
        l.add(index);
        for(Integer neighbour : adj.get(index)){
            if(!visited[neighbour]){
                    dfs(neighbour, adj, l,visited);
                }
        }
    }
}
