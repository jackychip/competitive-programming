package CPDSA.BasicsOfArrayStringGreedyBitManipulation.RangeUpdateQuery;

/*Consider an array A[] of integers and following two types of queries. 

update(l, r, x) : Adds x to all values from A[l] to A[r] (both inclusive).
printArray() : Prints the current modified array.


Time complexity: O(n)
Auxiliary Space: O(n)
*/

public class RangeUpdateQuery {

    // Creates a diff array D[] for A[] and returns
    // it after filling initial values. 
    static void initDiffArray(int a[], int d[]) {
        int n = a.length;

        d[0] = a[0];

        for (int i = 1; i < n; i++) {
            d[i] = a[i] - a[i - 1];
        }
    }
    
    static void update(int d[], int l, int r, int x) {
        d[l] += x;
        d[r + 1] -= x;
    }

    static void printArray(int a[], int d[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = d[i];
            }
            else {
                a[i] = d[i] + d[i - 1];
            }

            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int A[] = { 10, 5, 20, 40 };
        int n = A.length;
        // Create and fill difference Array
        // We use one extra space because
        // update(l, r, x) updates D[r+1]
        int D[] = new int[n + 1];
        initDiffArray(A, D);
 
        // After below update(l, r, x), the
        // elements should become 20, 15, 20, 40
        update(D, 0, 1, 10);
        printArray(A, D);
 
        // After below updates, the
        // array should become 30, 35, 70, 60
        update(D, 1, 3, 20);
        update(D, 2, 2, 30);
         
        printArray(A, D);
    }

}
