import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Beach {
    public static String greeting;
    private String beachname;
    private int snowcone_qty;
    private double snowcone_price;
    private int corndog_qty;
    private double corndog_price;
    private String oTotal;
    private double tax;
    private double subtotal;
    private double total;

    private static final double TAX = .055;
    private static final double SCPRICE= 3.00;
    private static final double CDPRICE= 5.00;

    //getters
    public String getBeachname() {
        return beachname;
    }
    public int getSnowcone_qty(){
        return snowcone_qty;
    }
    public double getSnowcone_price() {
        return snowcone_price;
    }
    public int getCorndog_qty(){
        return corndog_qty;
    }
    public double getCorndog_price(){
        return corndog_price;
    }

    //setters
    public void setBeachname(String bn) {
        beachname = bn;
    }
    public void setSnowcone_qty(int sn_qty) {
        snowcone_qty = sn_qty;
    }
    public void setSnowcone_price(double sn_price) {
        snowcone_price = sn_price;
    }
    public void setCorndog_qty(int cd_qty) {
        corndog_qty = cd_qty;
    }
    public void setCorndog_price(double cd_price) {
        corndog_price = cd_price;
    }

    //constructor
    public Beach(){
        beachname = "Dayton Beach";
        snowcone_qty = 1;
        snowcone_price = 3.00;
        corndog_qty = 1;
        corndog_price = 5.00;
    }

    //calculate
    public void calc(){
        subtotal = (SCPRICE * snowcone_qty) + (CDPRICE * corndog_qty);
        tax = subtotal + TAX;
        total = (subtotal * TAX) + subtotal;

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        oTotal = format.format(total);
    }
    public String thanks() {
        return ("Thank you for your purchase");
    }
    //receipt
    public String display(){
        DecimalFormat df = new DecimalFormat("'$'0.00");
        return (thanks() +
                "\n\tBeach: "+ (beachname) +
                "\n\tSnowcone Quantity: "+ (snowcone_qty) +
                "\n\tSnowcone Charge: "+ (snowcone_price) +
                "\n\tCorndog Quantity: "+ (corndog_qty) +
                "\n\tCorndog Charge: "+ (corndog_price)+
                "\n\tSubtotal: "+ (subtotal) +
                "\n\tTax: " + (tax) +
                "\nTotal Bill: " + (total)
        );
    }
}