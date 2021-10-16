package tushar;

import java.util.Scanner;

public class BFSChottogram extends BFSSylhet{

    Scanner input = new Scanner(System.in);

    public void createGraph()
    {
        vertex = 6;

        graph[0][1] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[2][1] = 1;
        graph[2][4] = 1;
        graph[2][5] = 1;
        graph[3][1] = 1;
        graph[3][4] = 1;
        graph[4][2] = 1;
        graph[4][3] = 1;
        graph[5][2] = 1;
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
        System.out.println("1- Forhadabad.");
        System.out.println("2- Nazirhat.");
        System.out.println("3- Amtoli Bazar.");
        System.out.println("4- Roshangiri.");
        System.out.println("5- Nanupur.");
        System.out.println("6- Gopal Ghata.");
        System.out.print("Enter the starting point code: ");
        s = (input.nextInt())-1;
        System.out.println();

        while(s < 0 || s > 5)
        {
            System.out.println("Invalid input. Try again.");
            System.out.println("Staring Points:");
            System.out.println("1- Forhadabad.");
            System.out.println("2- Nazirhat.");
            System.out.println("3- Amtoli Bazar.");
            System.out.println("4- Roshangiri.");
            System.out.println("5- Nanupur.");
            System.out.println("6- Gopal Ghata.");
            System.out.print("Enter the starting point code: ");
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
        System.out.println("Exam centers available in Chottogram district:");
        System.out.println("@ Nanupur Girls High School (Code: 4).");
        System.out.println("@ Gopal Ghata High School (Code: 5).");
        System.out.println();
        System.out.print("Choose your desired exam center's code: ");
        examCenter = input.nextInt();

        System.out.println();

        v = examCenter;

        if (v > vertex || ((v<4 && v<5) || (v>4 && v>5)))
        {
            System.out.println("Invalid input. Try again.");
            System.out.println();
            pathCalling();
        }

        else if (v == s)
        {
            System.out.print("Your exam center is at: ");
            if (s == 4)
                System.out.print("Nanupur ");
            else if (s == 5)
                System.out.print("Gopal Ghata ");
        }

        else if (v != s) {
            System.out.print("The path from ");
            if (s == 0)
                System.out.print("Forhadabad ");
            else if (s == 1)
                System.out.print("Nazirhat ");
            else if (s == 2)
                System.out.print("Amtoli Bazar ");
            else if (s == 3)
                System.out.print("Roshangiri ");
            else if (s == 4)
                System.out.print("Nanupur ");
            else if (s == 5)
                System.out.print("Gopal Ghata ");


            System.out.print("to ");
            if (v == 4)
                System.out.print("Nanupur ");
            else if (v == 5)
                System.out.print("Gopal Ghata ");
            System.out.print("is: ");

            printPath(s, v);
        }
    }

    void printPath(int s, int v)
    {
        if(v==s)
        {
            if (s == 0)
                System.out.print("From Forhadabad ");
            else if (s == 1)
                System.out.print("From Nazirhat ");
            else if (s == 2)
                System.out.print("From Amtoli Bazar ");
            else if (s == 3)
                System.out.print("From Roshangiri ");
            else if (s == 4)
                System.out.print("From Nanupur ");
            else if (s == 5)
                System.out.print("From Gopal Ghata ");
        }

        else if(previous[v] == nill)
            System.out.println("There is no path.");

        else
        {
            printPath(s, previous[v]);
            if (v == 0)
                System.out.print("to Forhadabad ");
            else if (v == 1)
                System.out.print("to Nazirhat ");
            else if (v == 2)
                System.out.print("to Amtoli Bazar ");
            else if (v == 3)
                System.out.print("to Roshangiri ");
            else if (v == 4)
                System.out.print("to Nanupur Girls High School, Nanupur ");
            else if (v == 5)
                System.out.print("to Gopal Ghata High School, Gopal Ghata ");
        }
    }

    @Override
    public void infoPrinting() {
        System.out.println();
        System.out.println("Your Information:");
        System.out.println("Your district: Sylhet.");
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
        if (v == 4)
            System.out.println("Nanupur Girls High School, Chottogram.");
        else if (v == 5)
            System.out.println("Gopal Ghata High School, Chottogram.");
        System.out.println("Your exam room number is: "+(int)(Math.random()*49));
        System.out.println("Your exam authentication pass: "+printRandomString());
        System.out.println("Your exam date: ");
        System.out.println("Your exam time: ");
    }
}
