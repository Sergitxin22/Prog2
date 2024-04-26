package primerosPasos;

public class Series {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 1000; i++) {
			System.out.print((i + 1) + " ");
		}
		
		System.out.println();
		
		for (int i = 20; i <= 500; i = i+10) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
