package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.powerUnit;
import iskandertabaev.suai.SpringRESTProject.Entity.ram;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.awt.*;
import java.util.List;

@Repository
public class ramDAOImpl implements ramDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ram> getAllRams() {
        Session session=entityManager.unwrap(Session.class);
        List<ram> allRams=session.createQuery
                ("from ram", ram.class).getResultList();
        return allRams;
    }

    @Override
    public ram getRam(int id) {
        Session session=entityManager.unwrap(Session.class);
        ram ram=session.get(ram.class, id);
        return ram;
    }

    @Override
    public void saveRam(ram ram) {
        Session session=entityManager.unwrap(Session.class);

        session.saveOrUpdate(ram);
    }

    @Override
    public void deleteRam(int id) {
        Session session=entityManager.unwrap(Session.class);
        ram ram= session.get(ram.class,id);
        session.delete(ram);

    }
}