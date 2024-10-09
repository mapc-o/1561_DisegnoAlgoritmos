public class fuerzaBruta_ej3_patron{
	public static void patron(String texto, String pat){

		if(texto.contains(pat)){
			System.out.println(texto + " contiene el patrón "+ pat);

		} else {
			System.out.println(texto + " NO contiene el patrón " + pat);	//T(n)=1
		}

		//T(n)=1
		//O(1)
	}

	public static void main(String[] args) {
		String texto = "0011100101011011101";	//O(1)
		String pat = "01101";	//O(1)

		patron(texto,pat);	//O(1)

	}
}