package mahi;
import java.io.*;
import java.util.Scanner;

public class UniversitySelection extends ReadFile{
    void selectUniversity(){

        readMyFile("AllUniversityList", "UniversityName");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose university : ");
        int universityId = input.nextInt();
        switch (universityId){
            case 1:
                DhakaUniversity du = new DhakaUniversity();
                du.SelectFaculties();
                break;
            case 2:
                Buet buet = new Buet();
                buet.SelectFaculties();
                break;
            case 3:
                Sust sust = new Sust();
                sust.SelectFaculties();
                break;
            case 4:
                Cuet cuet = new Cuet();
                cuet.SelectFaculties();
                break;
            case 5:
                Ruet ruet = new Ruet();
                ruet.SelectFaculties();
                break;
            default:
                System.out.println("Choose properly idiot");
        }

    }

}
