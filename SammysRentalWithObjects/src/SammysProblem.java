import java.util.Scanner;

/**
 * This class promps for name, phone and rental minutes
 * calculates hours, extra minutes, and cost then displays to it
 */
public class SammysProblem {
    //global variables
    static Scanner Scanny = new Scanner(System.in);

    public static void main(String[] args) {

        RentalRevised myRental;
        myRental = new RentalRevised();

        String str;
        str = "Sup";


        input(myRental);

        //call the calc method
        myRental.calc();

        //call the display method and point to console
        System.out.println(myRental.display());
    }

    private static void input(RentalRevised myRental){
        String iName, iPhone, iMin;
        int cMinutes;

        System.out.println("Enter your name: ");
        iName = Scanny.nextLine();
        myRental.setName(iName);

        System.out.println("Enter your phone: ");
        iPhone = Scanny.nextLine();
        myRental.setPhone(iPhone);

        System.out.println("Enter your minutes");
        iMin = Scanny.nextLine();
        myRental.setMinutes(iMin);

        System.out.println("");
    }
}
