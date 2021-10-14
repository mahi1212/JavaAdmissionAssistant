package mahi;

import java.util.Scanner;

public class Ruet extends ReadFile{
    public void SelectFaculties() {
        readMyFile("RUET", "cuetFaculties");
        System.out.println("Select eligible unit/faculty for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

        switch (UnitNumber) {
            case 1:
                readMyFile("RUET", "civil");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();
                writeUniversitytInfo("Rajshahi University of Engineering & Technology","Civil Engineering", subNumberForA);
                break;
            case 2:
                readMyFile("RUET", "me");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();
                writeUniversitytInfo("Rajshahi University of Engineering & Technology","Mechanical Engineering", subNumberForB);
                break;
            case 3:
                readMyFile("RUET", "ece");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();
                writeUniversitytInfo("Rajshahi University of Engineering & Technology","Electrical & Computer Engineering", subNumberForC);
                break;
            case 4:
                readMyFile("RUET", "ase");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();
                writeUniversitytInfo("Rajshahi University of Engineering & Technology","Applied Science and Engineering", subNumberForD);
                break;
            default:
                System.out.println("Please select Units using 1-4");
        }

    }
}
