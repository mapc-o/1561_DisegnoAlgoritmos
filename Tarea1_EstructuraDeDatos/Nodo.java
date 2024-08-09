//Clase nodo con atributo de valor, enlace de arriba, enlace de enmedio, enlace de abajo
//Los enlaces también son objetos de tipo Nodo
public class Nodo {
    private int value;
    private Nodo enlaceTop;
    private Nodo enlaceMid;
    private Nodo enlaceBottom;

    //Constructor de nodo, recibe como parámetro el valor del nodo, los valores de los enlaces se inicializan en null
    public Nodo(int value) {
        this.value = value;
        this.enlaceTop = null;
        this.enlaceMid = null;
        this.enlaceBottom = null;
    }

    
    //Get y Set para el valor del nodo
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    //Get y Set para el enlace superior del nodo
    public Nodo getEnlaceTop() {
        return enlaceTop;
    }

    public void setEnlaceTop(Nodo enlaceTop) {
        this.enlaceTop = enlaceTop;
    }


    //Get y Set para el enlace de enmedio del nodo
    public Nodo getEnlaceMid() {
        return enlaceMid;
    }
    public void setEnlaceMid(Nodo enlaceMid) {
        this.enlaceMid = enlaceMid;
    }

    
    //Get y Set para el enlace inferior del nodo
    public Nodo getEnlaceBottom() {
        return enlaceBottom;
    }

    public void setEnlaceBottom(Nodo enlaceBottom) {
        this.enlaceBottom = enlaceBottom;
    }
}