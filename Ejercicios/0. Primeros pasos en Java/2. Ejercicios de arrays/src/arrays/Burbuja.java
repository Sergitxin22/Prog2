package arrays;

public class Burbuja {

	public static void main(String[] args) {
		int[] array = {7, 2, 10, 5, 3, 6, 1, 9, 4, 8};
		System.out.print("Array antes de ordenarlo: ");
		
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
		System.out.println();
        
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Intercambiar array[j] y array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.print("Array después de ordenarlo: ");
		
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		
        System.out.println();
	}

}
