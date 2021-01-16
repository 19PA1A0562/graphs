import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList < Edge > [] graph = new ArrayList[vtces];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();    // create adjacent list
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList < > ();
            adj.add(i, new ArrayList<Integer>());
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
            adj.get(v1).add(v2);                                  // adding  an edge into the adajacent list 
        }
        
        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        
        //write your code
        
        ArrayList<Integer> l = new ArrayList<>();
    
        for(Integer neighbour : adj.get(src)){
            
                l.add(neighbour);
            
        }
        int flag = 0;
        for(int i=0;i<l.size();i++){
            for(Integer neighbour : adj.get(l.get(i))){
                l.add(neighbour);
                if(neighbour==dest){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

}
