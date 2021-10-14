package mahi;
import java.io.*;
import java.util.Scanner;

public class DhakaUniversity extends ReadFile{
    public void SelectFaculties() {
        readMyFile("DhakaUniversity", "DuUnits");
        System.out.println("Select eligible unit/s for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

        switch (UnitNumber) {
            case 1:
                readMyFile("DhakaUniversity", "A_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();
                writeUniversitytInfo("Dhaka","A", subNumberForA);
                break;
            case 2:
                readMyFile("DhakaUniversity", "B_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();
                writeUniversitytInfo("Dhaka","B", subNumberForB);
                break;
            case 3:
                readMyFile("DhakaUniversity", "C_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();
                writeUniversitytInfo("Dhaka","C", subNumberForC);
                break;
            case 4:
                readMyFile("DhakaUniversity", "D_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();
                writeUniversitytInfo("Dhaka","D", subNumberForD);
                break;
            case 5:
                readMyFile("DhakaUniversity", "F_Unit");
                System.out.println("Select subject you would like to apply : ");
                int subNumberForF = input.nextInt();
                writeUniversitytInfo("Dhaka","F", subNumberForF);
                break;
            default:
                System.out.println("Please select Units using 1-5");
        }

//        System.out.println("Now select the department you would like to apply : ");
//        int deptNumber = input.nextInt();
//        writeDeptInfo(deptNumber);
    }
}
