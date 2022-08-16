package iskandertabaev.suai.SpringRESTProject.dao;



import iskandertabaev.suai.SpringRESTProject.Entity.motherBoard;
import iskandertabaev.suai.SpringRESTProject.Entity.powerUnit;
import iskandertabaev.suai.SpringRESTProject.dao.powerUnitDAO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.awt.*;
import java.util.List;

@Repository
public class powerUnitDAOImpl implements powerUnitDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<powerUnit> getAllPowerUnits() {
        Session session=entityManager.unwrap(Session.class);
        List<powerUnit> allPowerUnits=session.createQuery
                ("from powerUnit", powerUnit.class).getResultList();
        return allPowerUnits;
    }

    @Override
    public powerUnit getPowerUnit(int id) {
        Session session=entityManager.unwrap(Session.class);
        powerUnit powerUnit=session.get(powerUnit.class, id);
        return powerUnit;
    }


    @Override
    public void savePowerUnit(powerUnit powerUnit) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(powerUnit);
    }

    @Override
    public void deletePowerUnit(int id) {
        Session session=entityManager.unwrap(Session.class);
        powerUnit powerUnit= session.get(powerUnit.class,id);
        session.delete(powerUnit);

    }
}