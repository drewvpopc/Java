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
    static double iCharge;
    static double cTip, cTax, cTotal;
    static DecimalFormat dollarAmt = new DecimalFormat ("$###.00");

    public static void main(String[] args) {
        input();
        calcs();
        output();



    }
    public static void input() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the food cost.");
        String iData = inputDevice.nextLine();
        iCharge = Double.parseDouble(iData);
    }
    public static void calcs(){
       cTip= .15 * iCharge;
       cTax = iCharge * .07;
       cTotal = cTip + cTax + iCharge;


    }
    public static void output(){
        System.out.printf("%-13s%7s", "Charge: ",  dollarAmt.format(iCharge));
        System.out.printf("\n%-13s%7s", "Your tip is: ",  dollarAmt.format(cTip));
        System.out.printf("\n%-13s%7s", "Sales Tax: ",  dollarAmt.format(cTax));
        System.out.printf("\n%-13s%7s", "Total Bill: ",  dollarAmt.format(cTotal));
    }


}
