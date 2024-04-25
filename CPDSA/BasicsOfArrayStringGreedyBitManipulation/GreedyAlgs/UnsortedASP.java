package CPDSA.BasicsOfArrayStringGreedyBitManipulation.GreedyAlgs;

import java.util.*;

/*We can use Min-Heap to get the activity with minimum finish time. 
Min-Heap can be implemented using priority-queue */

/*Time Complexity: O(N log N)
Auxiliary Space: O(N) */

public class UnsortedASP {
    
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void SelectActivities(int s[], int f[]) {
        ArrayList<Pair> ans = new ArrayList<>();

        // Minimum Priority Queue to sort activities in
        // ascending order of finishing time (f[i]).
        PriorityQueue<Pair> p  = new PriorityQueue<>(
            (p1, p2) -> p1.first - p2.first);

        for (int i = 0; i < s.length; i++) {
            //add new pair to pq using finishing times as key
            p.add(new Pair(f[i], s[i]));
        }

        Pair it = p.poll();
        int start = it.second;
        int end = it.first;
        ans.add(new Pair(start, end));

        while (!p.isEmpty()) {
            Pair itr = p.poll();
            if (itr.second >= end) {
                start = itr.second;
                end = itr.first;
                ans.add(new Pair(start, end));
            }
        }

        for (Pair pair : ans) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    public static void main(String[] args)
    {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };

        SelectActivities(s, f);
    }
    
}
