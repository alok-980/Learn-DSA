import java.util.*;

// Phase 3 : For Loop
// 1. Print all numbers from 1 to 10.
// public class Main {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 10; i++) {
//             System.out.print(i + " ");
//         }
//     }
// }

// 2. Print numbers from 10 down to 1 in reverse order.
// public class Main {
//     public static void main(String args[]) {
//         for(int i = 10; i >= 1; i--) {
//             System.out.print(i + " ");
//         }
//     }
// }

// 3. Print all even numbers between 1 and 100.
// public class Main {
//     public static void main(String args[]) {
//         for(int i = 1; i <= 100; i++) {
//             if(i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// 4. Print all odd numbers between 1 and 100.
// public class Main {
//     public static void main(String args[]) {
//         for(int i=1; i<=100; i++) {
//             if(i % 2 != 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// 5. Print the multiplication table of a given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=10; i++) {
//             System.out.println(num + " x " + i + " = " + num * i);
//         }
//     }
// }

// 6. Calculate and print the factorial of a given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int fact = 1;
//         for(int i=1; i<=num; i++) {
//             fact *= i;
//         }

//         System.out.println("Factorial of " + num + " is: " + fact);
//     }
// }

// 7. Calculate and print the factorial of every number from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         for(int i=1; i<=10; i++) {
//             int fact = 1;
//             for(int j=1; j<=i; j++) {
//                 fact *= j;
//             }
//             System.out.println("Fact of " + i + " = " + fact);
//         }
//     }
// }

// 8. Print all prime numbers between 1 and 100.
// public class Main {
//     public static void main(String args[]) {
//         for(int i=2; i<=100; i++) {
//             Boolean isPrime = true;
//             for(int j=2; j<i; j++) {
//                 if(i % j == 0) {
//                     isPrime = false;
//                 }
//             }
//             if(isPrime) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// 9. Check whether the given number is a prime number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         Boolean isPrime = true;
//         for(int i=2; i<num; i++) {
//             if(num % i == 0) {
//                 isPrime = false;
//             }
//         }

//         if (isPrime) {
//             System.out.println(num + " is a Prime number.");
//         } else {
//             System.out.println(num + " is not a Prime number.");
//         }
//     }
// }

// 10. Print the Fibonacci series up to the required number of terms.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         System.out.print(0 + " " + 1 + " ");
//         int prev = 0;
//         int curr = 1;

//         for(int i=2; i<num; i++) {
//             int next = prev + curr;
//             System.out.print(next + " ");
//             prev = curr;
//             curr = next;
//         }
//     }
// }

// 11. Find and print the sum of the Fibonacci series.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int prev = 0;
//         int curr = 1;
//         int sum = 1;

//         for(int i=2; i<num; i++) {
//             int next = prev + curr;
//             sum += next;
//             prev = curr;
//             curr = next;
//         }

//         System.out.println(sum);
//     }
// }

// 12. Print all factors of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num/2; i++) {
//             if(num % i == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// 13. Find and print the sum of all factors of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         for(int i=1; i<=num/2; i++) {
//             if(num % i == 0) {
//                 sum += i;
//             }
//         }

//         System.out.println(sum);
//     }
// }

// 14. Find the HCF (Highest Common Factor) of the given numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int num = num1;
//         if(num2 > num1) {
//             num = num2;
//         }

//         int HCF = 0;

//         for(int i=1; i<=num; i++) {
//             if(num1 % i == 0 && num2 % i == 0) {
//                 HCF = i;
//             }
//         }

//         System.out.println(HCF);
//     }
// }

// 15. Find the LCM (Least Common Multiple) of the given numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int num = num2;
//         if(num1 < num2) {
//             num = num1;
//         }

//         int LCM = 0;

//         for(int i=num; true; i++) {
//             if(i % num1 == 0 && i % num2 == 0) {
//                 LCM = i;
//                 break;
//             }
//         }

//         System.out.println(LCM);
//     }
// }

// 16. Print the square of each number from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             System.out.print(i * i + " ");
//         }
//     }
// }

// 17. Print the cube of each number from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             System.out.print(i * i * i + " ");
//         }
//     }
// }

// 18. Print all numbers between a and b that are divisible by 7.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for(int i=a; i<=b; i++) {
//             if(i % 7 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }