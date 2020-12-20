package replitProjects.StockClass;

public class Stock {

    public String tickerSymbol, companyName;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.percentChange = 0;
        this.totalShares = totalShares;
        marketCap = totalShares * price;
    }

    public void adjustPrice(int value) {
        if (value >= price) {
            percentChange = ((double) (value - price) / price) * 100;//% increase
        } else {
            percentChange = -((double) (price - value) / price) * 100; //% decrease
        }
        price = value;  // update current price
        marketCap = value * totalShares; // update the market cap
    }


    public String toString() {
        return
                "Ticker Symbol: " + tickerSymbol +
                        "\nCompany: " + companyName +
                        "\nCurrent Price: $" + price + "(" + percentChange + "%)" +
                        "\nMarketCap: $" + marketCap;
    }
}
