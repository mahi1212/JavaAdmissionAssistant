package mahi;
import java.io.*;
import java.util.Scanner;

public class Buet extends ReadFile{

    public void SelectFaculties() {
        readMyFile("BUET", "buetFaculties");

        System.out.println("Select faculty number: ");
        Scanner input = new Scanner(System.in);
        int facultyNumber = input.nextInt();
        String facultyName;
        switch (facultyNumber) {
            case 1:
                readMyFile("BUET", "arc");
                facultyName = "Architecture and Planning";
                System.out.println("Now select the department you would like to apply : ");
                int deptName1 = input.nextInt();
                writeUniversitytInfo("BUET", facultyName, deptName1);
                break;
            case 2:
                readMyFile("BUET", "civil");
                facultyName = "Civil Engineering";
                System.out.println("Now select the department you would like to apply : ");
                int deptName2 = input.nextInt();
                writeUniversitytInfo("BUET", facultyName, deptName2);
                break;
            case 3:
                readMyFile("BUET", "eee");
                facultyName = "Electrical and Electronic Engineering";
                System.out.println("Now select the department you would like to apply : ");
                int deptName3 = input.nextInt();
                writeUniversitytInfo("BUET", facultyName, deptName3);
                break;

            case 4:
                readMyFile("BUET", "general");
                facultyName = "General Engineering";
                System.out.println("Now select the department you would like to apply : ");
                int deptName4 = input.nextInt();
                writeUniversitytInfo("BUET", facultyName, deptName4);
                break;
            case 5:
                readMyFile("BUET", "me");
                facultyName = "Mechanical Engineering";
                System.out.println("Now select the department you would like to apply : ");
                int deptName5 = input.nextInt();
                writeUniversitytInfo("BUET", facultyName, deptName5);
                break;
            default:
                System.out.println("Please select faculty using 1-5");
        }
    }
}
