package CPDSA.BasicsOfArrayStringGreedyBitManipulation.MaxMinOfArray;

//Maximum and minimum of an array using Linear search
//Time Complexity: O(n)
//Auxiliary Space: O(1) as no extra space was needed.

public class MaxMinOfArray {

    static class Pair {
        int min;
        int max;
    }
    
    static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();

        //If only one element, return min and max as array element index 0
        if (n == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        //init min and max values
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        
        for (int i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
            else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int size = arr.length;
        Pair minmax = getMinMax(arr, size);

        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }

}
