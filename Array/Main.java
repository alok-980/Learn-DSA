import java.util.*;

public class Main {

    // Print array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // find larget element - liner search - O(n)
    // public static int findLargest(int[] arr) {
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // if (max < arr[i]) {
    // max = arr[i];
    // }
    // }

    // return max;
    // }

    // find target element - Binary search
    // public static int findTarget(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (arr[mid] == target) {
    // return mid;
    // }

    // if (arr[mid] > target) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }

    // return -1;
    // }

    // public static void reverseArray(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;

    // start++;
    // end--;
    // }
    // }

    // Pairs in array
    // public static void printPair(int[] arr) {
    // for(int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
    // }
    // System.out.println();
    // }
    // }

    // public static void printSubArray(int[] arr) {
    // for (int i=0; i<arr.length; i++) {
    // for (int j=i; j<arr.length; j++) {
    // System.out.print("( ");
    // for (int k=i; k<=j; k++) {
    // System.out.print(arr[k] + " ");
    // }
    // System.out.print(")");
    // }
    // System.out.println();
    // }
    // }

    // Max subArray - brute force - O(n*n*n)
    // public static int maxSubArray(int[] arr) {
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // int currSum = 0;
    // for (int k = i; k <= j; k++) {
    // currSum += arr[k];
    // }
    // if (currSum > max) {
    // max = currSum;
    // }
    // }
    // }

    // return max;
    // }

    // Max subArray - better approatch - prefix sum
    // public static int maxSubArray(int[] arr) {
    // int max = Integer.MIN_VALUE;
    // int[] prefix = new int[arr.length];

    // prefix[0] = arr[0];

    // for (int i = 1; i < arr.length; i++) {
    // prefix[i] = prefix[i - 1] + arr[i];
    // }

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {

    // int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

    // if (currSum > max) {
    // max = currSum;
    // }
    // }
    // }

    // return max;
    // }

    // Max subArray - kadanes algo - O(n)
    // public static int kadanes(int[] arr) {
    //     int max = Integer.MIN_VALUE;
    //     int currSum = 0;

    //     boolean isAllElemNeg = true;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > 0) {
    //             isAllElemNeg = false;
    //         }
    //         max = Math.max(max, arr[i]);
    //     }

    //     if (!isAllElemNeg) {
    //         max = Integer.MIN_VALUE;
    //         for (int i = 0; i < arr.length; i++) {
    //             currSum += arr[i];

    //             if (currSum < 0) {
    //                 currSum = 0;
    //             }

    //             if (currSum > max) {
    //                 max = currSum;
    //             }
    //         }
    //     }

    //     return max;
    // }

    // isDistinct array
    // public static boolean isDistinct(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // best time to buy and sell stock
    // public static int maxProfit(int[] prices) {
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for (int i = 0; i < prices.length; i++) {
    //         int sellingPrice = prices[i];

    //         if (buyPrice < sellingPrice) {
    //             int profit = sellingPrice - buyPrice;
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = sellingPrice;
    //         }
    //     }

    //     return maxProfit;
    // }

    // Trapped rain water
    public static int trappedWater(int[] height) {
        int n = height.length;

        // left max
        int[] leftMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // right max
        int[] rightMax = new int[n];

        rightMax[n-1] = height[n-1];
        for(int i=n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;

        // loop
        for (int i = 0; i < n; i++) {
            // water-label
            int waterLabel = Math.min(leftMax[i], rightMax[i]);

            // trapped-water
            trappedWater += waterLabel - height[i];
        }
        
        return trappedWater;
    }

    public static void main(String args[]) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trappedWater(arr));
    }
}