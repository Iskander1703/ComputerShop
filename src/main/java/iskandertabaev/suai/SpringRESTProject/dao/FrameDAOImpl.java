package iskandertabaev.suai.SpringRESTProject.dao;

import iskandertabaev.suai.SpringRESTProject.Entity.frame;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.awt.*;
import java.util.List;

@Repository
public class FrameDAOImpl implements FrameDAO {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<frame> getAllFrames() {
        Session session=entityManager.unwrap(Session.class);
        List<frame> allFrames=session.createQuery
                ("from frame", frame.class).getResultList();
        return allFrames;
    }

    @Override
    public void saveFrame(frame frame) {
        Session session=entityManager.unwrap(Session.class);

        session.saveOrUpdate(frame);
    }

    @Override
    public frame getFrame(int id) {
        Session session=entityManager.unwrap(Session.class);
      frame frame=session.get(frame.class, id);
      return frame;
    }

    @Override
    public void deleteFrame(int id) {
        Session session=entityManager.unwrap(Session.class);
        frame frame1= session.get(frame.class,id);
        session.delete(frame1);

    }
}
