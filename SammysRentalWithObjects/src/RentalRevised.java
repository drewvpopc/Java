public class RentalRevised {
    private String name;
    private String phone;
    private String iMin;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;

    private static final int RATE = 40;

    // (getters)
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getIMin(){
        return iMin;
    }


    // (setters)
    public void setName(String n){
        name = n;
    }
    public void setPhone(String p){
        phone = p;
    }
    public void setMinutes(String m){
        iMin = m;
    }



    public RentalRevised(){
        name = "Andrew Venenga";
        phone = "1-888-ihatemylife";
        totMinutes = 60;
    }

    public void calc(){
        hours =  totMinutes / 60;
        extraMinutes = totMinutes % 60;
        cost = (hours * RATE) + extraMinutes;
    }

    public String display(){
        return ("Name: " + name +
                "\nPhone: " + phone +
                "\nHours: " + hours +
                "\nExtra Minutes: " + extraMinutes +
                "\nCost: " + cost);
    }
}
