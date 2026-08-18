package Logic_Building_Do_While_Loop;
import java.util.*;

import javax.sound.midi.SysexMessage;

// Phase 2 : do - While Loop
// 1. Print all numbers from 1 to 10.
// public class Main {
//     public static void main(String args[]) {
//         int i = 1;

//         do {
//             System.out.print(i + " ");
//             i++;
//         } while(i <= 10);
//     }
// }

// 2. Print the multiplication table of a given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 1;

//         do {
//             System.out.println(num + " x " + i + " = " + num*i);
//             i++;
//         } while(i <= 10);
//     }
// }

// 3. Keep taking numbers from the user until 0 is entered, then print the sum of all entered numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int sum = 0;
//         int num;

//         do {
//             num = sc.nextInt();
//             sum += num;
//         } while(num != 0);

//         System.out.println(sum);
//     }
// }

// 4. Keep taking numbers from the user until 0 is entered, then print the largest number among all inputs.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int max = Integer.MIN_VALUE;
//         int num;

//         do {
//             num = sc.nextInt();
//             if (num > max) {
//                 max = num;
//             }
//         } while(num != 0);

//         System.out.println(max);
//     }
// }

// 5. Count and print the number of digits in the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int count = 0;

//         do {
//             num /= 10;
//             count++;
//         } while(num > 0);

//         System.out.println(count);
//     }
// }

// 6. Reverse the given number and print the reversed value.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int rev = 0;

//         do {
//             int dig = num % 10;
//             rev = (rev * 10) + dig;
//             num /= 10;
//         } while(num > 0);

//         System.out.println(rev);
//     }
// }

// 7. Check whether the given number is a palindrome.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int copy = num;
//         int rev = 0;

//         do {
//             int dig = num % 10;
//             rev = (rev * 10) + dig;
//             num /= 10;
//         } while(num > 0);

//         if(rev == copy) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// 8. Check whether the given number is an Armstrong number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int copy = num;
//         int copy2 = num;
//         int count = 0;

//         do {
//             count++;
//             copy /= 10;
//         } while(copy > 0);

//         int sum = 0;
//         do {
//             int dig = num % 10;
//             int i = 1;
//             int digSum = 1;
//             do {
//                 digSum *= dig;
//                 i++;
//             } while(i <= count);
//             sum += digSum;
//             num /= 10;
//         } while (num > 0);

//         System.out.println(sum + " == " + copy2);

//         if(sum == copy2) {
//             System.out.println("Armstrong Number");
//         } else {
//             System.out.println("Not Armstrong Number");
//         }
//     }
// }

// 9. Calculate and print the factorial of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         int i = 1;
//         int fact = 1;

//         do {
//             fact *= i;
//             i++;
//         } while(i <= num);

//         System.out.println(fact);
//     }
// }

// 10. Print the Fibonacci series up to the required number of terms.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int prev = 0;
//         int curr = 1;

//         String str = "0 1 ";

//         int i = 2;
//         do {
//             int sum = prev + curr;
//             str += sum + " ";
//             prev = curr;
//             curr = sum;
//             i++;
//         } while(i < num);

//         System.out.println(str);
//     }
// }

// 11. Find the HCF (Highest Common Factor) of the given numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num;
//         if(num1 > num2) {
//             num = num1;
//         } else {
//             num = num2;
//         }

//         int i = 1;

//         int HCF = 0;

//         do {
//             if(num1 % i == 0 && num2 % i == 0) {
//                 HCF = i;
//             }
//             i++;
//         } while(i <= num/2);

//         System.out.println(HCF);
//     }
// }

// 12. Create a menu-driven program that allows the user to choose and perform different operations.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Choose 1 - +, 2 - -, 3 - *, 4 - /, = ");
//         int num = sc.nextInt();
//         if(num < 1 || num > 4) {
//             System.out.println("you choosen incorrect option!");
//             return;
//         }

//         System.out.print("Enter your number1 : ");
//         int a = sc.nextInt();

//         System.out.println("");
//         System.out.print("Enter your num2 : ");
//         int b = sc.nextInt();

//         switch (num) {
//             case 1: System.out.println(a + b);
                
//                 break;

//             case 2: System.out.println(a - b);
                
//                 break;

//             case 3: System.out.println(a * b);
                
//                 break;

//             case 4: System.out.println(a / b);
                
//                 break;
        
//             default:
//                 break;
//         }
//     }
// }

// 13. Keep taking numbers from the user until a negative number is entered, then count how many positive
// numbers were entered.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num;
//         int count = 0;
//         do {
//             num = sc.nextInt();
//             count++;
//         } while(num >= 0);

//         System.out.println(count);
//     }
// }

// 14. Find and print the sum of digits of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;
//         do {
//             int dig = num % 10;
//             sum += dig;
//             num /= 10;
//         } while(num > 0);

//         System.out.println(sum);
//     }
// }

// 15. Calculate and print the sum of even digits and the sum of odd digits of the given number separately
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             int dig = num % 10;

//             if (dig % 2 == 0) {
//                 evenSum += dig;
//             } else {
//                 oddSum += dig;
//             }

//             num /=10;
//         } while(num > 0);

//         System.out.println("Even sum : " + evenSum);
//         System.out.println("Odd sum : " + oddSum);
//     }
// }