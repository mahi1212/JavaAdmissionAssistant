package mahi;

import java.util.Scanner;

public class Cuet extends ReadFile{

    public void SelectFaculties() {
        readMyFile("CUET", "cuetFaculties");
        System.out.println("Select eligible unit/faculty for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

        switch (UnitNumber) {
            case 1:
                readMyFile("CUET", "civil");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();
                writeUniversitytInfo("Chittagong University of Engineering & Technology","Civil Engineering", subNumberForA);
                break;
            case 2:
                readMyFile("CUET", "me");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();
                writeUniversitytInfo("Chittagong University of Engineering & Technology","Mechanical Engineering", subNumberForB);
                break;
            case 3:
                readMyFile("CUET", "ece");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();
                writeUniversitytInfo("Chittagong University of Engineering & Technology","Electrical & Computer Engineering", subNumberForC);
                break;
            case 4:
                readMyFile("CUET", "arc");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();
                writeUniversitytInfo("Chittagong University of Engineering & Technology","Architecture & Planning", subNumberForD);
                break;
            case 5:
                readMyFile("CUET", "et");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForE = input.nextInt();
                writeUniversitytInfo("Chittagong University of Engineering & Technology","Engineering & Technology", subNumberForE);
                break;
            default:
                System.out.println("Please select Units using 1-5");
        }

    }
}
