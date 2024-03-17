package primerosPasos;

public class Series {

	public static void main(String[] args) {
		int numeroMaximo = 10;
		
		for (int i = 1; i <= numeroMaximo; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		numeroMaximo = 1000;
		for (int i = 1; i <= numeroMaximo; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		numeroMaximo = 500;
		for (int i = 20; i <= numeroMaximo; i+= 10) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		int numeroMinimo = 0;
		for (int i = 10; i >= numeroMinimo; i--) {
			System.out.print(i + " ");
		}

	}

}
