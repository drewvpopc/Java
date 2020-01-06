import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Beach {
    public static String greeting;
    private String beachname;
    private String snowcone_qty;
    private double snowcone_price;
    private String corndog_qty;
    private double corndog_price;

    private double tax;
    private double subtotal;
    private double total;

    private static final double TAX = .055;

    //getters
    public String getBeachname() {
        return beachname;
    }
    public String getSnowcone_qty(){
        return snowcone_qty;
    }
    public String getCorndog_qty(){
        return corndog_qty;
    }

    //setters
    public void setBeachname(String bn) {
        beachname = bn;
    }
    public void setSnowcone_qty(String sn_qty) {
        snowcone_qty = sn_qty;
    }

}