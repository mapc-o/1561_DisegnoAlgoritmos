public class tarea8 {

	public static int escalones(int n) {
		int[] memoria = new int[n + 1]; // T(n) = 1
		memoria[0] = 0; // T(n) = 1
		memoria[1] = 1; // T(n) = 1
		memoria[2] = 2; // T(n) = 1
		if (n == 0 || n == 1 || n == 2) {
			return n; // T(n) = 1
		}

		for (int i = 3; i <= n; i++) {
			memoria[i] = memoria[i - 1] + memoria[i - 2] + memoria[i - 3];
			System.out.println(memoria[i]); // T(n) = 2n

		}
		return memoria[n]; // T(n) = 1

		//T(n) = 1+1+1+1+1+2n+1
		//T(n) = 2n + 6
		//T(n) = 2n
		//O(n)

	}

	public static void main(String[] args) {
		int n = 8;	//O(1)
		System.out.println("Formas de subir " + n + " escalones: " + escalones(n));	//O(n)
	}
}
