public class Main {
    public static void main(String args[]) {
        int arr[] = new int[10];

        int marks[] = {40, 50, 60, 70};

        // for(int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        marks[4] = 20;

        for (int x : marks) {
            System.out.println(x);
        }
    }
}