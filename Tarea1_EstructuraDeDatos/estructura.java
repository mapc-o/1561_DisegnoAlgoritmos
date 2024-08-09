public class estructura {
    public static void main(String[] args) {
        
        //Creación de nodo cabeza
        Nodo head = new Nodo(20);

        //Creación de nodos
        Nodo Nodo23 = new Nodo(23);
        Nodo Nodo19 = new Nodo(19);
        Nodo Nodo57 = new Nodo(57);
        Nodo Nodo67 = new Nodo(67);
        Nodo Nodo99 = new Nodo(99);

        //Estableciendo enlaces desde el nodo origen con dirección a otro nodo
        head.setEnlaceTop(Nodo23);
        head.setEnlaceMid(Nodo19);

        Nodo23.setEnlaceMid(Nodo57);

        Nodo19.setEnlaceBottom(Nodo67);
        
        Nodo67.setEnlaceMid(Nodo99);


        /*Imprime el nodo con valor 99. 
         * La función accede al nodo de enmedio del nodo head, 19, 
         * Una vez que accedió al nodo 19, se llama a la función que accede a su nodo inferior, 67,
         * Una vez que accedió al nodo 67, se llama a la función que accede a su nodo de en medio, 99,
         * Una vez que accedió al nodo que buscamos, se llama a la función que retorna el valor de ese nodo
         */
        
        System.out.println(head.getEnlaceMid().getEnlaceBottom().getEnlaceMid().getValue());


        /*Imprime el nodo con valor 57. 
         * La función accede al nodo de superior del nodo head, 57, 
         * Una vez que accedió al nodo 19, se llama a la función que accede a su nodo inferior, 57,
         * Una vez que accedió al nodo que buscamos, se llama a la función que retorna el valor de ese nodo
         */
        
         System.out.println(head.getEnlaceTop().getEnlaceMid().getValue());
    }

    
}
