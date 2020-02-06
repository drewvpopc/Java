import java.util.Scanner;

/*
Created by Andrew Venenga on 02/03/2020
This validates the username and password and compares it to the provided requirements.
 */


public class UserEntryProgram {
    private static Scanner scanner = new Scanner(System.in);
    public static String menuOption;
    public static boolean OK = false;


    public static void main(String[] args) {
        input(); //Starts input.
    }

    private static void input() {
        String username;
        String usernamePattern = "[A-Za-z]{6,10}[0-9][0-9]"; //declares that the username must contain capital letters or lowercase, ending with 2 digits, with a minimum 6 characters and a maximum of 10.
        String password;
        String passwordPattern = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).{6,12}$"; //declares that the password must be at least one number, one capital letter and one lowercase, the minimum characters is set to 6 and the maximum is set to 12.
        System.out.println("Select Menu Option"); //menu options.
        System.out.println("1 - Create New User");
        System.out.println("2 - Use Default User");
        System.out.println("3 - Exit Program");
        menuOption = scanner.nextLine();
        if (menuOption.equals("1")) { //starts menu option one
            do {
                System.out.print("Enter Username:");
                username = scanner.nextLine();
                if (username.matches(usernamePattern)) {
                    System.out.println("Your username matches the requirements!");
                    OK = true;
                } else {
                    OK = false;
                    System.out.println("Your username does not match the requirements. Username must contain capital letters or lowercase, ending with 2 digits, with a minimum 6 characters and a maximum of 10.");
                    System.out.println("Try Again.");
                }
            } while (OK == false);
            do {
                System.out.print("Enter password:");
                password = scanner.nextLine();
                if (password.matches(passwordPattern)) {
                    System.out.println("Your password matches the requirements!");
                    OK = true;
                } else {
                    OK = false;
                    System.out.println("Your password does not match the requirements. ");
                    System.out.println("The password must be at least one number, one capital letter and one lowercase, the minimum characters is set to 6 and the maximum is set to 12.");
                }

            } while (OK == false);
            UserInfo user = new UserInfo(username, password);
            System.out.println(user.toString());
        } else if(menuOption.equals("2")) { //starts menu option two
            UserInfo defaultUser = new UserInfo(); // takes the default constuctor is this option is chose.
            System.out.println(defaultUser.toString());
        } else if(menuOption.equals("3")) { //starts menu option three
            System.out.println("Program is ending\nPlease press enter");
            String exit = scanner.nextLine();
            System.exit(1);
        }


    }

}
