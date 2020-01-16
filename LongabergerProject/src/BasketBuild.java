import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class BasketBuild {
    private static String baskettype;
    private static String accessory_type;
    private static String state;
    private static String cus_type;
    static DecimalFormat df = new DecimalFormat("'$'0.00");
    static DecimalFormat df2 = new DecimalFormat("#%");

    public static String getBaskettype() {
        return baskettype;
    }
    public static String getAccessory_type() {
        return accessory_type;
    }
    public static String getState() {
        return state;
    }
    public static String getCus_type() {
        return cus_type;
    }

    //setters
    public static void setBaskettype(String baskettype) {
        BasketBuild.baskettype = baskettype;
    }
    public static void setAccessory_type(String accessory_type) {
        BasketBuild.accessory_type = accessory_type;
    }
    public static void setState(String state) {
        BasketBuild.state = state;
    }
    public static void setCus_type(String cus_type) {
        BasketBuild.cus_type = cus_type;
    }


    //constructor
    //default
    public BasketBuild() {
        baskettype = "U";
        accessory_type = "A4";
        cus_type = "1";
        state = "IA";
    }

    public BasketBuild(String baskettype, String accessory_type, String state, String cus_type) {
        BasketBuild.baskettype = baskettype;
        BasketBuild.accessory_type = accessory_type;
        BasketBuild.state = state;
        BasketBuild.cus_type = cus_type;
    }

    //receipt
    public String toString(){


        return ("\n\tCustomer Type: "+ (cus_type) +
                "\n\tBasket Type: "+(baskettype) +
                "\n\tAccessory Type: "+ (accessory_type) +
                "\n\tState: "+ (state) +
                "\n\tSubtotal: "+ df.format(LongabergerProgram.basketAmount) +
                "\n\tTax: "+ df.format(LongabergerProgram.tax) +
                "\n\tDiscount: "+ df2.format(LongabergerProgram.cusDiscount) +
                "\n\tTotal: " + df.format(LongabergerProgram.total)
        );
    }

}
