package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.frame;
import iskandertabaev.suai.SpringRESTProject.Entity.graphicsCard;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.awt.*;
import java.util.List;

@Repository
public class graphicsCardDAOImpl implements graphicsCardDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<graphicsCard> getAllGraphicsCard() {
        Session session=entityManager.unwrap(Session.class);
        List<graphicsCard> allGraphicsCard=session.createQuery
                ("from graphicsCard", graphicsCard.class).getResultList();
        return allGraphicsCard;
    }

    @Override
    public graphicsCard getGraphicsCard(int id) {
        Session session=entityManager.unwrap(Session.class);
        graphicsCard graphicsCard=session.get(graphicsCard.class, id);
        return graphicsCard;
    }

    @Override
    public void saveGraphicsCard(graphicsCard graphicsCard) {
        Session session=entityManager.unwrap(Session.class);

        session.saveOrUpdate(graphicsCard);
    }

    @Override
    public void deleteGraphicsCard(int id) {
        Session session=entityManager.unwrap(Session.class);
        graphicsCard graphicsCard= session.get(graphicsCard.class,id);
        session.delete(graphicsCard);

    }
}