import java.util.Scanner;

public class SammysWOObjects {

    static Scanner Scanny = new Scanner(System.in);

    public static void main(String[] args){
        String iName, iPhone;
        int iMin, cMin;

        //Get name
        iName = InputName();

        //Get phone
        iPhone = InputPhone();

        //Get minutes
        iMin = InputMinutes();
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
