import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.Scanner;

public class LongabergerProgram {
    static Scanner scanner = new Scanner(System.in);
    public static String basketType;
    public static boolean OK = false;

    public static void main(String[] args){
        BasketBuild myBasketBuild;
        myBasketBuild = new BasketBuild();
        input(myBasketBuild);

    }

    private  static void input(BasketBuild myBasketBuild){
        String iBType;

        System.out.println("Enter the basket type");
        iBType = scanner.nextLine();
        myBasketBuild.setBaskettype(iBType);
        System.out.println(BasketBuild.getBaskettype());
    }





}
