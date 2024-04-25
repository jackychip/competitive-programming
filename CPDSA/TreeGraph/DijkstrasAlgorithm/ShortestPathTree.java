package CPDSA.TreeGraph.DijkstrasAlgorithm;

/*
 * Given a weighted graph and a source vertex in the graph, 
 * find the shortest paths from the source to all the other vertices in the given graph.
 * Note: The given graph does not contain any negative edge.
 */

public class ShortestPathTree {
    
    //number of vertices
    static int V = 9;

    //find vertex with minimum distance value
    int minDistance(int[] dist, Boolean[] sptSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < V; i++) {
            if (!sptSet[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    void printSolution(int[] dist) {
        System.out.println(
            "Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    void alg(int[][] graph, int src) {
        //output array
        int[] dist = new int[V];

        //sptSet[i] is true when vertex i is included in shortest path
        Boolean[] sptSet = new Boolean[V];

        //init all dists as inf and sptSet as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        //dist from src vertex is always 0
        dist[0] = 0;

        //finding the shortest path for all vertices
        for (int i = 0; i < V - 1; i++) {
            //pick the minimum distance vertex from the unvisited set of vertices
            int u = minDistance(dist, sptSet);

            //mark vertex as visited
            sptSet[u] = true;

            //update distance values for the selected vertex (u)
            for (int j = 0; j < V; j++) {
                //update dist[j] only if it has not been visited,
                //there is an edge between u and j, and
                //the total weight of path from src to j is less than value of dist[j]
                if (!sptSet[j] && graph[u][j] != 0
                    && dist[u] != Integer.MAX_VALUE
                    && dist[u] + graph[u][j] < dist[j]) {
                        dist[j] = dist[u] + graph[u][j];
                    }

            }
        }

        printSolution(dist);
    }

    public static void main(String[] args) {
        
        /* Let us create the example graph discussed above
         */
        int graph[][]
            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        ShortestPathTree t = new ShortestPathTree();
 
        // Function call
        t.alg(graph, 0);

    }

}