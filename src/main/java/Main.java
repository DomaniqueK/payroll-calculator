import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        myScanner.nextLine();
        String name;

        System.out.print("Hours worked this week: ");
        name = myScanner.nextLine();

        float hoursWorked = Float.parseFloat(name);

        System.out.print("Employee pay rate: ");
        name = myScanner.nextLine();

        float payRate = Float.parseFloat(name);

        float grossPay = hoursWorked * payRate;

        System.out.printf("Employee's current gross pay is: %f x %f = $%f", hoursWorked, payRate, grossPay);

    }
}
