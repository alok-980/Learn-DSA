import java.util.*;

public class Main {

    // Pair sum - brute force approach - TC = O(n) & SC = O(n)
    public static int[] pairSum(int[] arr, int target) {
        int pair[] = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                }
            }
        }

        return pair;
    }

    // Pair sum better approatch - id array sorted - TC = O(n) & SC = O(1)
    public static int[] pairSumBetter(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int ps = arr[i] + arr[j];

            if (ps == target) {
                return new int[] { i, j };
            } else if (target > ps) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] { -1, -1 };
    }

    // Majority element - brute force approatch - TC = O(n) & SC = O(1)
    public static int majorityElementBrute(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
    int freq = 0;
    for (int j = 0; j < nums.length; j++) {
    if (nums[i] == nums[j]) {
    freq++;
    }
    }
    if (freq > nums.length / 2) {
    return nums[i];
    }
    }

    return -1;
    }

    // Majority element - optimized approatch - TC = O(n log n) & SC = O(1)
    public static int majorityElementOptimized(int[] arr) {
        int freq = 1;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                freq = 1;
            }

            if (freq > arr.length / 2) {
                return arr[i];
            }
        }

        return -1;
    }

    // Majority element - moore's algo - TC = O(n) & SC = O(1)
    public static int majorityElementMoore(int[] arr) {
        int freq = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
            }

            if (ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        return ans;
    }

    // Merge two sorted array
    public static void mergeSortedArray(int arr1[], int m, int arr2[], int n) {
        int idx = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        
        while (i >= 0 && j >= 0) {
            if (arr1[i] <= arr2[j]) {
                arr1[idx--] = arr2[j--];
            }
            else {
                arr1[idx--] = arr1[i--];
            }
        }

        while (j >= 0) {
            arr1[idx--] = arr2[j--];
        }
    }

    public static void main(String args[]) {
        int[] arr1 = {2, 5, 6, 0, 0, 0};
        int[] arr2 = {4, 7, 9};

        int m = 3;
        int n = 3;

        mergeSortedArray(arr1, m, arr2, n);

        System.out.println(Arrays.toString(arr1));
    }
}