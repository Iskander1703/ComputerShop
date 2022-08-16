package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name="ram")
public class ram {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;


    @Column(name = "size")
    private int size;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

    public ram(int id, String company, String model, String type, int size, int price, int amount) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.type = type;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }

    public ram(String company, String model, String type, int size, int price, int amount) {
        this.company = company;
        this.model = model;
        this.type = type;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }

    public ram() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}