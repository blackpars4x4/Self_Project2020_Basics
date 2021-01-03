package replitProjects.StoreProductClass;

public class StoreProduct {
    public String label, category;
    public int price, stock;
    public boolean hasExpiration;

    public StoreProduct(String label, String category, int price, int stock, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.hasExpiration = hasExpiration;
    }

    public StoreProduct(String label, int price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
        category = "misc";
        hasExpiration = false;
    }

    public StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
        stock = 0;
    }

    public StoreProduct(String label, String category, int price, boolean hasExpiration) {
        this.label = label;
        this.category = category;
        this.price = price;
        this.hasExpiration = hasExpiration;
    }
    public void expired(boolean hasExpired) {

        if(hasExpiration = true) {
            if (hasExpired) {
                stock = 0;
            }
        }
    }
    public boolean sale (int quantity) {
        if(quantity <= stock) {
            stock = stock - quantity;
            return true;
        }else {
            return false;
        }
    }
    public double getDiscountedPrice(double discount) {
        return price * (1-discount);
    }





}
