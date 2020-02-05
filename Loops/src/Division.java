import java.util.Scanner;

public class Division {
    public static Scanner scannerIn = new Scanner(System.in);
    public static void main(String[] args) {

        int number = 100;
        while (number != 999){
            number = display();
        }

    }
    public static int display(){
        System.out.println("Enter a number to see if it can be evenly devised");
        int var;
        int number = scannerIn.nextInt();
        System.out.print(number + " is evenly divisible by: \n");
        for (var = 1; var <= number; var++) {
            if (number % var == 0) {
                System.out.println(var + " ");
                return number;
            }
        }
        return number;
    }

}
 