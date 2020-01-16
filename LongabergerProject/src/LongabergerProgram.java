import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.Scanner;

public class LongabergerProgram {
    static Scanner scanner = new Scanner(System.in);
    public static String basketType;
    public static String greeting;
    private static double price;
    private static String baskettype;
    private String accessory_type;
    private String state;
    private String cus_type;
    public static BasketBuild myBasketBuild;
    public static boolean OK = false;

    public static void main(String[] args){
        myBasketBuild = new BasketBuild();
        OK = false;
        input();

    }

    private static void input(){
        while(OK == false) {
            System.out.println("Enter the basket type");
            baskettype = scanner.nextLine();
            if(isValidBasketType(baskettype)) {
                myBasketBuild.setBaskettype(baskettype);
                OK = true;
            } else {
                OK = false;
            }
            System.out.println(BasketBuild.getBaskettype());
        }
        OK = false;
        while(OK == false) {
            System.out.println("Please enter the accessory");
        }

    }
    public static boolean isValidBasketType(String typebasket)
    {
        boolean isValid = false;

        switch (typebasket)
        {
            case "C":
                baskettype = "Cracker";
                price = 15.00;
                isValid = true;
                break;
            case "W":
                baskettype = "Wildflower";
                price = 53.25;
                isValid = true;
                break;
            case "K":
                baskettype = "Key";
                price = 23.15;
                isValid = true;
                break;
            case "M":
                baskettype = "Magazine";
                price = 34.00;
                isValid = true;
                break;
            case "U":
                baskettype = "Umbrella";
                price = 112.77;
                isValid = true;
                break;
            default:
                isValid = false;
                System.out.println("Invalid Basket Type");
        }
        return isValid;
    }





}
