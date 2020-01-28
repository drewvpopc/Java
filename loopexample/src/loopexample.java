import java.util.Scanner;

/*
pg 324 #2
 */
public class loopexample {
    public static Scanner scannerIn = new Scanner(System.in);
    public static void main(String[] args) {
        int numCtr = 0;
        int Number = 0;
        
        while (Number != 999) {
            Number = display();
            numCtr++;
        }
        System.out.println("Total" + numCtr);
    }

    public static int display(){

        System.out.println("Enter an even number or 999 to exit");
        int Number = scannerIn.nextInt();
        int input = Number;
        if (input % 2 == 0 ) {
            System.out.println (Number + " is an even number");
            return Number;
        }
        else
        System.out.println("This is ODD try again.");
        return Number;
    }

}
