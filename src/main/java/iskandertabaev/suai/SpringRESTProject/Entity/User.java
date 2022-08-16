package iskandertabaev.suai.SpringRESTProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {



    @Id
    @Column(name = "login")
    private String login;

    @Column(name = "hash")
    private String hash;

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public User(Long id, String login, String hash) {

        this.login = login;
        this.hash = hash;
    }
}
