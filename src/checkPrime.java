import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number <2) {
            System.out.println(number + " is not a prime number");
        }else{
            int i=2;
            boolean flag=true;
            while(i<Math.sqrt(number)) {
                if(number%i==0) {
                    flag=false;
                    break;
                }i++;
            }if(flag) {
                System.out.println(number + " is a prime number");
            }else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
