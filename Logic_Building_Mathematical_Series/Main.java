import java.util.*;

// Phase 6 : Mathematical Series

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Find and print the sum of the first n natural numbers.
        // int num = sc.nextInt();
        // 1st way to solve
        // int sum = 0;
        // for(int i=1; i<=num; i++) {
        // sum += i;
        // }

        // 2nd way to solve
        // int sum = (num * (num + 1)) / 2;
        // System.out.println(sum);

        // 2. Find and print the sum of the first n even numbers.
        // int num = sc.nextInt();

        // 1st way to calculate
        // int sum = 0;
        // int count = 0;
        // int i = 1;
        // do {
        // if(i % 2 == 0) {
        // sum += i;
        // count++;
        // }
        // i++;
        // } while (count < num);
        // System.out.println(sum);

        // 2nd way to calculate
        // int sum = num * (num + 1);
        // System.out.println(sum);

        // 3. Find and print the sum of the first n odd numbers.
        // int num = sc.nextInt();

        // int sum = 0;
        // int count = 0;
        // int i = 1;
        // do {
        // if(i % 2 != 0) {
        // sum += i;
        // count++;
        // }
        // i++;
        // } while (count < num);
        // System.out.println(sum);

        // int sum = num * num;
        // System.out.println(sum);

        // 4. Print the first n terms of an arithmetic progression for the given first
        // term and common difference.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++) {
        // System.out.print(a + " ");
        // a += b;
        // }

        // 5. Print the first n terms of a geometric progression for the given first
        // term and common ratio.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++) {
        // System.out.print(a + " ");
        // a *= b;
        // }

        // 6. Print the Fibonacci series up to the required number of terms.
        // int term = sc.nextInt();

        // int prev = 0;
        // int curr = 1;

        // for(int i=1; i<=term; i++) {
        // System.out.print(prev + " ");

        // int next = prev + curr;
        // prev = curr;
        // curr = next;
        // }

        // 7. Find and print the sum of the Fibonacci series up to the required number
        // of terms.
        // int term = sc.nextInt();

        // int prev = 0;
        // int curr = 1;

        // int sum = 0;
        // for(int i=1; i<=term; i++) {
        // sum += prev;

        // int next = prev + curr;
        // prev = curr;
        // curr = next;
        // }
        // System.out.println(sum);

        // 8. Calculate and print the value of the series: 1² + 2² + 3² + … + n².
        // int num = sc.nextInt();

        // int sum = 0;

        // for(int i=1; i<=num; i++) {
        // int sqr = i * i;

        // sum += sqr;
        // }

        // System.out.println(sum);

        // 9. Calculate and print the value of the series: 1³ + 2³ + 3³ + … + n³.
        // int num = sc.nextInt();

        // int sum = 0;

        // for(int i=1; i<=num; i++) {
        // int cub = i * i * i;

        // sum += cub;
        // }

        // System.out.println(sum);

        // 10. Calculate and print the value of the series: 1 + 1/2 + 1/3 + … + 1/n.
        // int num = sc.nextInt();

        // double sum = 0;

        // for(int i=1; i<=num; i++) {
        // double res = 1.0/i;

        // sum += res;
        // }

        // System.out.println(sum);

        // 11. Print the series of powers of two: 1 + 2 + 4 + 8 + … + 2ⁿ.
        // int num = sc.nextInt();

        // int pow = 1;

        // for(int i=0; i<=num; i++) {
        // System.out.print(pow + " ");

        // pow *= 2;
        // }

        // 12. Calculate and print the value of the series: 1! + 2! + 3! + … + n!.
        // int num = sc.nextInt();

        // int fact = 1;
        // int sum = 0;

        // for(int i=1; i<=num; i++) {
        // fact *= i;
        // sum += fact;
        // }

        // System.out.println(sum);

        // 13. Calculate and print the value of the series: 1 + x + x² + x³ + … + xⁿ.
        // int x = sc.nextInt();
        // int n = sc.nextInt();

        // int sum = 0;
        // int power = 1;

        // for (int i = 0; i <= n; i++) {
        //     sum = sum + power;
        //     power = power * x;
        // }

        // System.out.println(sum);
    }
}