import java.util.Scanner;

/**
 * Plz write something here when you are awake
 */

public class BeachBumbsProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Beach myBeach;
        myBeach = new Beach();
        input(myBeach);

        myBeach.calc();

        System.out.printf(myBeach.display());


    }

    private static void input(Beach myBeach){
        String iBName, iSC, iCD;
        int cSC, cCD;

        System.out.println("Enter Beach name: ");
        iBName = scanner.nextLine();
        myBeach.setBeachname(iBName);

        System.out.println("Enter the number of Snowcones bought: ");
        iSC = scanner.nextLine();
        cSC = Integer.parseInt(iSC);
        myBeach.setSnowcone_qty(cSC);

        System.out.println("Enter the number of Corndogs bought: ");
        iCD = scanner.nextLine();
        cCD = Integer.parseInt(iCD);
        myBeach.setCorndog_qty(cCD);


    }
}