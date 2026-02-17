import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempoSegundos = sc.nextInt();
		
		int tempoMinutos = tempoSegundos / 60;
		
		int tempoHoras = tempoMinutos / 60;
		
		int tempoSegundosFinal = tempoSegundos - tempoMinutos * 60;
		
		int tempoMinutosFinal = tempoMinutos - tempoHoras * 60;
		
		System.out.println( tempoHoras + ":" + tempoMinutosFinal + ":" + tempoSegundosFinal );
		
		sc.close();
	}

}
