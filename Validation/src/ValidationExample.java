//this class will demo the use of the .length() method and the .matches() method
//
//Andrew Venenga
//1/29/2020
//

import java.util.Scanner;

public class ValidationExample {
    public static void main(String[] args) {
     /*   String name = "Matile";

        int len;

        if (name.length() > 5) {
            System.out.println("The length of name is " + name.length());
        }
        else {
            System.out.println("Shorty, short, too short.");
        }


     //.matches() method
     //  1.  Works with String data types
     //  2.  Can recognize patterns
     //  3.  Search for string patterns
     //  4.  Returns a true or false condition

     String iString;
     iString = "good bye";
     iString = "Billy Bobbie Thornton";

    // ".*value"  - String must end in the value
     if (iString.matches(".*ton")) {
         System.out.println("We have a match!");
     }
    else {
         System.out.println("No match!");
     }

    iString = iString.toUpperCase();
    // "value.*"  - String must begin with the value
    if (iString.matches("BILL.*")) {
        System.out.println("We have a match!");
    }
    else {
        System.out.println("No match!");
    }

    // "value.*"  - String must begin with the value
    if (iString.matches(".*BOB.*")) {
        System.out.println("We have a match!");
    }
    else {
        System.out.println("No match!");


     String ssn = "123-44-5678";
     //if (ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")) {
        //if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
        String ssnPattern = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        if (ssn.matches(ssnPattern)) {
            System.out.println("We have a match!");
        }
        else {
             System.out.println("No match!");
        }
*/

        String iValue = "ooa8";
        String valuePattern = "[A-Za-z]{2,3}[0-9]";
        if (iValue.matches(valuePattern)) {
            System.out.println("We have a match!");
        }
        else {
            System.out.println("No match!");
        }
    }
}