import java.util.Scanner;

public class DrawGeomatry2 {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("print the rectangle");
                for(int i=1;i<=5;i++) {
                    for(int j=1;j<=5;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                case 2:
                    System.out.println("print the square triangle");
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                        System.out.println("print the isosceles triangle");
                        for(int i=1;i<=5;i++) {
                            for(int j=1;j<=5-i;j++) {
                                System.out.print(" ");

                            }
                            for(int j=1;j<=i;j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                        case 0:
                            System.out.println("Exit");
                            break;
                            default:
                                System.out.println("no choice");
                                break;
        }
    }
}
