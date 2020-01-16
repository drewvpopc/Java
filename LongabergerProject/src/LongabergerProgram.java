import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.awt.*;
import java.util.Scanner;


public class LongabergerProgram {
    private static Scanner scanner = new Scanner(System.in);
    public static String greeting;
    public static String orderType;
    public static double price;
    public static double priceAccessory;
    public static String basketType;
    public static String accessoryType;
    public static String state;
    public static double taxRate;
    public static String cusType;
    public static double cusDiscount;
    public static double basketAmount;
    public static double discount;
    public static double tax;
    public static double subtotal;
    public static double total;
    public static boolean OK = false;
    public static boolean validBasket = false;
    public static boolean validAccessory = false;
    public static boolean validState = false;
    public static boolean validCus_type = false;
    public static BasketBuild defaultBasket = new BasketBuild();
    public static BasketBuild myBasket = new BasketBuild();

    public static void main(String[] args) {
        input();
        if (validBasket == true) {
            //call overloaded constructor
            myBasket.setBaskettype(basketType);
        }
        if (validAccessory == true) {
            myBasket.setAccessory_type(accessoryType);
        }
        if (validState == true) {
            myBasket.setState(state);
        }
        if (validCus_type == true ) {
            myBasket.setCus_type(cusType);
        }
        else {
                //call default constructor
                System.out.println(defaultBasket.toString());
        }
        Calcs();
        System.out.println(myBasket.toString());
    }

    private static void input() {
        System.out.println("Enter the order type");
        System.out.println("(S)tandard");
        System.out.println("(C)ustom");
        orderType = scanner.nextLine();
        if(orderType.equals("C")) {
            while (OK == false) {
                System.out.println("Enter the basket type");
                System.out.println("(C)racker");
                System.out.println("(W)ildflower");
                System.out.println("(K)ey");
                System.out.println("(M)agazine");
                System.out.println("(U)mbrella");
                basketType = scanner.nextLine();
                if (isValidBasketType(basketType)) {
                    // TODO : Set Bool Returned variable to global variable
                    BasketBuild.setBaskettype(basketType);
                    OK = true;
                }
                 else {
                    OK = false;
                }
                System.out.println(BasketBuild.getBaskettype());
            }
            OK = false;
            while (OK == false) {
                System.out.println("Please enter the accessory");
                System.out.println("A1. Protector");
                System.out.println("A2. Liner");
                System.out.println("A3. Combo");
                System.out.println("A4. None");
                accessoryType = scanner.nextLine();

                if (isValidAccessory(accessoryType)) {

                    BasketBuild.setAccessory_type(accessoryType);
                    OK = true;
                } else {
                    OK = false;
                }
                System.out.println(BasketBuild.getAccessory_type());
            }
            OK = false;
            while (OK == false) {
                System.out.println("Enter your State");
                System.out.println("IA. Iowa");
                System.out.println("IL. Illinois");
                System.out.println("MO. Missouri");
                state = scanner.nextLine();
                if (isValidState(state)) {
                    BasketBuild.setState(state);
                    OK = true;
                } else {
                    OK = false;
                }
                System.out.println(BasketBuild.getState());
            }
            OK = false;
            while (OK == false) {
                System.out.println("Enter the Customer Type");
                System.out.println("1. Dealer");
                System.out.println("2. Walk In");
                System.out.println("3. Bus");
                cusType = scanner.nextLine();
                if (isValidCus_type(cusType)) {
                    BasketBuild.setCus_type(cusType);
                    OK = true;
                } else {
                    OK = false;
                }
                System.out.println(BasketBuild.getCus_type());
            }
        }
    }

    public static boolean isValidBasketType(String typebasket)
    {
        boolean isValid = false;
        switch (typebasket)
        {
            case "c":
            case "C":
                basketType = "Cracker";
                price = 15.00;
                isValid = true;
                break;
            case "w":
            case "W":
                basketType = "Wildflower";
                price = 53.25;
                isValid = true;
                break;
            case "k":
            case "K":
                basketType = "Key";
                price = 23.15;
                isValid = true;
                break;
            case "m":
            case "M":
                basketType = "Magazine";
                price = 34.00;
                isValid = true;
                break;
            case "u":
            case "U":
                basketType = "Umbrella";
                price = 112.77;
                isValid = true;
                break;
            default:
                System.out.println("Invalid Basket Type");
                isValid = false;
        }
        return isValid;
    }

    public static boolean isValidAccessory(String typeaccessory)
    {
        boolean isValid = false;
        switch (typeaccessory)
        {
            case "a1":
            case "A1":
                accessoryType = "Protector";
                priceAccessory = 4.75;
                isValid = true;
                break;
            case "a2":
            case "A2":
                accessoryType = "Liner";
                priceAccessory = 8.00;
                isValid = true;
                break;
            case "a3":
            case "A3":
                accessoryType = "Combo";
                priceAccessory = 10.55;
                isValid = true;
                break;
            case "a4":
            case "A4":
                accessoryType = "None";
                priceAccessory = 0;
                isValid = true;
                break;
            default:
                System.out.println("Invalid Accessory Type");
        }
        return  isValid;
    }

    public static boolean isValidState(String typestate)
    {
        boolean isValid = false;

        switch (typestate)
        {
            case "ia":
            case "IA":
                state = "Iowa";
                taxRate = .06;
                isValid = true;
                break;
            case "il":
            case "IL":
                state = "Illinois";
                taxRate = .0625;
                isValid = true;
                break;
            case "mo":
            case "MO":
                state = "Missouri";
                taxRate = .04225;
                isValid = true;
                break;
            default:
                System.out.println("Invalid State");
        }
        return isValid;
    }

    public static boolean isValidCus_type(String typecus)
    {
        boolean isValid = false;
        switch (typecus)
        {
            case "1":
                cusType = "Dealer";
                cusDiscount = .50;
                isValid = true;
                break;
            case "2":
                state = "Walk In";
                cusDiscount = .00;
                isValid = true;
                break;
            case "3":
                cusType = "Bus";
                cusDiscount = .10;
                isValid = true;
                break;
            default:
                System.out.println("Invalid Customer");
        }
        return isValid;
    }

    public static void Calcs(){
        basketAmount = price +  priceAccessory;
        discount = basketAmount * cusDiscount;
        subtotal = basketAmount - discount;
        tax = subtotal * taxRate;
        total = subtotal + tax;
    }


}
