import java.util.*;
//Phase 1 : While Loop

// 1. Print all numbers from 1 to 10 using a loop.
// public class Main {
//     public static void main(String args[]) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// 2. Print numbers from 10 down to 1 in reverse order.
// public class Main {
//     public static void main(String args[]) {
//         int i = 10;
//         while (i >= 1) {
//             System.out.println(i);
//             i--;
//         }
//     }
// }

// 3. Print all even numbers between 1 and 100.
// public class Main {
//     public static void main(String args[]) {
//         int i = 1;
//         while (i <= 100) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//             i++;
//         }
//     }
// }

// 4. Print all odd numbers between 1 and 100.
// public class Main {
//     public static void main(String args[]) {
//         int i = 1;
//         while (i <= 100) {
//             if(i % 2 != 0) System.out.print(i + " ");
//             i++;
//         }
//     }
// }

// 5. Print the multiplication table of a given number from n × 1 to n × 10.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 1;
//         while (i <= 10) {
//             System.out.println(num + " x " + i + " = " + num*i);
//             i++;
//         }
//     }
// }

// 6. Calculate and print the sum of the first n natural numbers.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         int i = 1;
//         while (i <= num) {
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum of n natural numbers: "+ sum);
//     }
// }

// 7. Calculate the sum of all even numbers from 1 up to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         int i = 1;
//         while (i <= num) {
//             if (i % 2 == 0) {
//                 sum += i;
//             }
//             i++;
//         }

//         System.out.println(sum);
//     }
// }

// 8. Calculate the sum of all odd numbers from 1 up to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         int i = 1;
//         while (i <= num) {
//             if (i % 2 != 0) {
//                 sum += i;
//             }
//             i++;
//         }

//         System.out.println(sum);
//     }
// }

// 9. Calculate and print the factorial of a given number.

// The factorial of a number n means multiplying that number by all the positive numbers smaller than it, down to 1.
// 5! = 5 × 4 × 3 × 2 × 1 = 120

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int fact = 1;

//         int i = 1;
//         while(i <= num) {
//             fact *= i;
//             i++;
//         }

//         System.out.println(fact);
//     }
// }

// 10. Find and print the product of all digits of a given number.

// Take a number, separate its digits, multiply all those digits together, and print the result.
// Example 1
// Suppose the given number is:
// 1234
// Its digits are:
// 1, 2, 3, 4
// Now multiply them:
// 1 × 2 × 3 × 4 = 24

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 1;

//         while (num > 0) {
//             int dig = num % 10;
//             sum *= dig;
//             num /= 10;
//         }

//         System.out.println(sum);
//     }
// }

// 11. Count and print the total number of digits in a given number.
// Take a number and find out how many digits it contains.
// Example 1
// Suppose the number is:
// 12345
// The digits are:
// 1, 2, 3, 4, 5
// There are 5 digits.
// So the answer is:
// 5

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int count = 0;

//         while (num > 0) {
//             num /= 10;
//             count++;
//         }

//         System.out.println(count);
//     }
// }

// 12. Reverse the given number and print the reversed value.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int revNum = 0;

//         while (num > 0) {
//             int dig = num % 10;
//             revNum = (revNum * 10) + dig;
//             num /= 10;
//         }

//         System.out.println(revNum);
//     }
// }

// 13. Check whether the given number is a palindrome.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int copy = num;
//         int revNum = 0;

//         while (num > 0) {
//             int dig = num % 10;
//             revNum = (revNum * 10) + dig;
//             num /= 10;
//         }

//         if(revNum == copy) {
//             System.out.println("Palindrom");
//         } else {
//             System.out.println("Not Palindrom");
//         }
//     }
// }

// 14. Find and print the sum of digits of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         while (num > 0) {
//             int dig = num % 10;
//             sum += dig;
//             num /= 10;
//         }

//         System.out.println(sum);
//     }
// }

// 15. Check whether the given number is an Armstrong number.
// Each digit is raised to the power of the total number of digits, and then all those values are added. The result must equal the original number.
// Example: 153
// 153 has 3 digits.
// So we take each digit and raise it to the power 3:
// 1³ + 5³ + 3³
// Calculate:
// 1 × 1 × 1 = 1
// 5 × 5 × 5 = 125
// 3 × 3 × 3 = 27
// Now add:
// 1 + 125 + 27 = 153
// The result is exactly the original number:
// 153 = 153

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int copy = num;

//         int count = 0;
//         while (copy > 0) {
//             copy /= 10;
//             count++;
//         }

//         int copyNum = num;
//         int aNum = 0;

//         while (num > 0) {
//             int dig = num % 10;
//             int pDig = 1;
//             int i = 1;
//             while (i <= count) {
//                 pDig *= dig;
//                 i++;
//             }
//             aNum += pDig;
//             num /= 10;
//         }
//         System.out.println(copyNum + " == " + aNum);

//         if (copyNum == aNum) {
//             System.out.println("Armstrong Number");
//         } else {
//             System.out.println("Not an Armstrong Number");
//         }
//     }
// }

// 16. Check whether the given number is a Perfect number.
// The sum of all its factors (except the number itself) is equal to the original number.
// Example: 6
// Let's find the factors of 6.
// Factors of 6 are:
// 1, 2, 3, 6
// But we don't include the number itself (6).
// So we add:
// 1 + 2 + 3 = 6
// The result is equal to the original number.
// Therefore:
// ✅ 6 is a Perfect number.

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         int i = 1;
//         while (i < num) {
//             if(num % i == 0) {
//                 sum += i;
//             }
//             i++;
//         }

//         if (sum == num) {
//             System.out.println(num + " is a Perfect number");
//         } else {
//             System.out.println(num + " is not a Perfect number");
//         }
//     }
// }

// 17. Print all prime numbers between 1 and 100.
// A prime number is a number that can be divided exactly by only 1 and itself.
// For example:
// 2 → divisible by 1 and 2 ✅
// 3 → divisible by 1 and 3 ✅
// 5 → divisible by 1 and 5 ✅
// 7 → divisible by 1 and 7 ✅

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 2;
//         while (i <= num) {
//             boolean isPrime = true;
//             int j = 2;
//             while (j < i) {
//                 if(i % j == 0) isPrime = false;
//                 j++;
//             }
//             if(isPrime) System.out.println(i);
//             i++;
//         }
//     }
// }


// 18. Check whether the given number is a prime number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 2;
//         while (i < num) {
//             if (num % i == 0) {
//                 System.out.println(num + " is Not a prime number.");
//                 return;
//             }
//             i++;
//         }
//         System.out.println(num + " is a prime number.");
//     }
// }

// 19. Print the Fibonacci series up to n terms.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int prev = 0;
//         int next = 1;

//         System.out.print(prev + " " + next + " ");

//         int i = 2;
//         while (i < num) {
//             int res = prev + next;
//             System.out.print(res + " ");
//             prev = next;
//             next = res;
//             i++;
//         }
//     }
// }

// 20. Find and print the sum of the Fibonacci series up to n terms.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int prev = 0;
//         int curr = 1;

//         int sum = prev + curr;

//         int i = 2;
//         while (i < num) {
//             int next = prev + curr;
//             sum += next;
//             prev = curr;
//             curr = next;
//             i++;
//         }

//         System.out.println(sum);
//     }
// }

// 21. Print the square of each number from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 1;
//         while (i <= num) {
//             System.out.println(i * i);
//             i++;
//         }
//     }
// }

// 22. Print the cube of each number from 1 to n.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 1;
//         while (i <= num) {
//             System.out.println(i * i * i);
//             i++;
//         }
//     }
// }

// 23. Print all numbers between a and b that are divisible by 7.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         while (a <= b) {
//             if (a % 7 == 0) {
//                 System.out.println(a);
//             }
//             a++;
//         }
//     }
// }

// 24. Print all factors of the given number.
// Koi number factor hai agar woh given number ko completely divide karta hai, yani remainder 0 aata hai.
// Example: 12
// Humein 12 ke factors find karne hain.
// Check karo:
// 12 ÷ 1 = 12   ✅
// 12 ÷ 2 = 6    ✅
// 12 ÷ 3 = 4    ✅
// 12 ÷ 4 = 3    ✅
// 12 ÷ 5 = 2.4  ❌
// 12 ÷ 6 = 2    ✅
// 7, 8, 9, 10, 11 divide nahi karte

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int i = 1;
//         while (i <= num/2) {
//             if (num % i == 0) {
//                 System.out.print(i + " ");
//             }
//             i++;
//         }
//         System.out.print(num);
//     }
// }


// 25. Find and print the sum of all factors of the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;

//         int i = 1;
//         while (i <= num/2) {
//             if (num % i == 0) {
//                 sum += i;
//             }

//             i++;
//         }

//         System.out.println(sum + num);
//     }
// }


// 26. Find the HCF (Highest Common Factor) of two given numbers.
// Pehle dono ke factors nikalo.
// 12 ke factors:
// 1, 2, 3, 4, 6, 12
// 18 ke factors:
// 1, 2, 3, 6, 9, 18
// Ab jo common factors hain:
// 1, 2, 3, 6
// Inmein sabse bada hai:
// 6

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int HCF = 0;

//         int i = 1;
//         while (i <= num2/2) {
//             if(num1 % i == 0 && num2 % i == 0) {
//                 HCF = i;
//             }
//             i++;
//         }

//         System.out.println(HCF);
//     }
// }

// 27. Find the LCM (Least Common Multiple) of two given numbers.
// Pehle dono ke multiples dekho:
// 4 ke multiples:
// 4, 8, 12, 16, 20, 24...
// 6 ke multiples:
// 6, 12, 18, 24...
// Common multiples:
// 12, 24...
// Inmein sabse chhota:
// 12
// Therefore:
// LCM = 12

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int i;

//         if(num1 < num2) {
//             i = num1;
//         } else {
//             i = num2;
//         }

//         while (true) {
//             if (i % num1 == 0 && i % num2 == 0) {
//                 System.out.println(i);
//                 break;
//             }
//             i++;
//         }
//     }
// }

// 28. Find the smallest digit in the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         long num = sc.nextInt();

//         long sNum = Integer.MAX_VALUE;

//         while (num > 0) {
//             long dig = num % 10;
//             if(sNum > dig) {
//                 sNum = dig;
//             }
//             num /= 10;
//         }

//         System.out.println(sNum);
//     }
// }


// 29. Find the largest digit in the given number.
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         long num = sc.nextInt();

//         long lNum = Integer.MIN_VALUE;

//         while (num > 0) {
//             long dig = num % 10;
//             if (lNum < dig) {
//                 lNum = dig;
//             }
//             num /= 10;
//         }

//         System.out.println(lNum);
//     }
// }