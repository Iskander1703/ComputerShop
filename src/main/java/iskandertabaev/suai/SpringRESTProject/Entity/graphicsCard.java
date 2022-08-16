package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name="graphics_card")
public class graphicsCard {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "model")
    private String model;

    public graphicsCard() {
    }

    @Column(name = "size")
    private int size;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

    public graphicsCard(String company, String model, int size, int price, int amount) {
        this.company = company;
        this.model = model;
        this.size = size;
        this.price = price;
        this.amount = amount;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public graphicsCard(int id, String company, String model, int size, int price, int amount) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }
}
