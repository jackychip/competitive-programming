package CCC2017;

import java.util.*;

public class S2HighTideLowTide{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        sc.nextLine();

        //solve
        Arrays.sort(array);

        int hSize = N / 2;
        int lSize = N - N / 2;

        int index = 0;

        int[] highTide = new int[hSize];
        int[] lowTide = new int[lSize];

        for (int i = lSize - 1; i >= 0; i--) {
            lowTide[index] = array[i];
            index++;
        }

        index = 0;

        for (int i = lSize; i < N; i++) {
            highTide[index] = array[i];
            index++;
        }

        int hIndex = 0, lIndex = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                array[i] = lowTide[lIndex];
                lIndex++;
            }
            else {
                array[i] = highTide[hIndex];
                hIndex++;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

    }

}