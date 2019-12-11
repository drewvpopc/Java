/*
    This class is used to create rental objects
 */

public class Rental {
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;
   //class variables
    private static final int RATE = 40;

    //constrictor (special method with the same name as the class name)
    //This is a reference to the current object

    /**
     * Constructs a rental object with name, phone and minutes
     * @param nm
     * @param ph
     * @param min
     */
    public Rental(String nm, String ph, int min){
        name = nm;
        phone = ph;
        totMinutes = min;

    }

    /**
     * Calculates hours, extra minutes and cost.
     */
    public void calc(){
        hours =  totMinutes / 60;
        extraMinutes = totMinutes % 60;
        cost = (hours * RATE) + extraMinutes;
    }

    /**
     *
     * @return
     */
    public String display(){
        return ("Name: " + name +
                "\nPhone: " + phone +
                "\nHours: " + hours +
                "\nExtra Minutes: " + extraMinutes +
                "\nCost: " + cost);
    }


}
