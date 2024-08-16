import java.util.Scanner;

public class combinaciones {

    static Scanner scan = new Scanner(System.in);   //Asignación                  T(n) = 1


    public static void main(String[] args){
        int[] nums = new int[3];    //Asignacion                                  T(n) = 1
        int count = 0;  //Asignacion                                              T(n) = 1
        
        for(int i = 0; i < nums.length; i++){
            System.out.println("Introduce un número: ");
            nums[i] = scan.nextInt();   //Bucle dependiente de variable           T(n) = 2n
        }


        for(int i = 0; i < nums.length; i++){                   
            for(int j = 0; j < nums.length; j++){   // Bucle anidado              T(n) = 2n^2
                System.out.println("( "+nums[i]+ " , "+nums[j]+" )");
                count++;
            }
        }

        System.out.println("Salida: " + count);                     //Impresión   T(n) = 1

                                            //COSTE TOTAL                         T(n) = 2n^2 + 2n + 4 T(n) = 31


    }

}
