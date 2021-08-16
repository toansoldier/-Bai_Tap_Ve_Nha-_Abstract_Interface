import java.time.LocalDate;

public abstract class Material implements Discount {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private final LocalDate TODAY = LocalDate.now();
    private int cost;

    public Material() {
    }

    public Material(String id,String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public LocalDate getTODAY() {
        return TODAY;
    }

    public void setManufacturingDate(int year, int month, int day) {
        this.manufacturingDate = LocalDate.of(year, month, day);
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", TODAY=" + TODAY +
                ", cost=" + cost +
                '}';
    }
}
