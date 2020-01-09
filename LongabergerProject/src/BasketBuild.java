import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class BasketBuild {
    //declarations
    public static String greeting;
    private static String baskettype;
    private String accessory_type;
    private String state;
    private String cus_type;


    //getters
    public static String getGreeting() {
        return greeting;
    }
    public static String getBaskettype() {
        return baskettype;
    }
    public String getAccessory_type() {
        return accessory_type;
    }
    public String getState() {
        return state;
    }
    public String getCus_type() {
        return cus_type;
    }

    //setters
    public static void setGreeting(String greeting) {
        BasketBuild.greeting = greeting;
    }
    public static void setBaskettype(String baskettype) {
        BasketBuild.baskettype = baskettype;
    }
    public void setAccessory_type(String accessory_type) {
        this.accessory_type = accessory_type;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCus_type(String cus_type) {
        this.cus_type = cus_type;
    }

    //constructor
    //default
    public BasketBuild() {
        baskettype = "U";
        accessory_type = "A4";
        cus_type = "1";
        state = "IA";
    }

    @Override
    public String toString() {
        return "BasketBuild{" +
                "baskettype=" + baskettype +
                ", accessory_type='" + accessory_type + '\'' +
                ", state='" + state + '\'' +
                ", cus_type='" + cus_type + '\'' +
                '}';
    }

    public BasketBuild(String baskettype, String accessory_type, String state, String cus_type) {
        this.baskettype = baskettype;
        this.accessory_type = accessory_type;
        this.state = state;
        this.cus_type = cus_type;
    }
    public static boolean isValidBasketType(String typebasket)
    {
        boolean isValid = false;

        switch (baskettype)
        {
            case "C":
                baskettype = "Cracker";
            case "W":
                baskettype = "Wildflower";
            case "K":
                baskettype = "Key";
            case "M":
                baskettype = "Magazine";
            case "U":
                baskettype = "Umbrella";
                isValid = true;
                break;
            default:
                System.out.println("Invalid Basket Type");
        }
        return isValid;
    }
}
