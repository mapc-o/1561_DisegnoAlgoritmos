import java.util.Stack;

public class Laberinto {
    char[][] maze = {   //T(n) = 1
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','c','c','c','c','c','p'},
        {'p','p','c','p','p','p','c','p'},
        {'p','p','c','c','c','p','c','p'},
        {'p','p','p','p','c','p','c','S'},
        {'p','p','c','p','c','p','p','p'},
        {'p','c','c','c','c','c','p','p'},
        {'p','p','c','p','p','p','p','p'},
        {'p','p','E','p','p','p','p','p'},
    };

    Stack<int[]> camino = new Stack<>();   //T(n) = 1

    public boolean mover(int x, int y) {
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length) {
            return false;   //T(n) = 1
        }

        if (maze[x][y] == 'S') {
            camino.push(new int[]{x, y});   //T(n) = 1
            return true;   //T(n) = 1
        }

        if (maze[x][y] == 'p' || maze[x][y] == 'X' || maze[x][y] == 'I') {
            return false;   //T(n) = 1
        }

        maze[x][y] = 'I';   //T(n) = 1
        camino.push(new int[]{x, y});   //T(n) = 1

        if (mover(x, y - 1) || mover(x - 1, y) || mover(x, y + 1) || mover(x + 1, y)) {
            return true;    //T(n) = 4*n*m (4 posibles direcciones * tamaño del arreglo, recorrido en el peor de los casos)
        }

        camino.pop();   //T(n) = 1
        maze[x][y] = 'X';   //T(n) = 1
        return false;   //T(n) = 1
    }

        //T(n) = 4*n*m + 10
        //T(n) = n*m
        //O(n)

    public void print() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");    //T(n) = n^2
            }
            System.out.println();    //T(n) = n
        }
    }

        //T(n) = n^2 + n
        //T(n) = n^2
        //O(n^2)

    public static void main(String[] args) {
        Laberinto l = new Laberinto();  //O(1)
        if (l.mover(13, 2)) {
            System.out.println("Camino encontrado: ");    //O(n)
            while (!l.camino.isEmpty()) {
                int[] avanza = l.camino.pop();  //O(1)
                System.out.println("( " + avanza[0] + "," + avanza[1] + " )");  //O(n) (imprime todos los nodos de la pila)
            }
        } else {
            System.out.println("No se encontró el camino"); //O(1)
        }

        l.print();  //O(n^2)
    }
}
