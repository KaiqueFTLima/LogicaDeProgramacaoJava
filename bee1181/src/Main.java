import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String letra = sc.next();

        double[][] mat = new double[12][12];
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < 12; j++) {
            soma += mat[x][j];
        }

        if (letra.equals("S")) {
            System.out.printf("%.1f%n", soma);
        } else if (letra.equals("M")) {
            System.out.printf("%.1f%n", soma / 12);
        }

        sc.close();
    }
}
