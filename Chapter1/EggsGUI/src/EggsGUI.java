import javax.swing.*;
public class EggsGUI {
    //global variables
    static String iName;
    static byte iEggs;
    static final double DOZ_RATE =3.25;
    static final double LOOSE_RATE =.45;
    static double totalOwed, eggDozTotal, eggLooseTotal;
    static int eggTotal = 0, eggDoz, eggLoose;



    public static void main (String[] args){
        init();     //call the init method
        input();    //call the input method
        calcs();    //call the calcs method
        output();   //call the output method
    }

    /**
     * Calculate egg total
     *
     */

    public static void calcs(){

        eggDoz = iEggs / 12;
        eggDozTotal = eggDoz * DOZ_RATE;
        eggLoose = iEggs % 12;
        eggLooseTotal = eggLoose * LOOSE_RATE;
        totalOwed = eggLooseTotal + eggDozTotal;
    }

    /**
     *
     * The init method creates a welcome message
     */

    public static void init(){
        JOptionPane.showMessageDialog( null, "Welcome to Egg Eaters CO!",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Promps for name and Number of eggs to order
     */

    public static void input(){
        //get name
        iName = JOptionPane.showInputDialog(null, "Enter your name:");

        //get credits and convert to integer
        String strEggs;
        strEggs = JOptionPane.showInputDialog(null, "Enter number of eggs to order:");
        iEggs = Byte.parseByte(strEggs);


    }
    public static void output(){
        JOptionPane.showMessageDialog( null, "You ordered " + iEggs +
                        " eggs. That's " + eggDoz + " dozen eggs at $3.25 per dozen and "
                        + eggLoose + " loose eggs at .45 cents each for a total of $" + totalOwed,
                "Thank you " + iName + "! Pay up or get out!!!", JOptionPane.INFORMATION_MESSAGE);
    }
}