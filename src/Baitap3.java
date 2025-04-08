public class Baitap3 {
    public static void main(String[] args) {
        boolean isPrime=true;
        for (int n=2; n<=100; n++) {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                System.out.println(n);

            }
        }
    }
}
