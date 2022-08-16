package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name="power_unit")
public class powerUnit {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "model")
    private String model;

    @Column(name = "power")
    private int power;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

    public powerUnit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public powerUnit(int id, String company, String model, int power, int price, int amount) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.power = power;
        this.price = price;
        this.amount = amount;
    }

    public powerUnit(String company, String model, int power, int price, int amount) {
        this.company = company;
        this.model = model;
        this.power = power;
        this.price = price;
        this.amount = amount;
    }
}
