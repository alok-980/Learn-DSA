import java.util.*;

// Phase 4 : Nested Loop Logic
// 1. Print the multiplication tables for all numbers from 1 to 10.
// public class Main {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 10; i++) {
//             System.out.println("Table of: " + i);

//             for(int j = 1; j <= 10; j++) {
//                 System.out.println(i + " x " + j + " = " + i * j);
//             }

//             System.out.println();
//         }
//     }
// }

// 2. Print all possible pairs (i, j) where both i and j range from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i = 1; i <= num; i++) {
//             for(int j = 1; j <= num; j++) {
//                 System.out.println(i + ", " + j);
//             }
//             System.out.println();
//         }
//     }
// }

// 3. For every number from 1 to n, count and print the total number of its factors.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             System.out.print("Factor of " + i + " is: ");
//             for(int j=1; j<=i; j++) {
//                 if(i % j == 0) {
//                     System.out.print(j + " ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

// 4. Print all prime numbers up to n using nested loop checking.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=2; i<=num; i++) {
//             Boolean isPrime = true;
//             int j = 2;
//             while (j < i) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                 }
//                 j++;
//             }

//             if(isPrime) {
//                 System.out.println(i + " - Prime");
//             } else {
//                 System.out.println(i + " - Not Prime");
//             }
//         }
//     }
// }

// 5. Print the Fibonacci pattern row by row, where each row prints the next Fibonacci numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int prev = 0;
//         int curr = 1;

//         for (int j = 1; j <= num; j++) {
//             for (int i = 1; i <= j; i++) {
//                 System.out.print(prev + " ");

//                 int next = prev + curr;
//                 prev = curr;
//                 curr = next;
//             }
//             System.out.println();
//         }
//     }
// }

// 6. Generate and print a number triangle pattern using nested loops.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 7. Print a matrix, then calculate and display the sum of each row and the sum
// of each column.
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int num = 1;
        int[] colSum = new int[col];

        for (int i = 1; i <= row; i++) {
            int rowSum = 0;

            for (int j = 1; j <= col; j++) {
                rowSum += num;
                colSum[j - 1] += num;
                num++;
            }

            System.out.println("Row Sum = " + rowSum);
        }

        System.out.println("Column Sums:");

        for (int j = 0; j < col; j++) {
            System.out.println("Column " + (j + 1) + " = " + colSum[j]);
        }
    }
}

// 8. Print all Pythagorean triplets whose values are less than or equal to n.