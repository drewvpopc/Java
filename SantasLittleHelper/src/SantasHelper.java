import java.util.Scanner;

/**
 * This program takes the name of a toy, calculates it,
 * and outputs the total bill.
 *
 * Andrew Venenga 12/17/19
 */

public class SantasHelper {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Toy myToy;
        myToy = new Toy();
        input(myToy);

        myToy.calc();

        System.out.printf(myToy.display());


    }

    private static void input(Toy myToy){
        String iFName, iLName, iToy, iToy2, iPrice, iPrice2;
        int cPrice, cPrice2;

        System.out.println("Enter your first name: ");
        iFName = scanner.nextLine();
        myToy.setFirst_name(iFName);

        System.out.println("Enter your last name: ");
        iLName = scanner.nextLine();
        myToy.setLast_name(iLName);

        System.out.println("Enter first toy name: ");
        iToy = scanner.nextLine();
        myToy.setToy1(iToy);

        System.out.println("Enter the price of toy one: ");
        iPrice = scanner.nextLine();
        cPrice = Integer.parseInt(iPrice);
        myToy.setPrice_toy1(cPrice);

        System.out.println("Enter second toy name: ");
        iToy2 = scanner.nextLine();
        myToy.setToy2(iToy2);

        System.out.println("Enter the price of toy two: ");
        iPrice2 = scanner.nextLine();
        cPrice2 = Integer.parseInt(iPrice2);
        myToy.setPrice_toy2(cPrice2);



        System.out.println("");
    }
}
