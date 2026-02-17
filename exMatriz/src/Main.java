import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int matriz[][] = new int[m][n];
		
		for (int l = 0; l < m; l++) {
			for (int c = 0; c < n; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		for (int l = 0; l < m; l++) {
			for (int c = 0; c < n; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
