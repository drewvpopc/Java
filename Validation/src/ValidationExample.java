//this class will demo the use of the .length() method and the .matches() method
//
//Andrew Venenga
//1/29/2020
//

import java.util.Scanner;

public class ValidationExample {
    public static void main(String[] args) {
    /* Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

        int len;

        len = name.length();

        if (name.length() > 5){
            System.out.println("The Length of name is " + len);
        }
        else {
            System.out.println("this is short");
        }
    }
}

 */
        //.matches() method
        // 1. only works with String data types
        // 2. recongnize patterns
        // 3. Search for string patterns
        // 4. Returns a true or false condition
        String iString;
        iString = "good bye";
        iString = "Billy Bobbie Thornton";

        //".*value" - String must end in the value
        //"value.*" - String begins with the value
        if (iString.matches("Bill.*")){
            System.out.println("match");
        }
        else {
            System.out.println("Nothing");
        }
    }
}