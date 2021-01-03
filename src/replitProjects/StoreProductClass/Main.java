package replitProjects.StoreProductClass;

public class Main {
    public static void main(String[] args) {
       StoreProduct storeProduct = new StoreProduct("sony","electronics", 100, 20,true);

       storeProduct.expired(true);
        System.out.println(storeProduct.stock);

        StoreProduct storeProduct1 = new StoreProduct("sony","electronics", 100, true);
    }
}
