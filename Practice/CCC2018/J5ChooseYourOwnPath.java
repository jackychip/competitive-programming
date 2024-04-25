package CCC2018;

import java.util.*;

public class J5ChooseYourOwnPath {

    static LinkedList<Integer> adjacentLists[];
    static boolean[] visited;
    static ArrayList<Integer> endingPages = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfPages = sc.nextInt();
        sc.nextLine();

        adjacentLists = new LinkedList[numberOfPages * 25];

        for (int i = 0; i < numberOfPages * 25; i++)
            adjacentLists[i] = new LinkedList<Integer>();

        visited = new boolean[numberOfPages * 25];

        for (int i = 1; i <= numberOfPages; i++) {
            int numberOfPaths = sc.nextInt();

            if (numberOfPaths == 0) {
                endingPages.add(i);
            } 
            else {
                for (int j = 1; j <= numberOfPaths; j++) {
                    int input = sc.nextInt();
                    adjacentLists[j].add(input);
                }   
            }
        }

        System.out.println("numOfMoves: " + solve(1, 1));

        boolean allPages = true;
 
        for (int i = 0; i < numberOfPages; i++) {
            if (!visited[i]) {
                allPages = false;
                break;
            }
        }



        System.out.println(allPages ? "Y" : "N");

    }

    public static int solve(int node, int numOfMoves) {
        visited[node] = true;

        if (endingPages.contains(node)) {
            System.out.println(numOfMoves);
        }

        Iterator<Integer> iterator = adjacentLists[node].listIterator();

        while (iterator.hasNext()) {
            int adjacentNode = iterator.next();

            if (!visited[adjacentNode]) {
                solve(adjacentNode, numOfMoves + 1);
            }
        }

        return numOfMoves;
    }

}