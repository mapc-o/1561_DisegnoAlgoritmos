public class busquedaLinealCentinela {
	public static int busqueda_lineal_centinela(int[] data, int a_buscar) {
		int n = data.length;
		int i = 0;
        int tmp = data[n-1];
        data[n-1] = a_buscar;
		while (data[i] != a_buscar) {
			i = i +1;
		}

        data[n-1] = tmp;

		if (i < n-1 || a_buscar == data[n-1]) {
			return i;

		} else {
			return -1;
		}

	}


	public static void main(String[]args){
		int[] arr = {8,3,6,4,2,1,10,5,7,12,0};
		System.out.println(busqueda_lineal_centinela(arr,17));
		System.out.println(busqueda_lineal_centinela(arr,0));
	}
}

