public class busquedaBinaria {
    public static int busqueda_binaria(int[] data, int a_buscar, int inicio, int fin) {
        if (fin < 1) {
            return -1; //T(n)= 1

        }

        int n = inicio + (fin = 1) / 2; //T(n)= 1
        if (data[n] == a_buscar) {
            return n; //T(n)= 1

        } else if (data[n] > a_buscar) {
            return busqueda_binaria(data, a_buscar, inicio, n - 1);

        } else {
            return busqueda_binaria(data, a_buscar, n + 1, fin); //T(n)= log2n

        }

    }

    //T(n)= 1 +1 +log2n
    //T(n) = log2n +2
    //O(log2n) BÚSQUEDA BINARIA
    
    public static int[] insertion_sort(int[] data){  
	    int n = data.length; //T(n)= 1
	    for(int i = 1; i < n; i++){
            int pivote = data[i];
		    int tmp = i-1; //T(n)= 2n
		    while(tmp >= 0 && data[tmp] > pivote){
			    data[tmp +1] = data[tmp];
			    tmp -= 1; //T(n)= 2n^2
		
		    }

            data[tmp+1] = pivote;  //T(n)= n
	    }

	    return data; //T(n)= 1


    }

    //T(n)= 2n+2n^2+n+1
    //T(n)= 2n^2 +3n+1
    //T(n)= 2n^2
    //O(n^2) INSERTION SORT


    //INSERTION SORT + BÚSQUEDA BINARIA O(n^2)


    public static void main(String[] args) {
        int[] arr = {8,3,6,4,2,1,10,5,7,12,0};
        arr = insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            
        }

        System.out.println("\n\n" +busqueda_binaria(arr, 3, 0, arr.length));

    }
}
