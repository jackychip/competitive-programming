package CCC2020;

import java.io.*;
import java.util.*;

class Pair {

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    int first;
    int second;
}

public class S2EscapeRoom {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[][] room = new int[M + 1][N + 1];
        LinkedList<Pair>[] adj = new LinkedList[M * N + 1];

        for (int i = 0; i < M*N + 1; i++)
            adj[i] = new LinkedList<>();


        for (int i = 1; i <= M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                room[i][j] = Integer.parseInt(str.nextToken());
                adj[i*j].add(new Pair(i, j));
            }
        }

        boolean[][] visited = new boolean[M + 1][N + 1];
        LinkedList<Pair> queue = new LinkedList<>();

        visited[1][1] = true;
        queue.add(new Pair(1, 1));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            if (current.first == M && current.second == N) {
                System.out.println("yes");
                System.exit(0);
            }

            if (room[current.first][current.second] > M * N) {
                continue;
            }

            Iterator<Pair> i = adj[room[current.first][current.second]].listIterator();
            while (i.hasNext()) {
                Pair next = i.next();
                if (!visited[next.first][next.second]) {
                    visited[next.first][next.second] = true;
                    queue.add(next);
                }
            }
        }

        System.out.println("no");

    }

}
