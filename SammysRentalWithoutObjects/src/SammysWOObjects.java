import java.util.Scanner;

public class SammysWOObjects {

    static Scanner Scanny = new Scanner(System.in);

    public static void main(String[] args){
        String iName, iPhone;
        int iMin, cMin;
        int cHours, extraMin;
        double cost;

        RentalRevised myRental;
        myRental = new RentalRevised();

        String str;
        str = "Sup";
        //Get name
        iName = InputName();

        //Get phone
        iPhone = InputPhone();

        //Get minutes
        iMin = InputMinutes();

        //calc hours
        cHours = calcHours(iMin);

        //calc extra minutes
        extraMin = calcExtraMin(iMin);

        //calc cost
        cost = calcCost(iMin);

        //display results
        output(cHours, extraMin, cost);

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

    public static int calcHours(int minutes){
        int hours;
        hours = minutes / 60;
        return hours;

        //return  minutes / 60;
    }

    public static int calcExtraMin(int minutes){
        int extraMin;
        extraMin = minutes % 60;
        return extraMin;
    }

    public static double calcCost(int minutes){
        int hours;
        hours = minutes / 60;
        int extraMin;
        extraMin = minutes % 60;

        double cost;
        cost = (hours * 40) + extraMin;
        return cost;
    }

    public static void output(int hours, int exMin, double cost){
        System.out.println("Hours: " + hours +  "\nMinutes: " + exMin + "\nCost: " + cost);

    }
}
