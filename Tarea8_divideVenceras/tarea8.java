public class tarea8 {

	public static int escalones(int n){
		int[]memoria = new int[n+1];
		memoria[0] = 0;
		memoria[1] = 1;
		memoria[2] = 2;
		if(n == 0 || n == 1 || n == 2){
			return n;
		}

		for (int i = 3; i <= n; i++){
			memoria[i] = memoria[i-1] + memoria[i-2] + memoria[i-3];
			System.out.println(memoria[i]);

		}
		return memoria[n];


	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println("Formas de subir "+n +" escalones: " +escalones(n));
	}
}
