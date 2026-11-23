public class Main {
    static int insert(int arr[], int n, int idx, int val) {
        if (n == arr.length) {
            System.out.println("Array full!");
            return n;
        }

        if (idx < 0 || idx > n) {
            System.out.println("Invalid index!");
            return n;
        }

        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = val;

        return n + 1;
    }

    static int delete(int arr[], int n, int idx) {
        if (n == 0) {
            System.out.println("Array empty!");
            return n;
        }

        if (idx < 0 || idx >= n) {
            System.out.println("Invalid index");
            return n;
        }

        for (int i = idx; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = 0;

        return n - 1;
    }
    public static void main(String args[]) {
        int arr[] = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        n = insert(arr, n, 2, 25);
        n = delete(arr, n, 5);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}