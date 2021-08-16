import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
        super();
    }

    public Meat(String id, String name, int cost, double weight) {
        super(id, name, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusWeeks(1);
    }

    @Override
    public double getAmount() {
        return this.getWeight() * super.getCost();
    }

    @Override
    public double getRealMoney() {
        boolean over5Day = getTODAY().isAfter(getExpiryDate().minusDays(2));
        boolean over2Day = getTODAY().isAfter(getExpiryDate().minusDays(5));

        if (over5Day) return this.getAmount() * (100 - 50) / 100;
        else if (over2Day) return this.getAmount() * (100 - 30) / 100;
        else return this.getAmount() * (100 - 10) / 100;
    }


    @Override
    public String toString() {
        return "id: " + getId() + " |name: " + getName() + " |weight:" + getWeight() + " |cost: " + getCost()+"$" + " |manufacturing date: " + getManufacturingDate() + " |amount money: " + getAmount()+"$" + " |real money: " + getRealMoney()+" usd";
    }
}
