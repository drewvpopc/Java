import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * File Read Example
 * Andrew Venenga
 * 02/03/20
 */

public class FileInput {
    static Scanner scannerDat;
    static String iClassName;
    static int iCredit;
    static char iGrade;
    static double iCost, cCourseCost;

    static boolean eof = false;

    public static void main(String[] args) {
        init();
        while (!eof) {
            calcs();
            output();
            read();
        }
    }



    private static void output() {
        System.out.println(iClassName);
        System.out.println("Credits = "+ iCredit);
        System.out.println("Grade = "+ iGrade);
        System.out.println("Cost per credit = " + iCost);
        System.out.println("Course cost = " + cCourseCost);
    }
    private static void calcs() {
        cCourseCost = iCost * iCredit;
    }
    private static void init() {
        try {
            scannerDat = new Scanner(new File("course.dat"));
        } catch (FileNotFoundException e) {
           System.out.println("File not found. Program terminated.");
           System.exit(1);
        }
        read(); //Priming read
    }

    private static void read() {
        String iRecord;
        String iData;
        if (scannerDat.hasNext()){ //checks to see if there is a record to be read
            iRecord = scannerDat.nextLine(); //Reads a record and places in iRecord
            iClassName = iRecord.substring(0,17);
            iData = iRecord.substring(17,18);
            iGrade = iData.charAt(0);
            iData = iRecord.substring(19,25);
            iCost = Double.parseDouble(iData);
        }
    }
}
