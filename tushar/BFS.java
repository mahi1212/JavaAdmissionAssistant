package tushar;

import java.util.Scanner;

import static java.lang.System.exit;

public class BFS{

    Scanner input = new Scanner(System.in);

    final int white = 1;
    final int gray = 2;
    final int black = 3;
    final int nill = -1;
    final int infinity = 1000;

    static int vertex, front = 0, rear = -1;
    static int graph[][] = new int[100][100];
    static int color[] = new int[100];
    static int previous[] = new int[100];
    static int distance[] = new int[100];
    static int queue[] = new int[100];

    public void createGraph()
    {
        vertex = 5;

        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][0] = 1;
        graph[1][3] = 1;
        graph[1][4] = 1;
        graph[2][0] = 1;
        graph[2][3] = 1;
        graph[3][1] = 1;
        graph[3][2] = 1;
        graph[4][1] = 1;
    }

    void enqueue(int vertex)
    {
        if(rear == 100-1)
            System.out.println("Queue is full.");
        else
        {
            rear++;
            queue[rear] = vertex;
        }
    }

    int dequeue()
    {
        int deleteVertex;
        if(front>rear)
        {
            System.out.println("There is vertex in queue.");
            exit(1);
        }

        deleteVertex = queue[front];
        front++;
        return deleteVertex;
    }

    boolean isEmpty()
    {
        return front > rear;
    }

    void breadthFirstSearch()
    {
        int u, v, s;

        for (u=0; u<vertex; u++)
        {
            color[u] = white;
            previous[u] = nill;
            distance[u] = infinity;
        }

        System.out.print("Enter the source vertex: ");
        s = input.nextInt();

        color[s] = gray;
        distance[s] = 0;
        previous[s] = nill;
        enqueue(s);

        while(!isEmpty())
        {
            u = dequeue();
            for (v=0; v<vertex; v++)
            {
                if (graph[u][v] == 1 && color[v] == white)
                {
                    color[v] = gray;
                    distance[v] = distance[u] + 1;
                    previous[v] = u;
                    enqueue(v);
                }
            }
            color[u] = black;
        }

        System.out.print("Enter the destination vertex: ");
        v = input.nextInt();

        System.out.print("The path from vertex "+s+" to vertex "+v+" is: ");
        printPath(s, v);
    }

    void printPath(int s, int v)
    {
        if(v==s)
        {
            if (s == 0)
                System.out.print("From Hobigonj ");
            else if (s == 1)
                System.out.print("From Shayestagonj ");
            else if (s == 2)
                System.out.print("From Sherpur ");
            else if (s == 3)
                System.out.print("From Sreemongal ");
            else if (s == 4)
                System.out.print("From Moulvibazar ");
            else if (s == 5)
                System.out.print("From Sylhet ");
        }

        else if(previous[v] == nill)
            System.out.println("There is no path.");

        else
        {
            printPath(s, previous[v]);
            if (v == 0)
                System.out.print("to Hobigonj ");
            else if (v == 1)
                System.out.print("to Shayestagonj ");
            else if (v == 2)
                System.out.print("to Sherpur ");
            else if (v == 3)
                System.out.print("to Sreemongal ");
            else if (v == 4)
                System.out.print("to Moulvibazar ");
            else if (v == 5)
                System.out.print("to Sylhet ");
        }
    }
}
