public class Main {
    public static void main(String args[]) {
        Pen p1 = new Pen();

        p1.setColor("blue");
        p1.setTip(1);

        p1.color = "yellow";

        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        BankAccount ac1 = new BankAccount();

        ac1.username = "alok_.chauhan";
        ac1.email = "alok.chauhan@gmail.com";
        ac1.setPassword("alok123#");
        ac1.setBalance(15000);

        // System.out.println(ac1.username);
        // System.out.println(ac1.email);
        // System.out.println(ac1.showPassword());
        // System.out.println(ac1.showBalance());

        Student s1 = new Student();
        s1.name = "alok";
        s1.rollNo = 123456;
        s1.mark[0] = 20;
        s1.mark[1] = 30;
        s1.mark[2] = 40;

        Student s4 = new Student(s1);

        System.out.println(s4.name);
        System.out.println(s4.rollNo);

        s1.mark[2] = 100;
        
        for(int i=0; i<3; i++) {
            System.out.println(s4.mark[i]);
        }

        Student s2 = new Student("alok");
        Student s3 = new Student(123);

        // System.out.println(s2.name);
        // System.out.println(s3.rollNo);
    }
}

class Student {
    String name;
    int rollNo;
    int mark[];

    Student() {
        mark = new int[3];
        System.out.println("non-parameterized");
    }

    // sallow copy
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.mark = s1.mark;
    // }

    // deep copy
    Student(Student s1) {
        mark = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<3; i++) {
            this.mark[i] = s1.mark[i];
        }
    }

    Student(String name) {
        mark = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
        mark = new int[3];
        this.rollNo = rollNo;
    }
}

class BankAccount {
    public String username;
    public String email;
    private String password;
    private int balance;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int showBalance() {
        return this.balance;
    }

    public String showPassword() {
        return this.password;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}