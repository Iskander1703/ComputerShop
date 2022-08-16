package iskandertabaev.suai.SpringRESTProject.service;


import iskandertabaev.suai.SpringRESTProject.Entity.*;
import iskandertabaev.suai.SpringRESTProject.dao.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private FrameDAO frameDAO;
    @Autowired
    private ramDAO ramDAO;
    @Autowired
    private motherBoardDAO motherBoardDAO;
    @Autowired
    private iskandertabaev.suai.SpringRESTProject.dao.graphicsCardDAO graphicsCardDAO;
    @Autowired
    private powerUnitDAO powerUnitDAO;


    @Override
    @Transactional
    public List<frame> getAllFrames() {
        return frameDAO.getAllFrames();
    }

    @Override
    @Transactional
    public void saveFrame(frame frame) {
        frameDAO.saveFrame(frame);

   }

    @Override
    @Transactional
    public frame getFrame(int id) {
        return frameDAO.getFrame(id);
    }


    @Override
    @Transactional
    public void deleteFrame(int id) {
        frameDAO.deleteFrame(id);
    }

    @Override
    @Transactional
    public List<ram> getAllRams() {
        return ramDAO.getAllRams();
    }

    @Override
    @Transactional
    public ram getRam(int id) {
        return ramDAO.getRam(id);
    }


    @Override
    @Transactional
    public void saveRam(ram ram) {
        ramDAO.saveRam(ram);

    }

    @Override
    @Transactional
    public void deleteRam(int id) {
        ramDAO.deleteRam(id);
    }



    @Override
    @Transactional
    public List<graphicsCard> getAllGraphicsCards() {
       return graphicsCardDAO.getAllGraphicsCard();
    }

    @Override
    @Transactional
    public graphicsCard getGraphicsCard(int id) {
        return graphicsCardDAO.getGraphicsCard(id);
    }

    @Override
    @Transactional
    public void saveGraphicsCard(graphicsCard graphicsCard) {
            graphicsCardDAO.saveGraphicsCard(graphicsCard);
    }

    @Override
    @Transactional
    public void deleteGraphicsCard(int id) {
        graphicsCardDAO.deleteGraphicsCard(id);
    }


    @Override
    @Transactional
    public List<powerUnit> getAllPowerUnits() {
       return powerUnitDAO.getAllPowerUnits();
    }

    @Override
    @Transactional
    public powerUnit getPowerUnit(int id) {
        return powerUnitDAO.getPowerUnit(id);
    }

    @Override
    @Transactional
    public void savePowerUnit(powerUnit powerUnit) {
        powerUnitDAO.savePowerUnit(powerUnit);

    }

    @Override
    @Transactional
    public void deletePowerUnit(int id) {
          powerUnitDAO.deletePowerUnit(id);
    }


    @Override
    @Transactional
    public List<motherBoard> getAllMotherBoards() {
        return motherBoardDAO.getAllMotherBoards();
    }

    @Override
    @Transactional
    public motherBoard getMotherBoard(int id) {
        return motherBoardDAO.getMotherBoard(id);
    }

    @Override
    @Transactional
    public void saveMotherBoard(motherBoard motherBoard) {
               motherBoardDAO.saveMotherBoard(motherBoard);
    }

    @Override
    @Transactional
    public void deleteMotherBoard(int id) {
            motherBoardDAO.deleteMotherBoard(id);
    }
}
