import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int x, y, costo;
    Node parent;

    public Node(int x, int y, int costo, Node parent){
        this.x = x;
        this.y = y;
        this.costo = costo;
        this.parent = parent;

    }

}

public class LaberintoRampoda {
    char[][] maze = {   //T(n) = 1
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','p','p','p','p'},
        {'p','p','p','p','c','p','p','p'},
        {'p','c','c','c','c','c','c','p'},
        {'p','c','p','c','p','p','c','p'},
        {'p','c','p','c','p','p','c','p'},
        {'p','c','c','c','c','c','c','p'},
        {'p','c','c','p','p','p','c','p'},
        {'p','c','c','c','c','p','c','p'},
        {'p','p','p','p','c','p','c','S'},
        {'p','p','c','p','c','p','p','p'},
        {'p','c','c','c','c','c','p','p'},
        {'p','p','c','p','p','p','p','p'},
        {'p','p','E','p','p','p','p','p'},
    };

    Stack<int[]> camino = new Stack<>(); // T(n) = 1
    static int[][] mover = { // T(n) = 1
        {0, -1},
        {-1, 0},
        {0, 1},
        {1, 0}
    };

    public boolean ramPoda(int x, int y){
        Queue<Node> cola = new LinkedList<>(); // T(n) = 1
        cola.add(new Node(x,y,0,null)); // T(n) = 1
        boolean[][] visitados = new boolean[maze.length][maze[0].length]; // T(n) = 1

        Node nodoFinal = null; // T(n) = 1

        while(!cola.isEmpty()){
            Node actual = cola.poll();
            if(maze[actual.x][actual.y] == 'S'){
                nodoFinal = actual; // T(n) = 1
                break; // T(n) = 1

            }

            if(visitados[actual.x][actual.y]){
                continue; // T(n) = 1

            }

            visitados[actual.x][actual.y] = true; // T(n) = 1

            for(int[] movimiento : mover){   //T(n) = 4*n*m (4 posibles direcciones * tamaño del arreglo, recorrido en el peor de los casos)
                int sigx = actual.x + movimiento[0];
                int sigy = actual.y + movimiento[1];
                if(valido(sigx,sigy)){
                    cola.add(new Node(sigx, sigy, actual.costo + 1, actual));

                }

            }

        }

        if(nodoFinal != null){// T(n) = 2
            while(nodoFinal != null){ 
                camino.push(new int[] {nodoFinal.x, nodoFinal.y});
                nodoFinal = nodoFinal.parent;

            }
            return true; // T(n) = 1
        }
        return false; // T(n) = 1

        
        //T(n) = 12 + 4*n*m
        //T(n) = 4*n*m
        //T(n) = n*m
        //O(n*m)

    }
    public boolean valido(int x, int y){ // T(n) = 1
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && (maze[x][y] == 'c' || maze[x][y] == 'S');

    }

    public void print() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();    //T(n) = n*m
        }
    }

    public static void main(String[] args) {
        LaberintoRampoda l = new LaberintoRampoda();    //O(1)
        if(l.ramPoda(13,2)){    //O(n*m)
            System.out.println("Camino encontrado: ");
            while(!l.camino.isEmpty()){    //O(n*m)
                int[] avanza = l.camino.pop();
                l.maze[avanza[0]][avanza[1]] = 'I';
                System.out.println("( " + avanza[0] + "," + avanza[1] + " )");

            }

        } else {
            System.out.println("No se encontró el camino");
        }

        l.print();    //O(n*m)

    }

}
