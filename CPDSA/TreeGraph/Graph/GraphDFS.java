package CPDSA.TreeGraph.Graph;

import java.util.*;

public class GraphDFS {
    
    //number of vertices
    static private int V;

    //adjacency lists
    private LinkedList<Integer> adj[];

    //constructor
    GraphDFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) 
            adj[i] = new LinkedList();
    }

    //add edge to graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int current, boolean visited[]) {
        
        //mark the current node as visited and print
        visited[current] = true;
        System.out.print(current + " ");

        //recursive call for all adjacent vertices
        Iterator<Integer> i = adj[current].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS(n, visited);
            }
        }

    }

    //driver
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");

        boolean[] visited = new boolean[V];
 
        // Function call
        g.DFS(2, visited);
    }

}
