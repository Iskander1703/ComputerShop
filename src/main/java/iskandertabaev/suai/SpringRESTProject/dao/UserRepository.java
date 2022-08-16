package iskandertabaev.suai.SpringRESTProject.dao;


import iskandertabaev.suai.SpringRESTProject.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByLogin(String login);
}
