import java.math.BigDecimal;
import java.math.RoundingMode;

public class Phone {

    private final String brand;
    private final String model;
    private BigDecimal price;
    private final int id;
    private final String[] description;

    private final BigDecimal oneTwentyOne = new BigDecimal("1.21");

    public BigDecimal getVAT() {
        price = price.setScale(2, RoundingMode.CEILING);
        return price.divide(oneTwentyOne, RoundingMode.CEILING);
    }

    public Phone(int id, String brand, String model, String price, String[] description) {
        BigDecimal priceBD = new BigDecimal(price);
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = priceBD;
        this.description = description;
    }

    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void getDescription() {
        for (String s : description) {
            System.out.println(s);
        }
    }

    public BigDecimal getPrice() {
        price = price.setScale(2, RoundingMode.CEILING);
        return price;
    }

    public String toString() {
        return id + " - " + getBrand() + " " + getModel() + " - €" + getPrice() + " (ex. BTW: €" + getVAT() + ")";
    }

    public String toStringShort() {
        return id + " - " + getBrand() + " " + getModel();
    }
}