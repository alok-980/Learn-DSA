import java.util.*;

// Phase 5 : Break / Continue Logic

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to 100, and stop the loop as soon as a number
        // divisible by 17 is encountered.
        // for(int i=1; i<100; i++) {
        //     if(i % 17 == 0) {
        //         break;
        //     } else {
        //         System.out.print(i + " ");
        //     }
        // }

        // 2. Print numbers from 1 to 100, but skip all numbers that are divisible by 5
        // and continue printing the rest.
        // for(int i=1; i<=100; i++) {
        //     if(i % 5 == 0) {
        //         continue;
        //     } else {
        //         System.out.print(i + " ");
        //     }
        // }

        // 3. Take 5 numbers as input, skip any number that is 0 using continue, and
        // calculate the sum of the remaining
        // numbers.
        // int sum = 0;
        // for(int i=1; i<=5; i++) {
        //     int num = sc.nextInt();
            
        //     if(num == 0) {
        //         continue;
        //     } else {
        //         sum += num;
        //     }
        // }
        // System.out.println(sum);

        // 4. Search for a specific number in a list of inputs, and terminate the loop
        // immediately when the number is found.
        // int arr[] = {2, 5, 6, 8, 44, 62};
        // int num = sc.nextInt();

        // boolean found = false;

        // for(int i=0; i<arr.length; i++) {
        //     if(num == arr[i]) {
        //         found = true;
        //         break;
        //     } 
        // }

        // if(found) {
        //     System.out.println("Number Found");
        // } else {
        //     System.out.println("Number Not Found");
        // }

        // 5. Keep taking numbers from the user and print them until a negative number
        // appears, then stop the loop.
        // int num;
        // do {
        //     num = sc.nextInt();
        //     System.out.println("Entered by user: " + num);
        // } while (num >= 0);

        // 6. Skip all odd numbers and print only the even numbers.
        // for(int i=1; i<=100; i++) {
        //     if(i % 2 != 0) {
        //         continue;
        //     } else {
        //         System.out.print(i + " ");
        //     }
        // }

        // 7. Continuously add numbers in a loop and stop the loop when the sum becomes
        // greater than 100.
        // int sum = 0;
        // while (sum < 101) {
        //     sum += sc.nextInt();
        //     System.out.println("Sum is: " + sum);
        // }

    }
}