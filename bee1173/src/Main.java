import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int[] n = new int[10];

        n[0] = v;

        for (int i = 1; i < 10; i++) {
            n[i] = n[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

        sc.close();
    }
}
