import java.util.Scanner;

public class UserEntryProgram {
    private static Scanner scanner = new Scanner(System.in);
    public static String menuOption;
    public static boolean OK = false;
    public static UserInfo myUserInfo = new UserInfo();


    public static void main(String[] args) {
        input();
        System.out.println(myUserInfo.toString());


    }

    private static void input() {

        String username;
        String usernamePattern = "[A-Za-z]{6,10}[0-9][0-9]";
        String password;
        String passwordPattern = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).{6,12}$";

        System.out.println("Select Menu Option");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        menuOption = scanner.nextLine();
        if (menuOption.equals("1")) {
            do {
                System.out.print("Enter Username:");
                username = scanner.nextLine();
                if (username.matches(usernamePattern)) {
                    System.out.println("Correct");
                    OK = true;
                } else {
                    OK = false;
                    System.out.println("fail");
                }
            } while (OK == false);
            do {
                System.out.print("Enter password:");
                password = scanner.nextLine();
                if (password.matches(passwordPattern)) {
                    System.out.println("Correct");
                    OK = true;
                } else {
                    OK = false;
                    System.out.println("fail");
                }

            } while (OK == false);
            UserInfo user = new UserInfo(username, password);

        }


    }
    private static void output() {
        System.out.println("Your information was accepted");

    }
}
