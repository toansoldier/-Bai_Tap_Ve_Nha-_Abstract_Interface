import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
        super();
    }

    public CrispyFlour(String id,String name, int cost, int quantity) {
        super(id,name, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.getQuantity() * super.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }


    @Override
    public double getRealMoney() {
        boolean over8Months = getTODAY().isAfter(getExpiryDate().minusMonths(4));
        boolean over2Months = getTODAY().isAfter(getExpiryDate().minusMonths(10));

        if (over8Months) return this.getAmount() * (100 - 40) / 100;
        else if (over2Months) return this.getAmount() * (100 - 20) / 100;
        else return this.getAmount() * (100 - 5) / 100;
    }


    @Override
    public String toString() {
        return "id: " + getId() + " |name: " + getName() + " |quantity:" + getQuantity() + " |cost: " + getCost()+"$" + " |manufacturing date: " + getManufacturingDate() + " |amount money: " + getAmount()+" usd" + " |real money: " + getRealMoney()+" usd";
    }
}
