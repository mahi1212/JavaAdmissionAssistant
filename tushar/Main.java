package tushar;
import mahi.ShowInfo;
import java.util.Scanner;

public class Main {

    public static int district;

    public static void main(String[] args) {
        ShowInfo s = new ShowInfo();
        Scanner input = new Scanner(System.in);

        for (int i=0; i<3; i++)
            System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome To The Admission Portal");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (Public University Admission Portal)");

        //Instructions instructions = new Instructions();


        System.out.println("Districs:");
        System.out.println("1 - Sylhet.");
        System.out.println("2 - Dhaka.");
        System.out.println("3 - Chottogram.");
        System.out.print("Enter your district number: ");
        district = input.nextInt();

        while(district > 3 || district < 1)
        {
            System.out.println();
            System.out.println("Invalid district number. Try again.");
            System.out.println("Districs:");
            System.out.println("1-Sylhet.");
            System.out.println("2-Dhaka.");
            System.out.println("3-Chottogram.");
            System.out.print("Enter your district number: ");
            district = input.nextInt();
            System.out.println();
        }


        if (district == 1)
        {
            BFSSylhet bfsSylhet = new BFSSylhet();
            bfsSylhet.createGraph();
            bfsSylhet.InformationInput();

            bfsSylhet.universityChoosing();
            bfsSylhet.breadthFirstSearch();
            bfsSylhet.pathCalling();
            bfsSylhet.infoPrinting();
        }

        if (district == 2)
        {
            BFSDhaka bfsDhaka = new BFSDhaka();
            bfsDhaka.createGraph();
            bfsDhaka.InformationInput();
            bfsDhaka.universityChoosing();
            bfsDhaka.breadthFirstSearch();
            bfsDhaka.pathCalling();
            bfsDhaka.infoPrinting();
        }

        if (district == 3)
        {
            BFSChottogram bfsChottogram = new BFSChottogram();
            bfsChottogram.createGraph();
            bfsChottogram.InformationInput();
            bfsChottogram.universityChoosing();
            bfsChottogram.breadthFirstSearch();
            bfsChottogram.pathCalling();
            bfsChottogram.infoPrinting();
        }
    }
}
