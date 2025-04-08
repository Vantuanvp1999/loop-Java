import java.util.Scanner;

public class interestCaculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.01;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double total=0;
        for(int i=0;i<month;i++) {
            total+=money*(interestRate/100)/12*month;
        }
        System.out.println("total of interest: "+total);
    }
}
