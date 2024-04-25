package CPDSA.TreeGraph.Graph;

import java.util.*;

/*Given a tree with v vertices, find the level of each node in a tree from the source node. */
//Time Complexity: O(n)
//Space Complexity: O(n)

public class GraphBFS {

    //num of nodes
    private int V;

    //adjacency lists
    private LinkedList<Integer> adj[];

    //constructor
    GraphBFS(int v) {
        this.V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    //Add edge to graph 
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int current) {
        //mark all vertices as not visited (false)
        boolean visited[] = new boolean[V];

        //queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //mark current node as visited and add it to queue
        visited[current] = true;
        queue.add(current);

        while (queue.size() != 0) {

            //dequeue a vertex from queue and print it
            //poll() returns the element at the head of the queue
            current = queue.poll();
            System.out.print(current + " ");

            //get all adjacent vertices of the current (dequeued) vertex
            //if an adjacent vertex has not been visited, mark it visited and queue it
            Iterator<Integer> i = adj[current].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }
    }

    //driver
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 2)");
 
        g.BFS(2);
    }
    
}
