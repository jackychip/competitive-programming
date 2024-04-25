package CPDSA.BasicsOfArrayStringGreedyBitManipulation.ReverseAnArray;

//Given an array (or string), the task is to reverse the array/string.
//Time Complexity: O(n)
//Auxiliary Space: O(1)

public class ReverseAnArray {

    //prints array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //reverse array function
    static void reverseArray(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);

    }
}
