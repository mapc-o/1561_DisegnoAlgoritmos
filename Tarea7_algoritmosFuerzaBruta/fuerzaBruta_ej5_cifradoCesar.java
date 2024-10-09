public class fuerzaBruta_ej5_cifradoCesar {
	public static String cifrar(String texto, int key) {
		String abc = "abcdefghijklmnopqrstuvwxyz";	//T(n) = 1
		String cesar = "";	//T(n) = 1

		for (int i = 0; i < texto.length(); i++) {
			int pos = abc.indexOf(texto.charAt(i));
			if (pos >= 0) {
				cesar += abc.charAt((pos + key) % abc.length());

			} else {
				cesar += texto.charAt(i);	//T(n) = 2n
			}

		}
		return cesar;	//T(n) = 1

		//T(n) = 1 +1 + 2n
		//T(n) = 2n +2
		//T(n) = 2n
		//O(n)	

	}

	public static void main(String[] args) {

		String texto = "hola mundo xyz";	//O(1)	
		int key = 7;	//O(1)	
		System.out.println(cifrar(texto, key));	//O(n)	

	}
}