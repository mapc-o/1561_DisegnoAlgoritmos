public class busquedaLineal {
	public static int busqueda_lineal(int[] data, int a_buscar) {
		int n = data.length;
		int i = 0;
		while (i < n && data[i] != a_buscar) {
			i = i +1;
		}

		if (i >= n) {
			return -1;

		} else {
			return i;
		}

	}


	public static void main(String[]args){
		int[] arr = {8,3,6,4,2,1,10,5,7,12,0};
		System.out.println(busqueda_lineal(arr,17));
		System.out.println(busqueda_lineal(arr,7));
	}
}

