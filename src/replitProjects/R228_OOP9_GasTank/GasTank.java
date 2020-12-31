package replitProjects.R228_OOP9_GasTank;

public class GasTank {

    public double amount = 0;
    public double capacity;

    public GasTank(double amount) {
        this.amount = amount;
        this.capacity = capacity;
    }

    public void addGas(double amount) {

        amount += amount;
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public void useGas(double amount) {
        amount = -amount;
        if (amount < 0) {
            amount = 0;
        }
    }

    public boolean isEmpty() {
        return amount < 0.1;
    }

    public boolean isFull() {
        return amount > capacity-0.1;
    }
    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        amount = capacity;
        return capacity-amount;
    }

}
