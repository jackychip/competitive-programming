import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 3/15

public class S3 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.nextToken());
        }

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(str.nextToken());
        }

        // check if possible or not (clear similar adjacent numbers)
        ArrayList<Integer> tempA = new ArrayList<>();
        ArrayList<Integer> tempB = new ArrayList<>();

        //duplicate B to tempB
        for (int i = 0; i < B.length; i++) {
            tempB.add(B[i]);
        }

        //filter A repeats

        int prev = A[0];
        tempA.add(prev);
        for (int i = 1; i < N; i++) {
            int c = A[i];
            if (prev != c) {
                tempA.add(c);
            }
            prev = c;
        }

        for (int i = 0; i < tempB.size(); i++) {
            boolean found = false;
            for (int j = 0; j < tempA.size(); j++) {
                if (tempA.get(j) == -1) {
                    continue;
                }
                if (tempB.get(i) == tempA.get(j)) {
                    found = true;
                    for (int k = 0; k < j; k++) {
                        tempA.set(k, -1);
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        
        System.out.println("YES");

        // solve for swipes (if B[x] is left of A[x], swipe left and vice versa)

        ArrayList<String> swipeCommands = new ArrayList<>(); // store commands

        // left swipes
            
        // loop through B array
        for (int i = 0; i < N; i++) {

            int swipeValue = B[i];
            int swipeTo = -1;
            int swipeFrom = -1;

            // check if they are already in the right spot
            if (B[i] == A[i]) {
                continue;
            }
            else {
                swipeTo = i;
            }

            // loop through A array
            for (int j = i; j < N; j++) {
                if (swipeValue == A[j]) {
                    swipeFrom = j;
                    break;
                }
            }

            if (swipeTo != -1 && swipeFrom != -1) {
                // change A array
                for (int j = swipeTo; j <= swipeFrom; j++) {
                    A[j] = swipeValue;
                }
                swipeCommands.add("L " + swipeFrom + " " + swipeTo);

                // System.out.print("A: ");
                // for (int j = 0; j < N; j++) {
                //     System.out.print(A[j] + " ");
                // }
                // System.out.println();
            }
        }

        // right swipes

        // loop through B array
        for (int i = N - 1; i >= 0; i--) {

            int swipeValue = B[i];
            int swipeTo = -1;
            int swipeFrom = -1;

            if (B[i] == A[i]) {
                break;
            }
            else {
                swipeTo = i;
            }

            // loop through A array
            for (int j = i; j >= 0; j--) {

                if (swipeValue == A[j]) {
                    swipeFrom = j;
                    break;
                }
            }

            if (swipeTo != -1 && swipeFrom != -1) {
                // change A array
                for (int j = swipeFrom; j <= swipeTo; j++) {
                    A[j] = swipeValue;
                }
                swipeCommands.add("R " + swipeFrom + " " + swipeTo);

                // System.out.print("A: ");
                // for (int j = 0; j < N; j++) {
                //     System.out.print(A[j] + " ");
                // }
                // System.out.println();
            }
        }

        System.out.println(swipeCommands.size());
        for (String cmd : swipeCommands) {
            System.out.println(cmd);
        }
    }

}
