/**
 * Example of the case structure in java called the switch.
 * Can be used with char, integer and String data types
 * 1/14/2020
 */
public class SwitchDecisionMaking {
    public static void main(String args[]){
        String startDate;

        startDate = "FA19";

/*        switch (startDate){
            case "SU19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA18":
                System.out.println("Your graduation year is 2020");
                break;
            case "SP18":
                System.out.println("Your graduation year is 2019");
                break;
        }
        switch (startDate){
            case "SU19":
            case "FA19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA18":
                System.out.println("Your graduation year is 2020");
                break;
            case "SP18":
                System.out.println("Your graduation year is 2019");
                break;
        } */

    char letterGrade = 'A';
        switch (letterGrade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                break;
            default:
                System.out.println("Invalid grade issue.");
        }
    }
}
