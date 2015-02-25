package  com.company;
import java.util.Scanner;

public class Fibonacci {
    private static Scanner interval;

    public Fibonacci() {
    }

    public static void main(String[] args) {
        interval = new Scanner(System.in);
        System.out.print("vvedit n: ");
        int n = interval.nextInt();
        int[] fibonaci = new int[n];
        int max_odd = fibonaci[0];
        int max_event = fibonaci[0];
        fibonaci[0] = 0;
        fibonaci[1] = 1;
        System.out.print(fibonaci[0] + ", ");
        System.out.print(fibonaci[1] + ", ");

        for(int i = 2; i < n; ++i) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
            System.out.print(fibonaci[i] + ", ");
            if(fibonaci[i] % 2 != 0 && max_odd < fibonaci[i]) {
                max_odd = fibonaci[i];
            }

            if(fibonaci[i] % 2 != 1 && max_event < fibonaci[i]) {
                max_event = fibonaci[i];
            }
        }

        System.out.print("max_odd= " + max_odd + ", ");
        System.out.print("max_event= " + max_event);
    }
}
