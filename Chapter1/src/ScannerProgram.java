import java.util.Scanner;

public class ScannerProgram {
    public static void main (String[] args) {
        String name, strAge;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        name = inputDevice.next();

        System.out.print("Enter your age >> ");
        strAge = inputDevice.next();

        System.out.println("Your name is " + name + " and you are " + strAge + " years old");
    }
}
