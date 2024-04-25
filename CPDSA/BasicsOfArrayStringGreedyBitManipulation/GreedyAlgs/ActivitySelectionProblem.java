package CPDSA.BasicsOfArrayStringGreedyBitManipulation.GreedyAlgs;

/*You are given n activities with their start and finish times. 
Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.  */

/*The greedy choice is to always pick the next activity whose finish time is the least among the remaining activities 
and the start time is more than or equal to the finish time of the previously selected activity. We can sort the activities according 
to their finishing time so that we always consider the next activity as the minimum finishing time activity */

/*Time Complexity: O(N)
Auxiliary Space: O(1) */

public class ActivitySelectionProblem {
    
    //sorted s and f
    public static void printMaxActivities(int s[], int f[], int n) {
        int i, j;
        
        //first activity is always selected
        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;

        printMaxActivities(s, f, n);
    }

}
