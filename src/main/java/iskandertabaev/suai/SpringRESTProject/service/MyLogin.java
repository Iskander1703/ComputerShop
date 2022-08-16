package iskandertabaev.suai.SpringRESTProject.service;


import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class MyLogin extends User {

    private static final long serialVersinUID=1L;

    private iskandertabaev.suai.SpringRESTProject.Entity.User user;

    public MyLogin(iskandertabaev.suai.SpringRESTProject.Entity.User user)
    {
        super(user.getLogin(),user.getHash(), AuthorityUtils.createAuthorityList("ALL"));
    }
}
