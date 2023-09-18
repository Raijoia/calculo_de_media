public class ExemplosBasicos {
	public static void main (String [] args) {
		int cont = 1;
		int cont2 = 1;

		System.out.println("while: ");
		while (cont <= 10) {
			System.out.print(cont + " ");
			cont++;
		}

		System.out.println("do/while: ");
		do {
			System.out.print(cont2 + " ");
			cont2++;
		} while (cont2 <= 10);

		System.out.println("for: ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
}