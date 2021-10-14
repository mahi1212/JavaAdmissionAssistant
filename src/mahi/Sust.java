package mahi;

import java.util.Scanner;

public class Sust extends ReadFile{
    public void SelectFaculties() {
        readMyFile("SUST", "SUST_Units");
        System.out.println("Select eligible unit/s for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

        switch (UnitNumber) {
            case 1:
                readMyFile("SUST", "A_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();
                writeUniversitytInfo("Shahjalal University of science and technology","A", subNumberForA);
                break;
            case 2:
                readMyFile("SUST", "B_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();
                writeUniversitytInfo("Shahjalal University of science and technology","B", subNumberForB);
                break;
            default:
                System.out.println("Please select Units using 1 / 2");
        }

    }
}
