public class busquedaBinaria {
    public static int busqueda_binaria(int[] data,int a_buscar, int inicio, int fin){
        int mid = (inicio+fin)/ 2;  //T(n)= log2n
        //System.out.println(mid);

        if(data[mid] == a_buscar){
            return mid; //T(n)= 1
        }

        if(inicio > fin) {
            return -1; //T(n)= 1
        }

        if (a_buscar < data[mid]){
            return busqueda_binaria(data,a_buscar,inicio,mid+1);
        }

         else {
            return busqueda_binaria(data,a_buscar, mid+1,fin);
        }
    }

	
//T(n)= 1+1+log2n
//T(n)= log2n+2
//T(n)= log2n
	    




    public static void main(String[]args){
		int[] arr = {0,1,2,3,4,5,6,7,8,9,79,200,1001};
		System.out.println(busqueda_binaria(arr,1001,0,arr.length));
       

	}
}
