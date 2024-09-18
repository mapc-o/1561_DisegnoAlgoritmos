public class busquedaLineal {
	public static int busqueda_lineal(int[] data, int a_buscar) {
		int n = data.length; //T(n)=1
		int i = 0; //T(n)=1
		while (i < n && data[i] != a_buscar) {
			i = i +1; //T(n)=n
		}

		if (i >= n) {
			return -1;

		} else {
			return i; //T(n)=1
		}

	}

	//T(n)= 1+1+n+1
	//T(n)= n+ 3
	
	//O(n)


	public static void main(String[]args){
		int[] arr = {8,3,6,4,2,1,10,5,7,12,0};
		System.out.println(busqueda_lineal(arr,17));
		System.out.println(busqueda_lineal(arr,7));
	}
}

