class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        boolean visited[] = new boolean[V];
        bfs(0,adj,l,visited);
        return l;
    }
    public void bfs(int index ,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> l, boolean visited[]){
        visited[index] = true;
        l.add(index);
        for(Integer neighbour : adj.get(index)){
            if(!visited[neighbour]){
                l.add(neighbour);
                visited[neighbour] = true;
            }
        }
        for(int i=1;i<l.size();i++){
            for(Integer neighbour : adj.get(l.get(i))){
                if(!visited[neighbour]){
                    l.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
}
