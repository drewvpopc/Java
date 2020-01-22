import java.util.Scanner;

/*
pg 324 #2
 */
public class loopexample {
    public static Scanner scannerIn = new Scanner(System.in);
    public static void main(String[] args) {
        int ctr = 0;
        String name = "";
        while (ctr < 5) {
            display();
        }
    }

    public static void display(){
        System.out.println("This is kinda gay");
    }

}
