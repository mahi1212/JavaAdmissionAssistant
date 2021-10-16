package tushar;

import java.util.Scanner;

public class BFSDhaka extends BFSSylhet{

    Scanner input = new Scanner(System.in);

    public void createGraph()
    {
        vertex = 4;

        graph[0][1] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[3][1] = 1;
        graph[3][2] = 1;
    }


    void breadthFirstSearch()
    {
        int u;

        for (u=0; u<vertex; u++)
        {
            color[u] = white;
            previous[u] = nill;
            distance[u] = infinity;
        }

        System.out.println("Staring Points:");
        System.out.println("1- Dohar.");
        System.out.println("2- Palamgonj.");
        System.out.println("3- Nawabgonj.");
        System.out.println("4- Bandura.");
        System.out.print("Enter the starting point number: ");
        s = (input.nextInt())-1;
        System.out.println();

        while(s < 0 || s > 3)
        {
            System.out.println("Invalid input. Try again.");
            System.out.println("Staring Points:");
            System.out.println("1- Dohar.");
            System.out.println("2- Palamgonj.");
            System.out.println("3- Nawabgonj.");
            System.out.println("4- Bandura.");
            System.out.print("Enter the starting point number: ");
            s = (input.nextInt())-1;
            System.out.println();
        }

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
    }


    @Override
    void pathCalling()
    {
        System.out.println("Exam centers available in Dhaka district:");
        System.out.println("@ Bandura Holy Cross High School and College (Code: 3).");
        System.out.println("@ Nawabgonj Pilot High School and College (Code: 2).");
        System.out.println();
        System.out.print("Choose your desired exam center's code: ");
        examCenter = input.nextInt();

        System.out.println();

        v = examCenter;

        if (v > vertex || ((v<2 && v<3) || (v>2 && v>3)))
        {
            System.out.println("Invalid input. Try again.");
            System.out.println();
            pathCalling();
        }

        else if (v == s)
        {
            System.out.print("Your exam center is at: ");
            if (s == 2)
                System.out.print("Nawabgonj ");
            else if (s == 3)
                System.out.print("Bandura ");
        }

        else if(v != s)
        {
            System.out.print("The path from ");
            if (s == 0)
                System.out.print("Dohar ");
            else if (s == 1)
                System.out.print("Palamgonj ");
            else if (s == 2)
                System.out.print("Nawabgonj ");
            else if (s == 3)
                System.out.print("Bandura ");

            System.out.print("to ");
            if (v == 2)
                System.out.print("Nawabgonj ");
            else if (v == 3)
                System.out.print("Bandura ");
            System.out.print("is: ");

            printPath(s, v);
        }
    }

    void printPath(int s, int v)
    {
        if(v==s)
        {
            if (s == 0)
                System.out.print("From Dohar ");
            else if (s == 1)
                System.out.print("From Palamgonj ");
            else if (s == 2)
                System.out.print("From Nawabgonj ");
            else if (s == 3)
                System.out.print("From Bandura ");
        }

        else if(previous[v] == nill)
            System.out.println("There is no path.");

        else
        {
            printPath(s, previous[v]);
            if (v == 0)
                System.out.print("to Dohar ");
            else if (v == 1)
                System.out.print("to Palamgonj ");
            else if (v == 2)
                System.out.print("to Nawabgonj Pilot High School and College, Nawabgonj ");
            else if (v == 3)
                System.out.print("to Bandura Holy Cross High School and College, Bandura ");
        }
    }

    @Override
    public void infoPrinting() {
        System.out.println();
        System.out.println("Your Information:");
        System.out.println("Your district: Dhaka.");
        System.out.println("Your name: "+name);
        System.out.println("Your date of birth: "+dateOfBirth);
        System.out.println("Your school name: "+schoolName);
        System.out.println("Your college name: "+collegeName);
        System.out.println("Your division: "+division);
        System.out.println("Your SSC passing year: "+sscYear);
        System.out.println("Your HSC passing year: "+hscYear);
        System.out.println("Your SSC GPA: "+sscGPA);
        System.out.println("Your HSC GPA: "+hscGPA);
        System.out.println("The university you are attending exam for: ");
        System.out.print("Your exam center: ");
        if (v == 2)
            System.out.println("Nawabgonj Pilot High School and College, Dhaka.");
        else if (v == 3)
            System.out.println("Bandura Holy Cross High School and College, Dhaka.");
        System.out.println("Your exam room number is: "+(int)(Math.random()*49));
        System.out.println("Your exam authentication pass: "+printRandomString());
        System.out.println("Your exam date: ");
        System.out.println("Your exam time: ");
    }
}
