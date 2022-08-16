package iskandertabaev.suai.SpringRESTProject.dao;



import iskandertabaev.suai.SpringRESTProject.Entity.graphicsCard;
import iskandertabaev.suai.SpringRESTProject.Entity.motherBoard;
import iskandertabaev.suai.SpringRESTProject.Entity.powerUnit;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.awt.*;
import java.util.List;

@Repository
public class motherBoardDAOImpl implements motherBoardDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<motherBoard> getAllMotherBoards() {
        Session session=entityManager.unwrap(Session.class);
        List<motherBoard> allMotherBoards=session.createQuery
                ("from motherBoard", motherBoard.class).getResultList();
        return allMotherBoards;
    }

    @Override
    public motherBoard getMotherBoard(int id) {
        Session session=entityManager.unwrap(Session.class);
        motherBoard motherBoard=session.get(motherBoard.class, id);
        return motherBoard;
    }

    @Override
    public void saveMotherBoard(motherBoard motherBoard) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(motherBoard);
    }

    @Override
    public void deleteMotherBoard(int id) {
        Session session=entityManager.unwrap(Session.class);
        motherBoard motherBoard= session.get(motherBoard.class,id);
        session.delete(motherBoard);

    }
}