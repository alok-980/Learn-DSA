import java.util.*;

public class CabService {
    String carType;
    double km, bill;

    CabService() {
        this.carType = "";
        this.km = this.bill = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a car type AC or NON-AC: ");
        this.carType = sc.nextLine();

        System.out.println();

        System.out.print("Enter your distance: ");
        this.km = sc.nextDouble();

        System.out.println();
    }

    void calculate() {
        if (this.carType.equals("AC")) {
            if (this.km <= 5) this.bill = 150;
            else this.bill = 150 + (this.km - 5) * 10;
        } else if (this.carType.equals("NON-AC")) {
            if (this.km <= 5) this.bill = 120;
            else this.bill = 120 + (this.km - 5) * 8;
        }
    }

    void display() {
        System.out.println("Car type: " + this.carType);
        System.out.println("Km travelled: " + this.km);
        System.out.println("Total bill: " + this.bill);
    }

    public static void main(String args[]) {
        CabService cab = new CabService();

        cab.accept();
        cab.calculate();
        cab.display();
    }
}