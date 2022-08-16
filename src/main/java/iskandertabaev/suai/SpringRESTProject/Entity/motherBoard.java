package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name="mother_board")
public class motherBoard {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "model")
    private String model;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

    public motherBoard(int id, String company, String model, int price, int amount) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }

    public motherBoard(String company, String model, int price, int amount) {
        this.company = company;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }

    public motherBoard() {
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
