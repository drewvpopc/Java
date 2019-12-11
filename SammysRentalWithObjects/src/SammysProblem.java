import java.util.Scanner;

/**
 * This class promps for name, phone and rental minutes
 * calculates hours, extra minutes, and cost then displays to it
 */
public class SammysProblem {
    //global variables
    static Scanner Scanny = new Scanner(System.in);

    public static void main(String[] argss){
        //Get name
        String iName = InputName();

        //Get phone
        String iPhone = InputPhone();

        //Get minutes
        int iMin = InputMinutes();

        //Construct a Rental object with the input data(instantiation)
        Rental myRental = new Rental(iName, iPhone, iMin);


        //call the calc method
        myRental.calc();

        //call the display method and point to console
        System.out.println(myRental.display());

        iName = InputName();
        iPhone = InputPhone();
        iMin = InputMinutes();
        myRental = new Rental(iName, iPhone, iMin);
        myRental.calc();
        System.out.println(myRental.display());

    }
    public static String InputName(){
        String iName;
        System.out.println("Enter your name: ");
        iName = Scanny.nextLine();
        return iName;
    }

    public static String InputPhone(){
        String iPhone;
        System.out.println("Enter your phone number: ");
        iPhone = Scanny.nextLine();
        return iPhone;
    }

    public static int InputMinutes(){
        String iMin;
        int cMin;
        System.out.println("Enter your Minutes: ");
        iMin = Scanny.nextLine();
        cMin = Integer.parseInt(iMin);
        return cMin;
    }
}
