package tushar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import mahi.*;

import static java.lang.System.exit;

public class BFSSylhet implements Methods{

    Scanner input = new Scanner(System.in);

    String name, dateOfBirth, schoolName, collegeName, division, dt, tm;
    int sscYear, hscYear, univertyInput;
    double sscGPA, hscGPA;
    ShowInfo sh = new ShowInfo();

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    LocalTime localTime = LocalTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");

    final int white = 1;
    final int gray = 2;
    final int black = 3;
    final int nill = -1;
    final int infinity = 1000;

    static int vertex, front = 0, rear = -1, examCenter, v, s, MAX = 36;
    static int graph[][] = new int[100][100];
    static int color[] = new int[100];
    static int previous[] = new int[100];
    static int distance[] = new int[100];
    static int queue[] = new int[100];


    public String printRandomString()
    {
        char []alphabet = { 'a', 'b', '0', 'c', 'd', '1', 'e', 'f', '2', 'g',
                'h', '3', 'i', 'j', '4', 'k', 'l', '5', 'm', 'n', '6',
                'o', 'p', '7', 'q', 'r', '8', 's', 't', '9', 'u',
                'v', 'w', 'x', 'y', 'z' };

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 36; i++)
            res.append(alphabet[(int) (Math.random() * 10 % MAX)]);

        return res.toString();
    }


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

    public void enqueue(int vertex)
    {
        if(rear == 100-1)
            System.out.println("Queue is full.");
        else
        {
            rear++;
            queue[rear] = vertex;
        }
    }

    public int dequeue()
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

    public boolean isEmpty()
    {
        return front > rear;
    }

    public void InformationInput()
    {
        System.out.println("Carefully enter valid information");
        System.out.print("Your name: ");
        name = input.nextLine();
        System.out.print("Your date of birth: ");
        dateOfBirth = input.nextLine();
        System.out.print("Your school name: ");
        schoolName = input.nextLine();
        System.out.print("Your college name: ");
        collegeName = input.nextLine();
        System.out.print("Your division: ");
        division = input.nextLine();
        System.out.print("Your SSC passing year: ");
        sscYear = input.nextInt();
        System.out.print("Your HSC passing year: ");
        hscYear = input.nextInt();
        System.out.print("Your SSC GPA: ");
        sscGPA = input.nextDouble();
        System.out.print("Your HSC GPA: ");
        hscGPA = input.nextDouble();
        sh.writeStudentInfo(name, dateOfBirth, schoolName, collegeName, division, sscYear, hscYear, sscGPA, hscGPA,
                dt, tm);
    }


    void universityChoosing()
    {
        System.out.println();
        System.out.println("List of available universities: ");
        System.out.println("1. Dhaka University.");
        System.out.println("2. Shahjalal University of Science and Technology.");
        System.out.println("3. Bangladesh University of Engineering and Technology.");
        System.out.println("4. Rajshahi University of Engineering and Technology.");
        System.out.println("5. Chittagong University of Engineering and Technology.");

        System.out.println();
        System.out.println("University that you can apply for: ");
        if(sscGPA >= 3.0 && hscGPA >= 3.0)
        {
            if((sscGPA + hscGPA) == 10)
            {
                System.out.println("1. Dhaka University.");
                System.out.println("2. Shahjalal University of Science and Technology.");
                System.out.println("3. Bangladesh University of Engineering and Technology.");
                System.out.println("4. Rajshahi University of Engineering and Technology.");
                System.out.println("5. Chittagong University of Engineering and Technology.");
                System.out.println();
                System.out.print("Choose the university number: ");
                univertyInput = input.nextInt();

                while(univertyInput < 1 || univertyInput > 5)
                {
                    System.out.println("Invalid input. Try again.");
                    System.out.println("1. Dhaka University.");
                    System.out.println("2. Shahjalal University of Science and Technology.");
                    System.out.println("3. Bangladesh University of Engineering and Technology.");
                    System.out.println("4. Rajshahi University of Engineering and Technology.");
                    System.out.println("5. Chittagong University of Engineering and Technology.");
                    System.out.println();
                    System.out.print("Choose the university number: ");
                    univertyInput = input.nextInt();
                }

                if (univertyInput == 1)
                {
                    DhakaUniversity dhakaUniversity = new DhakaUniversity();
                    dhakaUniversity.SelectFaculties();
                    ShowInfo sh = new ShowInfo();
//                    sh.writeUniversitytInfo('Dhaka','');
                }

                else if (univertyInput == 2)
                {
                    Sust sust = new Sust();
                    sust.SelectFaculties();
                }

                else if (univertyInput == 3)
                {
                    Buet buet = new Buet();
                    buet.SelectFaculties();
                }

                else if (univertyInput == 4)
                {
                    Ruet ruet = new Ruet();
                    ruet.SelectFaculties();
                }

                else if (univertyInput == 5)
                {
                    Cuet cuet = new Cuet();
                    cuet.SelectFaculties();
                }
            }

            else if ((sscGPA + hscGPA) >= 8.0)
            {
                System.out.println("1. Dhaka University.");
                System.out.println("2. Shahjalal University of Science and Technology.");
                System.out.println();

                System.out.print("Choose the university number:");
                univertyInput = input.nextInt();

                while(univertyInput < 1 || univertyInput > 2)
                {
                    System.out.println("Invalid input. Try again.");
                    System.out.println("1. Dhaka University.");
                    System.out.println("2. Shahjalal University of Science and Technology.");
                    System.out.println();
                    System.out.print("Choose the university number:");
                    univertyInput = input.nextInt();
                }

                if (univertyInput == 1)
                {
                    DhakaUniversity dhakaUniversity = new DhakaUniversity();
                    dhakaUniversity.SelectFaculties();
                }

                else if (univertyInput == 2)
                {
                    Sust sust = new Sust();
                    sust.SelectFaculties();
                }
            }

            else if((sscGPA + hscGPA) >= 6.50)
            {
                System.out.println("1. Shahjalal University of Science and Technology.");
                System.out.println();

                System.out.print("Choose the university number:");
                univertyInput = input.nextInt();

                while(univertyInput != 1)
                {
                    System.out.println("Invalid input. Try again.");
                    System.out.println("2. Shahjalal University of Science and Technology.");
                    System.out.println();
                    System.out.print("Choose the university number:");
                    univertyInput = input.nextInt();
                }

                if (univertyInput == 2)
                {
                    Sust sust = new Sust();
                    sust.SelectFaculties();
                }
            }
        }

        else if(sscGPA < 3 && hscGPA < 3)
        {
            System.out.println("Sorry, you can not apply for any university.");
            System.exit(0);
        }
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
        System.out.println("1- Hobigonj.");
        System.out.println("2- Shayestagonj.");
        System.out.println("3- Sherpur.");
        System.out.println("4- Sreemongal.");
        System.out.println("5- Moulvibazar.");
        System.out.println("6- Sylhet.");
        System.out.print("Enter the starting point number: ");
        s = (input.nextInt())-1;
        System.out.println();

        while(s < 0 || s > 5)
        {
            System.out.println("Invalid input. Try again.");
            System.out.println("Staring Points:");
            System.out.println("1- Hobigonj.");
            System.out.println("2- Shayestagonj.");
            System.out.println("3- Sherpur.");
            System.out.println("4- Sreemongal.");
            System.out.println("5- Moulvibazar.");
            System.out.println("6- Sylhet.");
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


    void pathCalling()
    {
        System.out.println("Exam centers available in Sylhet district:");
        System.out.println("@ Moulvibazar Govt. College (Code: 4).");
        System.out.println("@ M. C. College, Sylhet (Code: 5).");
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
            System.out.print("Your Exam center is at: ");
            if (s == 4)
                System.out.print("Moulvibazar ");
            else if (s == 5)
                System.out.print("Sylhet ");
        }

        else if (v != s)
        {
            System.out.print("The path from ");
            if (s == 0)
                System.out.print("Hobigonj ");
            else if (s == 1)
                System.out.print("Shayestagonj ");
            else if (s == 2)
                System.out.print("Sherpur ");
            else if (s == 3)
                System.out.print("Sreemongal ");
            else if (s == 4)
                System.out.print("Moulvibazar ");
            else if (s == 5)
                System.out.print("Sylhet ");

            System.out.print("to ");
            if (v == 4)
                System.out.print("Moulvibazar ");
            else if (v == 5)
                System.out.print("Sylhet ");
            System.out.print("is: ");

            printPath(s, v);
        }
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
                System.out.print("to Moulvibazar Govt. College, Moulvibazar ");
            else if (v == 5)
                System.out.print("to M. C. College, Sylhet ");
        }
    }


    @Override
    public void infoPrinting()
    {
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
        System.out.print("The university you are attending exam for: ");
        if (univertyInput == 1)
            System.out.println("Dhaka University.");
        else if (univertyInput == 2)
            System.out.println("Shahjalal University of Science and Technology.");
        else if (univertyInput == 3)
            System.out.println("Bangladesh University of Engineering and Technology.");
        else if (univertyInput == 4)
            System.out.println("Rajshahi University of Engineering and Technology.");
        else if (univertyInput == 5)
            System.out.println("Chittagong University of Engineering University.");
        System.out.print("Your exam center: ");
            if (v == 4)
                System.out.println("Moulvibazar Govt. College, Moulvibazar.");
            else if (v == 5)
                System.out.println("M. C. College, Sylhet.");
        System.out.println("Your exam room number is: "+(int)(Math.random()*49));
        System.out.println("Your exam authentication pass: "+printRandomString());

        dt = dateFormat.format(date);
        System.out.println("Your exam date: "+dt);
        tm = localTime.format(dateTimeFormatter);
        System.out.println("Your exam time: "+tm);


    }
}
