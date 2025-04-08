public class In20snt {
    public static void main(String[] args) {
        int count=0;
        int n = 2;
        boolean isPrime = true;
        while (count < 20) {

        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                isPrime = false;
                break;
            }
            isPrime = true;
        }
        if (isPrime) {
            count++;
            System.out.println(n);
        }
        n++;
        }
    }
}
