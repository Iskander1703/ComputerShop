package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name="frame")
public class frame {

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

    public frame(int id, String company, String model, int price, int amount) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }

    public frame(String company, String model, int price, int amount) {
        this.company = company;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }

    public frame() {
    }

    @Override
    public String toString() {
        return "frame{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
