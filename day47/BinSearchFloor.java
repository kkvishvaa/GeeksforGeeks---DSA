// Floor in a Sorted Array
// Difficulty: EasyAccuracy: 33.75%Submissions: 521K+Points: 2Average Time: 30m
// Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

// Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

// Examples

// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
// Output: 1
// Explanation: Largest number less than or equal to 5 is 2, whose index is 1.
// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11
// Output: 4
// Explanation: Largest Number less than or equal to 11 is 10, whose indices are 3 and 4. The index of last occurrence is 4.

public class BinSearchFloor {
    public int findFloor(int[] arr, int x) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }

        }

        return res;
    }
}
