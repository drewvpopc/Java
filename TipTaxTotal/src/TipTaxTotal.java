import java.text.DecimalFormat;
import java.util.Scanner;

public class TipTaxTotal {
    /**
     *
     * Program that calculates your tip, tax and total bill.
     * Uses the DecimalFormat class to make numbers presentable.
     *
     * Andrew Venenga
     * 12/2/2019
     */
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the food cost.");

        String iData = inputDevice.nextLine();
        double iCharge = Double.parseDouble(iData);

        double cTip= .15 * iCharge;
        double cTax = iCharge * .07;
        double cTotal = cTip + cTax + iCharge;

        DecimalFormat dollarAmt = new DecimalFormat ("$###.00");

        System.out.println("Charge: " + dollarAmt.format(iCharge));
        System.out.println("Your tip is: " + dollarAmt.format(cTip));
        System.out.println("Sales Tax: " + dollarAmt.format(cTax));
        System.out.println("Total Bill: " + dollarAmt.format(cTotal));
    }

    private static void init(){
        Scanner inputDevice = new Scanner(System.in);
    }


}
