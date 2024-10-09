public class fuerzaBruta_ej1_pares{
	public static void pares(int[] arr){
		int producto = 0;	//T(n)=1
		int a = 0;	//T(n)=1
		int b= 0;	//T(n)=1
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] != arr[i]){
					int nuevo = arr[i]*arr[j];	
					if (nuevo > producto) {
						producto = nuevo;	
						a = arr[i];		
						b = arr[j];		//T(n)=3n^2
						
			
					}
				}
			}
		}
		System.out.println("La pareja más alta de números es: " + a + "," + b);	//T(n)=1
		//T(n)= 1 + 1 + 3n^2 +1	
		//T(n)= 3n^2 +3
		//T(n)= 3n^2	
		//T(n)=n^2
		//O(n^2)
	}
	public static void main(String[] args) {
		
		int[] arr = {-9,3,5,-2,9,-7,4,8,6,-100,200,77,0};	//O(1)
		pares(arr); //O(n^2)

		

	}
}
