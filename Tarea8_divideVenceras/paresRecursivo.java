public class paresRecursivo {
	public static int[] pares(int[] arr) {
		int i, j;	//T(n) = 1
		i = j = arr.length -1;	//T(n) = 1
		int producto, a, b;	//T(n) = 1
		producto = a = b = 0;	//T(n) = 1
		return paresRecursivo(arr, i, j, producto, 0, 0);	//T(n) = n^2
		//T(n) = n^2 + 4
		//T(n) = n^2
		//O(n^2)

	}

	private static int[] paresRecursivo(int[] arr, int i, int j, int producto, int a, int b){
    	if(i < 0){
    		return new int[]{a, b};	//T(n) = 1

    	}

		//T(n) = n
    	if(j < 0){
    		return paresRecursivo(arr, i-1, arr.length-1, producto, a, b);

    	}

		//T(n) = n
    	if (i != j) {
    		int nuevo = arr[i] * arr[j];
    		if(producto < nuevo){
    			producto = nuevo;
    			a = arr[i];
    			b = arr[j];

    		}
    		
    	}

    	return paresRecursivo(arr, i, j-1, producto, a, b);	//T(n) = n^2
    }

	public static void main(String[] args) {
		int[] arr = { -9, 3, 5, -2, 9, -7, 4, 8, 6, -100, 200, 77, 0 };
		int[] info = pares(arr);
		System.out.println("La pareja más alta de números es: " + info[0] + "," + info[1]);

	}
}
