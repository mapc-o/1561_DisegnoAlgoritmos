public class busquedaLinealCentinela {
	public static int busqueda_lineal_centinela(int[] data, int a_buscar) {
		int n = data.length; //T(n)= 1
		int i = 0; //T(n)= 1
        int tmp = data[n-1]; //T(n)= 1
        data[n-1] = a_buscar; //T(n)= 1
		while (data[i] != a_buscar) {
			i = i +1; //T(n)= n
		}

        data[n-1] = tmp; //T(n)= 1

		if (i < n-1 || a_buscar == data[n-1]) {
			return i;

		} else {
			return -1; //T(n)= 1
		}

	}

	//T(n)= 1+1+1+1+n+1+1
	//T(n)= n+6
	//O(n)


	public static void main(String[]args){
		int[] arr = {8,3,6,4,2,1,10,5,7,12,0};
		System.out.println(busqueda_lineal_centinela(arr,17));
		System.out.println(busqueda_lineal_centinela(arr,0));
	}
}

